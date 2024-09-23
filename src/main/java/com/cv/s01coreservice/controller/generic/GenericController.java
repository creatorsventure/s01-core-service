package com.cv.s01coreservice.controller.generic;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;

import com.org.coreservice.dto.PaginationDto;

public interface GenericController<T> {

	ResponseEntity<Object> create(T dto, BindingResult result);

	ResponseEntity<Object> update(T dto, BindingResult result);

	ResponseEntity<Object> updateStatus(String id, boolean status);

	ResponseEntity<Object> readOne(String id);

	ResponseEntity<Object> delete(String id);

	ResponseEntity<Object> readPage(PaginationDto dto);

	ResponseEntity<Object> readIdNameMapping(String id);

}
