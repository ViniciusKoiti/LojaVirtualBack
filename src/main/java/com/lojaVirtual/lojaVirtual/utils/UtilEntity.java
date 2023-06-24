package com.lojaVirtual.lojaVirtual.utils;

import org.modelmapper.ModelMapper;

public class UtilEntity {
    private final static ModelMapper modelMapper = new ModelMapper();
    public static <T, D> T convertToEntity(D dto, Class<T> outClass) {
        return modelMapper.map(dto, outClass);
    }
}
