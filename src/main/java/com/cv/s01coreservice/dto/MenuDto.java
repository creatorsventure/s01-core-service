package com.cv.s01coreservice.dto;

import com.cv.s01coreservice.dto.generic.GenericDto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serial;
import java.io.Serializable;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class MenuDto extends GenericDto implements Serializable {

    @Serial
    private static final long serialVersionUID = 7400625511096934266L;

    @NotBlank(message = "app.error.msg-1")
    @NotNull(message = "app.error.msg-2")
    private String menuName;

    @NotBlank(message = "app.error.msg-1")
    @NotNull(message = "app.error.msg-2")
    private String path;

    @NotBlank(message = "app.error.msg-1")
    @NotNull(message = "app.error.msg-2")
    private String icon;

    @NotNull(message = "app.error.msg-2")
    private Boolean isParent;

    @NotNull(message = "app.error.msg-2")
    private Integer order;


}
