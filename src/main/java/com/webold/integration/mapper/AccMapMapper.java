package com.webold.integration.mapper;


import com.webold.crud.mapper.GeneralMapper;
import com.webold.integration.domain.entity.AccMap;
import com.webold.integration.domain.view.accmap.AccMapReqVM;
import com.webold.integration.domain.view.accmap.AccMapResVM;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public abstract class AccMapMapper extends GeneralMapper<AccMap, AccMapReqVM, AccMapResVM> {
}
