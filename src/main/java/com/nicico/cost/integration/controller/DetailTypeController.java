package com.nicico.cost.integration.controller;

import com.nicico.cost.crud.controller.BaseController;
import com.nicico.cost.integration.domain.view.detailtype.DetailTypeReqVM;
import com.nicico.cost.integration.domain.view.detailtype.DetailTypeResVM;
import io.swagger.annotations.Api;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rest/integration/v1/detail-type")
@Api(value = "detail-type", protocols = "HTTP")
@SwaggerDefinition(tags = {@Tag(name = "detail-type", description = "سرویس مدیریت اطلاعات تایپ حسابداری")})
@RequiredArgsConstructor
public class DetailTypeController extends BaseController<DetailTypeReqVM, DetailTypeResVM, Long> {
}
