package app.ladderproject.sample.controller;

import app.ladderproject.crud.controller.BaseController;
import app.ladderproject.sample.domain.view.user.UserReqVM;
import app.ladderproject.sample.domain.view.user.UserResVM;
import io.swagger.annotations.Api;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/rest/sample/v1/user")
@Api(value = "sample", protocols = "HTTP")
@SwaggerDefinition(tags = {@Tag(name = "sample", description = "the user management Service")})
public class UserController extends BaseController<UserReqVM, UserResVM, Long> {

}
