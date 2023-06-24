package com.lojaVirtual.lojaVirtual.utils;

import org.modelmapper.ModelMapper;

public class UtilDTO{

    private final static ModelMapper modelMapper = new ModelMapper();

    public static <D, T> D convertToDTO(T entity, Class<D> outClass) {
        return modelMapper.map(entity, outClass);
    }
}