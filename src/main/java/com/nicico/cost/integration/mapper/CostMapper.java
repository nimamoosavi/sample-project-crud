package com.nicico.cost.integration.mapper;

import com.nicico.cost.crud.mapper.GeneralMapper;
import com.nicico.cost.integration.domain.entity.Cost;
import com.nicico.cost.integration.domain.view.cost.CostReqVM;
import com.nicico.cost.integration.domain.view.cost.CostResVM;
import com.nicico.cost.integration.domain.view.formfield.FormFieldsResVM;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper(componentModel = "spring")
@Component
public abstract class CostMapper extends GeneralMapper<Cost, CostReqVM, CostResVM> {

    @Autowired
    FormFieldsMapper formFieldsMapper;


    @AfterMapping
    public void afterMappingBaseObjectToResponseModel(@MappingTarget CostResVM costResVM, Cost source) {
        if (source.getFields() != null && !source.getFields().isEmpty()) {
            List<FormFieldsResVM> data = formFieldsMapper.mapListBaseObjectToResponse(source.getFields()).getData();
            costResVM.setFieldsResVMList(data);
        }
    }
}
