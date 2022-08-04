package com.patientservice.model;

import lombok.*;
import org.hibernate.annotations.Table;

import javax.persistence.Entity;
import javax.persistence.Id;


@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "case")
public class Case extends Auditable {
    @Id
private String id;
private String patientId;
private String name;
private String descripation;
private Data dateOfCase;

}
