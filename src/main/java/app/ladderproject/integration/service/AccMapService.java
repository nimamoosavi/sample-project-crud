package app.ladderproject.integration.service;


import app.ladderproject.core.domain.dto.BaseDTO;
import app.ladderproject.crud.service.GeneralService;
import app.ladderproject.integration.domain.view.accmap.AccMapDetailType;
import app.ladderproject.integration.domain.view.accmap.AccMapReqVM;
import app.ladderproject.integration.domain.view.accmap.AccMapResVM;
import app.ladderproject.integration.domain.view.accmap.AccMapValidate;

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
