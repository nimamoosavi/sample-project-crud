package com.nicico.cost.integration.mapper;

import com.nicico.cost.integration.domain.entity.Detail;
import com.nicico.cost.integration.domain.view.detail.DetailReqVM;
import com.nicico.cost.integration.domain.view.detail.DetailResVM;
import com.nicico.cost.tree.mapper.TreeMapper;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public abstract class DetailMapper extends TreeMapper<Detail, DetailReqVM, DetailResVM,Long> {

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
