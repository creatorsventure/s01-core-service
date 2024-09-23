package com.cv.s01coreservice.dto;

import com.cv.s01coreservice.dto.generic.GenericDto;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class UserDto extends GenericDto implements Serializable {

    private static final long serialVersionUID = -511269946896947520L;

    @NotNull(message = "app.error.msg-2")
    private String email;

}
