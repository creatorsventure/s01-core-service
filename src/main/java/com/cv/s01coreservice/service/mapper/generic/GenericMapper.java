package com.cv.s01coreservice.service.mapper.generic;

public interface GenericMapper<T, T1> {

    T toDto(T1 entity);

    T1 toEntity(T dto);

}
