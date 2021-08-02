package app.ladderproject.integration.controller;

import app.ladderproject.integration.domain.view.detail.DetailReqVM;
import app.ladderproject.integration.domain.view.detail.DetailResVM;
import app.ladderproject.crud.controller.TreeController;
import io.swagger.annotations.Api;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rest/integration/v1/detail")
@Api(value = "detail", protocols = "HTTP")
@SwaggerDefinition(tags = {@Tag(name = "detail", description = "سرویس مدیریت اطلاعات تفضیلی")})
@RequiredArgsConstructor
public class DetailController extends TreeController<DetailReqVM, DetailResVM, Long> {
}
