package com.nicico.cost.integration.mapper;


import com.nicico.cost.crud.mapper.GeneralMapper;
import com.nicico.cost.integration.domain.entity.User;
import com.nicico.cost.integration.domain.view.request.UserReqVM;
import com.nicico.cost.integration.domain.view.response.UserResVM;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public abstract class UserMapper extends GeneralMapper<User, UserReqVM, UserResVM, Long> {
}
