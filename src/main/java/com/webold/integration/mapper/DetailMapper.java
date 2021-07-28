package com.webold.integration.mapper;

import com.webold.crud.mapper.GeneralMapper;
import com.webold.integration.domain.entity.Detail;
import com.webold.integration.domain.view.detail.DetailReqVM;
import com.webold.integration.domain.view.detail.DetailResVM;
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
    public void afterMappingBaseObjectToResponseModel(@MappingTarget DetailResVM detailResVM, Detail source) {
        if (source.getParentDetail() != null)
            detailResVM.setParentId(source.getParentDetail().getId());
        if (!source.getDetailTypes().isEmpty())
            detailResVM.setDetailTypeResVMS(detailTypeMapper.mapListBaseObjectToResponse(source.getDetailTypes()).getData());
    }
}
