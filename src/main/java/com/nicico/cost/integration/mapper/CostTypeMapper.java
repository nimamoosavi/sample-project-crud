package com.nicico.cost.integration.mapper;

import com.nicico.cost.crud.mapper.GeneralMapper;
import com.nicico.cost.integration.domain.entity.CostType;
import com.nicico.cost.integration.domain.view.request.CostTypeReqVM;
import com.nicico.cost.integration.domain.view.response.CostTypeResVM;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public abstract class CostTypeMapper extends GeneralMapper<CostType, CostTypeReqVM, CostTypeResVM> {
}
