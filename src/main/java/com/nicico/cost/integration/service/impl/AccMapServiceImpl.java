package com.nicico.cost.integration.service.impl;

import com.nicico.cost.crud.service.impl.GeneralServiceImpl;
import com.nicico.cost.framework.domain.dto.BaseDTO;
import com.nicico.cost.integration.domain.entity.AccMap;
import com.nicico.cost.integration.domain.view.accmap.AccMapDetailType;
import com.nicico.cost.integration.domain.view.accmap.AccMapReqVM;
import com.nicico.cost.integration.domain.view.accmap.AccMapResVM;
import com.nicico.cost.integration.domain.view.accmap.AccMapValidate;
import com.nicico.cost.integration.domain.view.detail.DetailResVM;
import com.nicico.cost.integration.repository.accmap.AccMapJdbcService;
import com.nicico.cost.integration.service.AccMapService;
import com.nicico.cost.integration.service.DetailService;
import com.nicico.cost.integration.service.DetailTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.nicico.cost.framework.enums.exception.ExceptionEnum.NOTFOUND;
import static com.nicico.cost.framework.service.GeneralResponse.successCustomResponse;
import static com.nicico.cost.integration.exception.IntegrationException.DETAIL_TYPE_NOT_FOUND;

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
        if (Boolean.TRUE.equals(detailTypeService.existsById(mapDetailType.getDetailTypeId()).getData()))
            accMap.setDetailTypeId(mapDetailType.getDetailTypeId());
        else
            throw applicationException.createApplicationException(DETAIL_TYPE_NOT_FOUND, HttpStatus.NOT_FOUND);
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
            if (Boolean.TRUE.equals(detailTypeService.existsById(mapDetailType.getDetailTypeId()).getData()))
                accMap.setDetailTypeId(mapDetailType.getDetailTypeId());
            else
                throw applicationException.createApplicationException(DETAIL_TYPE_NOT_FOUND, HttpStatus.NOT_FOUND);
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
        else throw applicationException.createApplicationException(DETAIL_TYPE_NOT_FOUND, HttpStatus.NOT_FOUND);
    }
}
