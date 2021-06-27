package com.nicico.cost.integration.controller;

import com.nicico.cost.integration.domain.view.detail.DetailReqVM;
import com.nicico.cost.integration.domain.view.detail.DetailResVM;
import com.nicico.cost.tree.controller.TreeController;
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
