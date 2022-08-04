package com.patientservice.model;

import com.patientservice.constant.BloodGroup;
import com.patientservice.constant.Gender;
import lombok.*;

import javax.persistence.Id;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@ToString
public class Patient {
    @Id
    private String id;
    private String orgnizationId;
    private String firstName;
    private String lastName;
    private Integer age;
    private Gender gender;
    private BloodGroup bloodGroup;
    private String phoneNumber;
    private LocalDate dateOfBirth;
}
