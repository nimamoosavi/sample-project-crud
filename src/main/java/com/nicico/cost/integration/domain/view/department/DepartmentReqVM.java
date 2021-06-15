package com.nicico.cost.integration.domain.view.department;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class DepartmentReqVM {

    @NotNull
    private Long departmentCode;
    @NotNull
    @NotBlank
    private String departmentName;
    @NotNull
    @NotBlank
    private String departmentNameLatin;
}
