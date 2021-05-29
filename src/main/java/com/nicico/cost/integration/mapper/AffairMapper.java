package com.nicico.cost.integration.mapper;


import com.nicico.cost.crud.mapper.GeneralMapper;
import com.nicico.cost.integration.domain.entity.Affair;
import com.nicico.cost.integration.domain.view.request.AffairReqVM;
import com.nicico.cost.integration.domain.view.response.AffairResVM;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public abstract class AffairMapper extends GeneralMapper<Affair, AffairReqVM, AffairResVM, Long> {
}
