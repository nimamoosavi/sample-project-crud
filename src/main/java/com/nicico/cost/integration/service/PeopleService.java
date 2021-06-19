package com.nicico.cost.integration.service;

import com.nicico.cost.crud.service.GeneralService;
import com.nicico.cost.framework.domain.dto.BaseDTO;
import com.nicico.cost.framework.domain.dto.PageDTO;
import com.nicico.cost.framework.enums.Status;
import com.nicico.cost.integration.domain.entity.People;
import com.nicico.cost.integration.domain.view.people.PeopleReqVM;
import com.nicico.cost.integration.domain.view.people.PeopleResVM;
import com.nicico.cost.integration.repository.people.PeopleJdbcService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.List;

import static com.nicico.cost.framework.enums.exception.ExceptionEnum.NOTFOUND;
import static com.nicico.cost.framework.utility.impl.ResourceUtilityImpl.successResource;

@Service
@RequiredArgsConstructor
public class PeopleService extends GeneralService<People, PeopleReqVM, PeopleResVM, Long> {
    private final PeopleJdbcService peopleJdbcService;

    public BaseDTO<PeopleResVM> findByNationalCode(@NotNull String nationalCode) {
        People people = peopleJdbcService.findByNationCode(nationalCode).orElseThrow(
                () -> applicationException.createApplicationException(NOTFOUND, HttpStatus.NOT_FOUND)
        );
        return generalMapper.mapBaseObjectToResponse(people);
    }


    public BaseDTO<List<PeopleResVM>> findByFirstName(@NotNull String firstName) {
        List<People> peopleList = peopleJdbcService.findByFirstName(firstName);
        return generalMapper.mapListBaseObjectToResponse(peopleList);
    }

    public BaseDTO<List<PeopleResVM>> findByFirstNameContaining(@NotNull String firstName) {
        List<People> peopleList = peopleJdbcService.findByFirstNameContaining(firstName);
        return generalMapper.mapListBaseObjectToResponse(peopleList);
    }

    public BaseDTO<PageDTO<List<PeopleResVM>>> findByFirstName(@NotNull String firstName, Integer page, Integer pageSize) {
        Pageable pagination = pagination(page, pageSize);
        Page<People> listPage = peopleJdbcService.findByFirstName(firstName, pagination);
        return createPageableResponse(listPage);
    }

    public BaseDTO<PageDTO<List<PeopleResVM>>> findByFirstNameContaining(@NotNull String firstName, Integer page, Integer pageSize) {
        Pageable pagination = pagination(page, pageSize);
        Page<People> listPage = peopleJdbcService.findByFirstNameContaining(firstName, pagination);
        return createPageableResponse(listPage);
    }


    public BaseDTO<List<PeopleResVM>> findByLastName(@NotNull String lastName) {
        List<People> peopleList = peopleJdbcService.findByLastName(lastName);
        return generalMapper.mapListBaseObjectToResponse(peopleList);
    }

    public BaseDTO<List<PeopleResVM>> findByLastNameContaining(@NotNull String lastName) {
        List<People> peopleList = peopleJdbcService.findByLastNameContaining(lastName);
        return generalMapper.mapListBaseObjectToResponse(peopleList);
    }

    public BaseDTO<PageDTO<List<PeopleResVM>>> findByLastName(@NotNull String firstName, Integer page, Integer pageSize) {
        Pageable pagination = pagination(page, pageSize);
        Page<People> listPage = peopleJdbcService.findByLastName(firstName, pagination);
        return createPageableResponse(listPage);
    }

    public BaseDTO<PageDTO<List<PeopleResVM>>> findByLastNameContaining(@NotNull String firstName, Integer page, Integer pageSize) {
        Pageable pagination = pagination(page, pageSize);
        Page<People> listPage = peopleJdbcService.findByLastNameContaining(firstName, pagination);
        return createPageableResponse(listPage);
    }


    private Pageable pagination(int page, int pageSize) {
        return PageRequest.of(page - 1, pageSize);
    }


    private BaseDTO<PageDTO<List<PeopleResVM>>> createPageableResponse(Page<People> page) {
        List<PeopleResVM> peopleResVMS = generalMapper.mapListBaseObjectToResponse(page.toList()).getData();
        PageDTO<List<PeopleResVM>> pageDTO = PageDTO.<List<PeopleResVM>>builder().totalElement(page.getTotalElements())
                .totalPages(page.getTotalPages())
                .pageSize(page.getSize()).object(peopleResVMS).build();
        return BaseDTO.<PageDTO<List<PeopleResVM>>>builder().data(pageDTO)
                .code(successResource().getCode())
                .message(successResource().getMessage())
                .status(Status.SUCCESS).build();
    }

}
