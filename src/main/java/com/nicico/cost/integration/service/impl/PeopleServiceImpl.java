package com.nicico.cost.integration.service.impl;

import com.nicico.cost.crud.service.impl.GeneralServiceImpl;
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
}
