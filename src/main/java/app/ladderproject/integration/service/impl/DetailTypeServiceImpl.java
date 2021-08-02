package app.ladderproject.integration.service.impl;

import app.ladderproject.crud.service.impl.GeneralServiceImpl;
import com.webold.framework.anotations.Unauthorized;
import com.webold.framework.domain.dto.BaseDTO;
import app.ladderproject.integration.domain.entity.DetailType;
import app.ladderproject.integration.domain.view.detailtype.DetailTypeReqVM;
import app.ladderproject.integration.domain.view.detailtype.DetailTypeResVM;
import app.ladderproject.integration.service.DetailTypeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class DetailTypeServiceImpl extends GeneralServiceImpl<DetailType, DetailTypeReqVM, DetailTypeResVM, Long> implements DetailTypeService {

    @Override
    @Unauthorized
    public BaseDTO<DetailTypeResVM> save(DetailTypeReqVM detailTypeReqVM) {
        return super.save(detailTypeReqVM);
    }

    @Override
    @Unauthorized
    public BaseDTO<List<DetailTypeResVM>> saveAll(List<DetailTypeReqVM> detailTypeReqVMS) {
        return super.saveAll(detailTypeReqVMS);
    }

    @Override
    @Unauthorized
    public BaseDTO<DetailTypeResVM> update(DetailTypeReqVM detailTypeReqVM) {
        return super.update(detailTypeReqVM);
    }

    @Override
    @Unauthorized
    public BaseDTO<Boolean> deleteById(Long id) {
        return super.deleteById(id);
    }
}
