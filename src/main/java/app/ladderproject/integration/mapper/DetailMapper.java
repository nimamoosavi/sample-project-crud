package app.ladderproject.integration.mapper;

import app.ladderproject.crud.mapper.GeneralMapper;
import app.ladderproject.integration.domain.entity.Detail;
import app.ladderproject.integration.domain.view.detail.DetailReqVM;
import app.ladderproject.integration.domain.view.detail.DetailResVM;
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
