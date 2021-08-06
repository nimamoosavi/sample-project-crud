package app.ladderproject.sample.controller;

import app.ladderproject.core.anotations.Unauthorized;
import app.ladderproject.core.anotations.Warnings;
import app.ladderproject.core.domain.dto.BaseDTO;
import app.ladderproject.core.enums.warn.Warning;
import app.ladderproject.crud.controller.BaseController;
import app.ladderproject.sample.domain.view.userinfo.UserInfoReqVM;
import app.ladderproject.sample.domain.view.userinfo.UserInfoResVM;
import app.ladderproject.sample.service.UserInfoService;
import io.swagger.annotations.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static app.ladderproject.core.config.general.GeneralStatic.*;

/**
 * @apiNote in core project and all Project that join to core we have some properties that you can change
 * response text and exception to your custom language in this sample project change core-exception.properties file
 * to english, and you can change warning-core.properties and all other properties to your custom language
 * If you used this ladder project , our pleasure to star our project and fork of that in our GitHub
 * {@link https://github.com/nimamoosavi/core}
 * Thanks a lot
 * @author nima
 */
@RestController
@RequestMapping(value = "/rest/sample/v1/user-info")
@Api(value = "sample", protocols = "HTTP")
@SwaggerDefinition(tags = {@Tag(name = "sample", description = "the user-info management Service")})
@RequiredArgsConstructor
public class UserInfoController extends BaseController<UserInfoReqVM, UserInfoResVM, Long> {

    private final UserInfoService userInfoService;

    /**
     *
     * @param name the name that you want to find
     * @return ResponseEntity<BaseDTO<UserInfoResVM>>
     * @apiNote this controller ,Service,Repository Layer create for example and learn how to
     * add new api to Crud Project and Core and ... you can use findByQuery in Crud project and find your name and etc
     * we hope full all api that creat in base Controller solve in 90% in all project but if you want
     * to create your own api you can do it
     */
    @ApiImplicitParams({@ApiImplicitParam(name = AUTHORIZATION, value = AUTHORIZATION, required = true, dataType = "string", paramType = "header"),
            @ApiImplicitParam(name = CORRELATION_ID, value = CORRELATION_ID, required = true, dataType = "string", paramType = "header"),
            @ApiImplicitParam(name = CLIENT_VERSION, value = CLIENT_VERSION, required = true, dataType = "string", paramType = "header")})
    @GetMapping("/findByName")
    public ResponseEntity<BaseDTO<UserInfoResVM>> findByName(@RequestParam String name) {
        BaseDTO<UserInfoResVM> userInfoServiceByName = userInfoService.findByName(name);
        return ResponseEntity.ok(userInfoServiceByName);
    }

    /**
     *
     * @param id is your IncrementalId of DataBase
     * @return ResponseEntity<BaseDTO<Boolean>>
     * @apiNote @Unauthorized used for Unauthorized api
     */
    @Override
    @Unauthorized
    public ResponseEntity<BaseDTO<Boolean>> deleteById(Long id) {
        return super.deleteById(id);
    }

    /**
     *
     * @param id is your IncrementalId of DataBase
     * @return ResponseEntity<BaseDTO<Boolean>>
     * @apiNote @Warnings used for create warning to response
     */
    @Override
    @Warnings(warnings = Warning.DEPRECATED)
    public ResponseEntity<BaseDTO<UserInfoResVM>> findByID(Long id) {
        return super.findByID(id);
    }
}
