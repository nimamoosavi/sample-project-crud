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
