package com.nicico.cost.integration.repository.costtype;

import com.nicico.cost.integration.domain.entity.CostType;
import com.nicico.cost.jdbcclient.service.impl.JdbcServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;

@Service
@RequiredArgsConstructor
public class CostTypeJdbcService extends JdbcServiceImpl<CostType, Long> {
    private final CostTypeRepository costTypeRepository;


    public CostType findByCode(@NotNull String code) {
        return costTypeRepository.findByCode(code);
    }

}
