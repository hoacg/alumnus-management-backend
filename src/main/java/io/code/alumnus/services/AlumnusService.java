package io.code.alumnus.services;

import io.code.alumnus.models.Alumni;
import io.code.alumnus.repositories.AlumnusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnusService implements IAlumnusService {

    @Autowired
    private AlumnusRepository alumnusRepository;

    public List<Alumni> getAll() {
        return this.alumnusRepository.findAll();
    }

    @Override
    public Alumni getById(Long id) {
        return this.alumnusRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    @Override
    public Alumni update(Alumni alumni) {
        return this.alumnusRepository.save(alumni);
    }

    @Override
    public void removeById(Long id) {
        this.alumnusRepository.deleteById(id);
    }

    @Override
    public Alumni create(Alumni alumni) {
        return this.alumnusRepository.save(alumni);
    }
}

