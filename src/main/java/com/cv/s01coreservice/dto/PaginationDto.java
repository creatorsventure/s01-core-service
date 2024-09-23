package com.cv.s01coreservice.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaginationDto {

    private int pageIndex;
    private int pageSize;
    private String sortField;
    private String sortOrder;
    private Long total;
    private String searchField;
    private String searchValue;
    private List<Object> result;

}
