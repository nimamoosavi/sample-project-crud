package com.nicico.cost.integration.mapper;

import com.nicico.cost.crud.mapper.GeneralMapper;
import com.nicico.cost.integration.domain.entity.DetailType;
import com.nicico.cost.integration.domain.view.detailtype.DetailTypeReqVM;
import com.nicico.cost.integration.domain.view.detailtype.DetailTypeResVM;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public abstract class DetailTypeMapper extends GeneralMapper<DetailType, DetailTypeReqVM, DetailTypeResVM> {
}
