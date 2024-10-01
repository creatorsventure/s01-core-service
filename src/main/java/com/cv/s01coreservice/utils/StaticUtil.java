package com.cv.s01coreservice.utils;

import org.springframework.util.StringUtils;

public class StaticUtil {

    public static boolean isSearchRequest(String searchField, String searchValue) {
        return StringUtils.hasText(searchField) && StringUtils.hasText(searchValue);
    }
}
