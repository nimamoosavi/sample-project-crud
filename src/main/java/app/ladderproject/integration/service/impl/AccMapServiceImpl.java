package app.ladderproject.integration.service.impl;

import app.ladderproject.core.domain.dto.BaseDTO;
import app.ladderproject.crud.service.impl.GeneralServiceImpl;
import app.ladderproject.integration.exception.IntegrationException;
import app.ladderproject.integration.repository.accmap.AccMapJdbcService;
import app.ladderproject.integration.domain.entity.AccMap;
import app.ladderproject.integration.domain.view.accmap.AccMapDetailType;
import app.ladderproject.integration.domain.view.accmap.AccMapReqVM;
import app.ladderproject.integration.domain.view.accmap.AccMapResVM;
import app.ladderproject.integration.domain.view.accmap.AccMapValidate;
import app.ladderproject.integration.domain.view.detail.DetailResVM;
import app.ladderproject.integration.service.AccMapService;
import app.ladderproject.integration.service.DetailService;
import app.ladderproject.integration.service.DetailTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static app.ladderproject.core.enums.exception.ExceptionEnum.NOTFOUND;
import static app.ladderproject.core.service.GeneralResponse.successCustomResponse;

@Service
@RequiredArgsConstructor
class AccMapServiceImpl extends GeneralServiceImpl<AccMap, AccMapReqVM, AccMapResVM, Long> implements AccMapService {

    private final AccMapJdbcService accMapJdbcService;
    private final DetailTypeService detailTypeService;
    private final DetailService detailService;


    @Override
    public BaseDTO<AccMapResVM> mapDetailTypeToAcc(AccMapDetailType mapDetailType) {
        AccMap accMap = accMapJdbcService.findById(mapDetailType.getAccMapId()).orElseThrow(
                () -> applicationException.createApplicationException(NOTFOUND, HttpStatus.NOT_FOUND)
        );
        if (mapDetailType.getDetailTypeId() != null) {
            if (Boolean.TRUE.equals(detailTypeService.existsById(mapDetailType.getDetailTypeId()).getData()))
                accMap.setDetailTypeId(mapDetailType.getDetailTypeId());
            else
                throw applicationException.createApplicationException(IntegrationException.DETAIL_TYPE_NOT_FOUND, HttpStatus.NOT_FOUND);
        } else
            accMap.setDetailTypeId(null);
        AccMap map = accMapJdbcService.save(accMap);
        return generalMapper.mapBaseObjectToResponse(map);
    }

    @Override
    public BaseDTO<List<AccMapResVM>> mapAllDetailTypeToAcc(List<AccMapDetailType> mapDetailTypes) {
        List<AccMap> accMaps = new ArrayList<>();
        for (AccMapDetailType mapDetailType : mapDetailTypes) {
            AccMap accMap = accMapJdbcService.findById(mapDetailType.getAccMapId()).orElseThrow(
                    () -> applicationException.createApplicationException(NOTFOUND, HttpStatus.NOT_FOUND)
            );
            if (mapDetailType.getDetailTypeId() != null) {
                if (Boolean.TRUE.equals(detailTypeService.existsById(mapDetailType.getDetailTypeId()).getData()))
                    accMap.setDetailTypeId(mapDetailType.getDetailTypeId());
                else
                    throw applicationException.createApplicationException(IntegrationException.DETAIL_TYPE_NOT_FOUND, HttpStatus.NOT_FOUND);
            } else
                accMap.setDetailTypeId(null);
            accMap.setDetailTypeId(mapDetailType.getDetailTypeId());
            accMaps.add(accMap);
        }
        List<AccMap> accMapList = accMapJdbcService.saveAll(accMaps);
        return generalMapper.mapListBaseObjectToResponse(accMapList);
    }

    @Override
    public BaseDTO<AccMapResVM> validateAccMapDetail(AccMapValidate accMapValidate) {
        AccMap accMap = accMapJdbcService.findById(accMapValidate.getAccId()).orElseThrow(
                () -> applicationException.createApplicationException(NOTFOUND, HttpStatus.NOT_FOUND)
        );
        DetailResVM detailResVM = detailService.findById(accMapValidate.getDetailId()).getData();
        boolean match = detailResVM.getDetailTypeResVMS().stream().anyMatch(detailTypeResVM -> Boolean.TRUE.equals(detailTypeResVM.getId().equals(accMap.getDetailTypeId())));
        if (match)
            return successCustomResponse(generalMapper.toResponseModel(accMap));
        else
            throw applicationException.createApplicationException(IntegrationException.DETAIL_TYPE_NOT_FOUND, HttpStatus.NOT_FOUND);
    }
}
