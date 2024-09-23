package com.cv.s01coreservice.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class APIResponseDto implements Serializable {

    private boolean status;
    private String message;
    private Integer type;
    private Object object;

}
