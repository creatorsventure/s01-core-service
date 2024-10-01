package com.cv.s01coreservice.dto;

import com.cv.s01coreservice.dto.generic.GenericDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class MenuDto extends GenericDto implements Comparable<MenuDto>, Serializable {

    @Serial
    private static final long serialVersionUID = 7400625511096934266L;

    @NotBlank(message = "app.error.msg-1")
    @NotNull(message = "app.error.msg-2")
    private String path;

    @NotBlank(message = "app.error.msg-1")
    @NotNull(message = "app.error.msg-2")
    private String icon;

    @NotNull(message = "app.error.msg-2")
    private Integer rootMenuId;

    @NotNull(message = "app.error.msg-2")
    private Integer displayPosition;

    @NotNull(message = "app.error.msg-2")
    private Integer menuType;

    @JsonProperty("submenu")
    private List<MenuDto> subMenuDtos = new ArrayList<>(0);


    @Override
    public int compareTo(MenuDto o) {
        return this.getDisplayPosition() < o.getDisplayPosition() ? -1 : 1;
    }
}
