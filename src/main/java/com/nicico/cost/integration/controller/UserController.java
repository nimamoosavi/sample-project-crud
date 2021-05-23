package com.nicico.cost.integration.controller;

import com.nicico.cost.crud.controller.BaseController;
import com.nicico.cost.integration.domain.entity.User;
import com.nicico.cost.integration.domain.view.request.UserReqVM;
import com.nicico.cost.integration.domain.view.response.UserResVM;
import io.swagger.annotations.Api;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rest/v1/user-management/user")
@Api(value = "UserManagement", protocols = "HTTP")
@SwaggerDefinition(tags = {@Tag(name = "UserManagement", description = "سرویس مدیریت کاربران")})
@RequiredArgsConstructor
public class UserController extends BaseController<User, UserReqVM, UserResVM, Long> {
}
