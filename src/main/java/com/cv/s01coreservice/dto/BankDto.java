package com.cv.s01coreservice.dto;

import com.cv.s01coreservice.dto.generic.GenericDto;
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
public class BankDto extends GenericDto implements Serializable {

    @Serial
    private static final long serialVersionUID = -954052250525287108L;
    @NotNull(message = "app.error.msg-2")
    private String bankCode;

}
