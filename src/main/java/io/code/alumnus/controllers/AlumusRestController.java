package io.code.alumnus.controllers;

import io.code.alumnus.models.Alumni;
import io.code.alumnus.services.IAlumnusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/alumnus")
public class AlumusRestController {

    @Autowired
    private IAlumnusService alumnusService;

    @GetMapping
    public ResponseEntity<List<Alumni>> getAlumnusList() {
        return ResponseEntity.ok(this.alumnusService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Alumni> getAlumniById(@PathVariable Long id) {
        try {
            return ResponseEntity.ok(this.alumnusService.getById(id));
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Alumni> createAlumni(@RequestBody Alumni alumni) {
        return ResponseEntity.ok(this.alumnusService.create(alumni));
    }

    @PutMapping
    public ResponseEntity<Alumni> updateAlumni(@RequestBody Alumni alumni) {
        return ResponseEntity.ok(this.alumnusService.update(alumni));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removeAlumniById(@PathVariable Long id) {
        this.alumnusService.removeById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
