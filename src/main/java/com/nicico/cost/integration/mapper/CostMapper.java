package com.nicico.cost.integration.mapper;

import com.nicico.cost.crud.mapper.GeneralMapper;
import com.nicico.cost.integration.domain.entity.Cost;
import com.nicico.cost.integration.domain.view.cost.CostReqVM;
import com.nicico.cost.integration.domain.view.cost.CostResVM;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public abstract class CostMapper extends GeneralMapper<Cost, CostReqVM, CostResVM> {
}
