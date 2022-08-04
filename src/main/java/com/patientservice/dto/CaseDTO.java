package com.patientservice.dto;

import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder(toBuilder = true)
public class CaseDTO {

    private String id;
    @NotEmpty(message = "Patient id can't be Empty")
    @NotNull(message = "Patient Id can't be Null")
    private String patientId;
    @NotEmpty(message = "Patient name cant't be Null")
    @NotNull(message = "Patient name can't be Null")
    private String name;
    private String descripation;
    private Data dateOfCase;
}
