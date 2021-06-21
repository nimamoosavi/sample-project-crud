package com.nicico.cost.integration.controller;

import com.nicico.cost.crud.controller.BaseController;
import com.nicico.cost.framework.anotations.Unauthorized;
import com.nicico.cost.framework.domain.dto.BaseDTO;
import com.nicico.cost.framework.enums.authorize.HttpRequestType;
import com.nicico.cost.integration.domain.view.detailtype.DetailTypeReqVM;
import com.nicico.cost.integration.domain.view.detailtype.DetailTypeResVM;
import io.swagger.annotations.Api;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rest/integration/v1/detail-type")
@Api(value = "detail-type", protocols = "HTTP")
@SwaggerDefinition(tags = {@Tag(name = "detail-type", description = "سرویس مدیریت اطلاعات تایپ حسابداری")})
@Unauthorized(types = {HttpRequestType.POST, HttpRequestType.DELETE, HttpRequestType.PUT})
public class DetailTypeController extends BaseController<DetailTypeReqVM, DetailTypeResVM, Long> {
    @Override
    public ResponseEntity<BaseDTO<DetailTypeResVM>> create(DetailTypeReqVM detailTypeReqVM) {
        return super.create(detailTypeReqVM);
    }

    @Override
    public ResponseEntity<BaseDTO<DetailTypeResVM>> update(DetailTypeReqVM detailTypeReqVM) {
        return super.update(detailTypeReqVM);
    }

    @Override
    public ResponseEntity<BaseDTO<Boolean>> deleteById(Long id) {
        return super.deleteById(id);
    }
}
