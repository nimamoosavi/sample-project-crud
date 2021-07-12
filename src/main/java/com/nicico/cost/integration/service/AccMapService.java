package com.nicico.cost.integration.service;


import com.nicico.cost.crud.service.GeneralService;
import com.nicico.cost.framework.domain.dto.BaseDTO;
import com.nicico.cost.integration.domain.view.accmap.AccMapDetailType;
import com.nicico.cost.integration.domain.view.accmap.AccMapReqVM;
import com.nicico.cost.integration.domain.view.accmap.AccMapResVM;
import com.nicico.cost.integration.domain.view.accmap.AccMapValidate;

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
