package com.cv.s01coreservice.entity.generic;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@SuperBuilder
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "modifiedAt"}, allowGetters = true)
public abstract class GenericEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column
    private String id;

    @Column
    @NotBlank(message = "app.error.msg-1")
    @NotNull(message = "app.error.msg-2")
    private String name;

    @Column
    private String description;

    @Column(columnDefinition = "boolean default false")
    private boolean status;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    @LastModifiedDate
    @Column
    private LocalDateTime modifiedAt = LocalDateTime.now();

    @CreatedBy
    @Column(nullable = false, updatable = false, length = 250)
    private String createdBy;

    @LastModifiedBy
    @Column(length = 250)
    private String modifiedBy;

}
