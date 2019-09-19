package com.example.makingAnAppointment.service;

import java.util.List;

public interface GenericService<T> {
    T addG(T t);

    T getById(Long id);

    List<T> getAll();

    void deleteById(Long id);

    void deleteAll();


}
