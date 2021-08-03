package app.ladderproject.integration.service.impl;

import app.ladderproject.core.anotations.Unauthorized;
import app.ladderproject.core.domain.dto.BaseDTO;
import app.ladderproject.crud.service.impl.TreeServiceImpl;
import app.ladderproject.integration.domain.entity.Detail;
import app.ladderproject.integration.domain.view.detail.DetailReqVM;
import app.ladderproject.integration.domain.view.detail.DetailResVM;
import app.ladderproject.integration.service.DetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
class DetailServiceImpl extends TreeServiceImpl<Detail, DetailReqVM, DetailResVM, Long> implements DetailService {

    @Override
    @Unauthorized
    public BaseDTO<DetailResVM> save(DetailReqVM detailReqVM) {
        return super.save(detailReqVM);
    }

    @Override
    @Unauthorized
    public BaseDTO<List<DetailResVM>> saveAll(List<DetailReqVM> detailReqVMS) {
        return super.saveAll(detailReqVMS);
    }

    @Override
    @Unauthorized
    public BaseDTO<DetailResVM> update(DetailReqVM detailReqVM) {
        return super.update(detailReqVM);
    }

    @Override
    @Unauthorized
    public BaseDTO<Boolean> deleteById(Long id) {
        return super.deleteById(id);
    }
}
