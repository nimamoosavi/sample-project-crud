package com.webold.integration.service.impl;

import com.webold.crud.service.impl.GeneralServiceImpl;
import com.webold.framework.anotations.Unauthorized;
import com.webold.framework.domain.dto.BaseDTO;
import com.webold.integration.domain.entity.People;
import com.webold.integration.domain.view.people.PeopleReqVM;
import com.webold.integration.domain.view.people.PeopleResVM;
import com.webold.integration.repository.people.PeopleJdbcService;
import com.webold.integration.service.PeopleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.List;

import static com.webold.framework.enums.exception.ExceptionEnum.NOTFOUND;

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