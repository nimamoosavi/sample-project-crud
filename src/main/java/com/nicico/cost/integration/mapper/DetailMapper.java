package com.nicico.cost.integration.mapper;

import com.nicico.cost.crud.mapper.GeneralMapper;
import com.nicico.cost.integration.domain.entity.Detail;
import com.nicico.cost.integration.domain.view.detail.DetailReqVM;
import com.nicico.cost.integration.domain.view.detail.DetailResVM;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public abstract class DetailMapper extends GeneralMapper<Detail, DetailReqVM, DetailResVM> {

    @Autowired
    DetailTypeMapper detailTypeMapper;
    @Autowired
    DepartmentMapper departmentMapper;

    @AfterMapping
    public void afterMappingBaseObjectToResponseModel(@MappingTarget DetailResVM detailResVM, Detail target) {
        if (target.getParentDetail() != null)
            detailResVM.setParentDetailId(target.getParentDetail().getId());
        if (!target.getDetailTypes().isEmpty())
            detailResVM.setDetailTypeResVMS(detailTypeMapper.mapListBaseObjectToResponse(target.getDetailTypes()).getData());
    }
}
