package com.nicico.cost.integration.service;

import com.nicico.cost.crud.service.GeneralService;
import com.nicico.cost.framework.domain.dto.BaseDTO;
import com.nicico.cost.integration.domain.entity.CostType;
import com.nicico.cost.integration.domain.view.costtype.CostTypeReqVM;
import com.nicico.cost.integration.domain.view.costtype.CostTypeResVM;
import com.nicico.cost.integration.repository.costtype.CostTypeJdbcService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.List;

import static com.nicico.cost.framework.enums.exception.ExceptionEnum.NOTFOUND;

@Service
@RequiredArgsConstructor
public class CostTypeService extends GeneralService<CostType, CostTypeReqVM, CostTypeResVM, Long> {

    private final CostTypeJdbcService costTypeJdbcService;

    public BaseDTO<CostTypeResVM> findByCode(@NotNull String code) {
        CostType costType = costTypeJdbcService.findByCode(code);
        return generalMapper.mapBaseObjectToResponse(costType);
    }

    public BaseDTO<List<CostTypeResVM>> findAllByParentId(@NotNull Long parentId) {
        CostType parent = costTypeJdbcService.findById(parentId).orElseThrow(
                () -> applicationException.createApplicationException(NOTFOUND, HttpStatus.NOT_FOUND)
        );
        List<CostType> all = costTypeJdbcService.findAllByParent(parent);
        return generalMapper.mapListBaseObjectToResponse(all);
    }

    public BaseDTO<List<CostTypeResVM>> findAllByParentCode(@NotNull String code) {
        CostType costType = costTypeJdbcService.findByCode(code);
        List<CostType> all = costTypeJdbcService.findAllByParent(costType);
        return generalMapper.mapListBaseObjectToResponse(all);
    }


    public BaseDTO<List<CostTypeResVM>> findAllParents() {
        List<CostType> parent = costTypeJdbcService.findAllParent();
        return generalMapper.mapListBaseObjectToResponse(parent);
    }
}
