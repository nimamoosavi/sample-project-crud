package com.webold.integration.service.impl;

import com.webold.crud.service.impl.GeneralServiceImpl;
import com.webold.framework.domain.dto.BaseDTO;
import com.webold.integration.domain.entity.AccMap;
import com.webold.integration.domain.view.accmap.AccMapDetailType;
import com.webold.integration.domain.view.accmap.AccMapReqVM;
import com.webold.integration.domain.view.accmap.AccMapResVM;
import com.webold.integration.domain.view.accmap.AccMapValidate;
import com.webold.integration.domain.view.detail.DetailResVM;
import com.webold.integration.repository.accmap.AccMapJdbcService;
import com.webold.integration.service.AccMapService;
import com.webold.integration.service.DetailService;
import com.webold.integration.service.DetailTypeService;
import com.webold.integration.exception.IntegrationException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.webold.framework.enums.exception.ExceptionEnum.NOTFOUND;
import static com.webold.framework.service.GeneralResponse.successCustomResponse;

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
