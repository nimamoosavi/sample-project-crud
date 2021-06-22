package com.nicico.cost.integration.mapper;

import com.nicico.cost.crud.mapper.GeneralMapper;
import com.nicico.cost.framework.service.exception.ApplicationException;
import com.nicico.cost.framework.service.exception.ServiceException;
import com.nicico.cost.integration.domain.entity.DetailType;
import com.nicico.cost.integration.domain.view.detailtype.DetailTypeReqVM;
import com.nicico.cost.integration.domain.view.detailtype.DetailTypeResVM;
import com.nicico.cost.integration.repository.detailtype.DetailTypeJdbcService;
import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import static com.nicico.cost.framework.enums.exception.ExceptionEnum.NOTFOUND;

@Mapper(componentModel = "spring")
@Component
public abstract class DetailTypeMapper extends GeneralMapper<DetailType, DetailTypeReqVM, DetailTypeResVM> {

    @Autowired
    DetailTypeJdbcService detailTypeJdbcService;
    @Autowired
    ApplicationException<ServiceException> applicationException;

    public DetailType findById(long id) {
        return detailTypeJdbcService.findById(id).orElseThrow(
                () -> applicationException.createApplicationException(NOTFOUND, HttpStatus.NOT_FOUND)
        );
    }

}
