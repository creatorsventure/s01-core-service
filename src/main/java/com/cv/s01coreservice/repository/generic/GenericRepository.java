package com.cv.s01coreservice.repository.generic;

import java.util.List;
import java.util.Optional;

public interface GenericRepository {

    <T> Optional<T> findByIdAndStatus(String id, boolean status, Class<T> modelType);

    <T> List<T> findAllByStatus(boolean status, Class<T> modelType);

}
