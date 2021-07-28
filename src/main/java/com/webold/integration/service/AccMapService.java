package com.webold.integration.service;


import com.webold.crud.service.GeneralService;
import com.webold.framework.domain.dto.BaseDTO;
import com.webold.integration.domain.view.accmap.AccMapDetailType;
import com.webold.integration.domain.view.accmap.AccMapReqVM;
import com.webold.integration.domain.view.accmap.AccMapResVM;
import com.webold.integration.domain.view.accmap.AccMapValidate;

import java.util.List;

public interface AccMapService extends GeneralService<AccMapReqVM, AccMapResVM, Long> {

    /**
     *
     * @param mapDetailType the object that mapped to acc map entity
     * @return BaseDTO<AccMapResVM>
     */
    BaseDTO<AccMapResVM> mapDetailTypeToAcc(AccMapDetailType mapDetailType);

    /**
     * @apiNote This method has cost for calling
     */
    BaseDTO<List<AccMapResVM>> mapAllDetailTypeToAcc(List<AccMapDetailType> mapDetailTypes);

    BaseDTO<AccMapResVM> validateAccMapDetail(AccMapValidate accMapValidate);

}
