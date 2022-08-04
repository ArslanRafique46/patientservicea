package com.patientservice.model;

import lombok.*;
import org.springframework.data.annotation.*;

import java.time.Instant;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public abstract class Auditable<U> {
    @Version
    private long version;
    @CreatedBy
    private String createUser;
    @CreatedDate
    private Instant createDate;
    @LastModifiedBy
    private String lastModiferUser;
    @LastModifiedDate
    private Instant lastModiferDate;
}
