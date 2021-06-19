package com.nicico.cost.integration.repository.costtype;

import com.nicico.cost.framework.service.exception.ApplicationException;
import com.nicico.cost.framework.service.exception.ServiceException;
import com.nicico.cost.integration.domain.entity.CostType;
import com.nicico.cost.jdbcclient.service.impl.JdbcServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.List;

import static com.nicico.cost.framework.enums.exception.ExceptionEnum.NOTFOUND;


@Service
@RequiredArgsConstructor
public class CostTypeJdbcService extends JdbcServiceImpl<CostType, Long> {
    private final CostTypeRepository costTypeRepository;
    private final ApplicationException<ServiceException> applicationException;


    public CostType findByCode(@NotNull String code) {
        return costTypeRepository.findByCode(code).orElseThrow(
                () -> applicationException.createApplicationException(NOTFOUND, HttpStatus.NOT_FOUND)
        );
    }

    public List<CostType> findAllByParent(@NotNull CostType parent) {
        return costTypeRepository.findAllByParent(parent);
    }

    public List<CostType> findAllParent() {
        return costTypeRepository.findAllByParentIsNull();
    }
}
