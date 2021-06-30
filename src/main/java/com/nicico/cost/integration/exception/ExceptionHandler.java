package com.nicico.cost.integration.exception;

import com.nicico.cost.framework.domain.dto.BaseDTO;
import com.nicico.cost.framework.enums.Status;
import com.nicico.cost.framework.service.exception.GeneralExceptionHandler;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ExceptionHandler extends GeneralExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(DataIntegrityViolationException.class)
    protected ResponseEntity<BaseDTO<String>> handleException(Exception e) {
        BaseDTO<String> baseDTO = BaseDTO.<String>builder().code(
                applicationResource.getResourceText("ALREADY_EXISTED.code"))
                .message(applicationResource.getResourceText("ALREADY_EXISTED.message")).status(Status.ERROR).build();
        return new ResponseEntity<>(baseDTO, HttpStatus.ALREADY_REPORTED);
    }
}
