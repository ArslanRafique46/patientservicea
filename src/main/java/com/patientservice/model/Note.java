package com.patientservice.model;

import lombok.*;

import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@ToString
public class Note {
    @Id
    private String id;
    private String caseId;
    private String name;
    private String description;
    private Data dateOfNote;

}
