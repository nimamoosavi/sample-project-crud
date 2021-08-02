package app.ladderproject.integration.mapper;

import app.ladderproject.crud.mapper.GeneralMapper;
import app.ladderproject.integration.repository.detailtype.DetailTypeJdbcService;
import com.webold.framework.service.exception.ApplicationException;
import com.webold.framework.service.exception.ServiceException;
import app.ladderproject.integration.domain.entity.DetailType;
import app.ladderproject.integration.domain.view.detailtype.DetailTypeReqVM;
import app.ladderproject.integration.domain.view.detailtype.DetailTypeResVM;
import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import static com.webold.framework.enums.exception.ExceptionEnum.NOTFOUND;

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
