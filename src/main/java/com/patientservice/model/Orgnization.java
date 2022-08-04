package com.patientservice.model;

import lombok.*;

import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@ToString
public class Orgnization extends Auditable {
    @Id
    private String id;
    private String name;
    private String descreption;
    private String adressLine1;
    private String adressLine2;


}
