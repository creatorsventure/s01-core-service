package com.cv.s01coreservice.entity;

import com.cv.s01coreservice.entity.generic.GenericEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Entity
public class UserDetail extends GenericEntity implements Serializable {

    private static final long serialVersionUID = 8611233580452025704L;

    @NotBlank(message = "app.error.msg-1")
    @NotNull(message = "app.error.msg-2")
    @Column(unique = true)
    private String email;

}
