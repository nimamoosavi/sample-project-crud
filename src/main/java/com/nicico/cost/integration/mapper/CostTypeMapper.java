package com.nicico.cost.integration.mapper;

import com.nicico.cost.crud.mapper.GeneralMapper;
import com.nicico.cost.integration.domain.entity.CostType;
import com.nicico.cost.integration.domain.view.costtype.CostTypeReqVM;
import com.nicico.cost.integration.domain.view.costtype.CostTypeResVM;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public abstract class CostTypeMapper extends GeneralMapper<CostType, CostTypeReqVM, CostTypeResVM> {
    @AfterMapping
    public void afterMappingRequestToBaseObject(@MappingTarget CostType costType, CostTypeReqVM target) {
        if (target.getParentId() != null) {
            CostType parent = new CostType();
            parent.setId(target.getParentId());
            costType.setParent(parent);
        }
    }

    @AfterMapping
    public void afterMappingBaseObjectToResponse(@MappingTarget CostTypeResVM costTypeResVM, CostType target) {
        if (target.getParent() != null)
            costTypeResVM.setParentId(target.getParent().getId());
    }
}
