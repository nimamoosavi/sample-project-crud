package com.nicico.cost.integration.mapper;


import com.nicico.cost.crud.mapper.GeneralMapper;
import com.nicico.cost.integration.domain.entity.AccMap;
import com.nicico.cost.integration.domain.entity.DetailType;
import com.nicico.cost.integration.domain.view.accmap.AccMapReqVM;
import com.nicico.cost.integration.domain.view.accmap.AccMapResVM;
import org.mapstruct.AfterMapping;
import org.mapstruct.BeforeMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public abstract class AccMapMapper extends GeneralMapper<AccMap, AccMapReqVM, AccMapResVM> {

    @Autowired
    DetailTypeMapper detailTypeMapper;


    @AfterMapping
    public void afterMappingBaseObjectToResponseModel(@MappingTarget AccMapResVM accMapResVM, AccMap target) {
        if (target.getDetailType() != null)
            accMapResVM.setDetailTypeResVM(detailTypeMapper.mapBaseObjectToResponse(target.getDetailType()).getData());
    }


    @BeforeMapping
    public void beforeMappingRequestToEntity(@MappingTarget AccMap accMap, AccMapReqVM source) {
       if (source.getDetailTypeId()!=null){
           DetailType detailType = detailTypeMapper.findById(source.getDetailTypeId());
           accMap.setDetailType(detailType);
       }
    }
}
