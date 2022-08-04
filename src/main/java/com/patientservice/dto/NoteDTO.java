package com.patientservice.dto;

import lombok.*;

import javax.persistence.Id;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@ToString
public class NoteDTO {
    @Id
    private String id;
    private String caseId;
    private String name;
    private String description;
    private Data dateOfNote;

}
