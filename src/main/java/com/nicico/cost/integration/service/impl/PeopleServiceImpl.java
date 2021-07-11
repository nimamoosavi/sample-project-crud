package com.nicico.cost.integration.service.impl;

import com.nicico.cost.crud.service.impl.GeneralServiceImpl;
import com.nicico.cost.framework.anotations.Unauthorized;
import com.nicico.cost.framework.domain.dto.BaseDTO;
import com.nicico.cost.integration.domain.entity.People;
import com.nicico.cost.integration.domain.view.people.PeopleReqVM;
import com.nicico.cost.integration.domain.view.people.PeopleResVM;
import com.nicico.cost.integration.repository.people.PeopleJdbcService;
import com.nicico.cost.integration.service.PeopleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.List;

import static com.nicico.cost.framework.enums.exception.ExceptionEnum.NOTFOUND;

@Service
@RequiredArgsConstructor
class PeopleServiceImpl extends GeneralServiceImpl<People, PeopleReqVM, PeopleResVM, Long> implements PeopleService {
    private final PeopleJdbcService peopleJdbcService;

    public BaseDTO<PeopleResVM> findByNationalCode(@NotNull String nationalCode) {
        People people = peopleJdbcService.findByNationCode(nationalCode).orElseThrow(
                () -> applicationException.createApplicationException(NOTFOUND, HttpStatus.NOT_FOUND)
        );
        return generalMapper.mapBaseObjectToResponse(people);
    }

    @Override
    @Unauthorized
    public BaseDTO<PeopleResVM> save(PeopleReqVM peopleReqVM) {
        return super.save(peopleReqVM);
    }

    @Override
    @Unauthorized
    public BaseDTO<List<PeopleResVM>> saveAll(List<PeopleReqVM> peopleReqVMS) {
        return super.saveAll(peopleReqVMS);
    }

    @Override
    @Unauthorized
    public BaseDTO<PeopleResVM> update(PeopleReqVM peopleReqVM) {
        return super.update(peopleReqVM);
    }

    @Override
    @Unauthorized
    public BaseDTO<Boolean> deleteById(Long id) {
        return super.deleteById(id);
    }
}
