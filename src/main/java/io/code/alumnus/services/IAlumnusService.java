package io.code.alumnus.services;

import io.code.alumnus.models.Alumni;

import java.util.List;

public interface IAlumnusService {

    List<Alumni> getAll();
    Alumni getById(Long id);
    Alumni update(Alumni alumni);
    void removeById(Long id);
    Alumni create(Alumni alumni);

}
