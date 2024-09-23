package com.cv.s01coreservice.dto.generic;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public abstract class GenericDto implements Serializable {

    @Serial
    private static final long serialVersionUID = -5839134238162376331L;
    private String id;
    @NotBlank(message = "app.error.msg-1")
    @NotNull(message = "app.error.msg-2")
    private String name;
    private String description;
    @NotNull(message = "app.error.msg-2")
    private boolean status;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
    private String createdBy;
    private String modifiedBy;

}
