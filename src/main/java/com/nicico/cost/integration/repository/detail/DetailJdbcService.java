package com.nicico.cost.integration.repository.detail;

import com.nicico.cost.framework.packages.crud.view.Keyword;
import com.nicico.cost.framework.packages.crud.view.Sort;
import com.nicico.cost.integration.domain.entity.Detail;
import com.nicico.cost.integration.domain.entity.DetailType;
import com.nicico.cost.jdbcclient.service.impl.JdbcServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DetailJdbcService extends JdbcServiceImpl<Detail, Long> {
    private final DetailRepository detailRepository;

    public List<Detail> findAllByDetailTypes(@NotNull DetailType detailType) {
        return detailRepository.findAllByDetailTypes(detailType);
    }

    public List<Detail> findAllByDetailTypes(@NotNull DetailType detailType,List<Sort> sorts) {
        return detailRepository.findAllByDetailTypes(detailType);
    }

    public Page<Detail> findAllByDetailTypes(@NotNull DetailType detailType, int page, int pageSize) {
        Pageable pagination = pagination(page, pageSize);
        return detailRepository.findAllByDetailTypes(detailType, pagination);
    }

    public List<Detail> findAllByDetailTypesAndParentDetailIs(DetailType detailType, Detail detail) {
        return detailRepository.findAllByDetailTypesAndParentDetailIs(detailType, detail);
    }

    public Page<Detail> findAllByDetailTypesAndParentDetailIs(DetailType detailType, Detail detail, int page, int pageSize) {
        Pageable pagination = pagination(page, pageSize);
        return detailRepository.findAllByDetailTypesAndParentDetailIs(detailType, detail, pagination);
    }


    public Pageable pagination(int page, int pageSize, List<Sort> sorts) {
        List<org.springframework.data.domain.Sort.Order> orders = new ArrayList<>();
        for (Sort sort : sorts) {
            if (Boolean.TRUE.equals(sort.getKeyword().equals(Keyword.DESC)))
                orders.add(org.springframework.data.domain.Sort.Order.desc(sort.getField()));
            else
                orders.add(org.springframework.data.domain.Sort.Order.asc(sort.getField()));
        }
        return PageRequest.of(page - 1, pageSize, org.springframework.data.domain.Sort.by(orders));
    }


}
