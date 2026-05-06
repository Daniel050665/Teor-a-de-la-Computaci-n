package edu.javeriana.estudiante_notas.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import edu.javeriana.estudiante_notas.model.estudiante;
import edu.javeriana.estudiante_notas.services.estudianteService;

import java.util.List;

@RestController
@RequestMapping("/estudiante")
public class estudianteController {

    private final estudianteService servicio;

    public estudianteController(estudianteService servicio) {
        this.servicio = servicio;
    }

    @GetMapping
    public ResponseEntity<List<estudiante>> obtenerTodos() {
        return ResponseEntity.ok(servicio.obtenerTodos());
    }

    @PostMapping
    public ResponseEntity<estudiante> crear(@RequestBody estudiante nuevoEstudiante) {
        estudiante creado = servicio.guardar(nuevoEstudiante);
        return ResponseEntity.status(HttpStatus.CREATED).body(creado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        if (servicio.eliminar(id)) {
            return ResponseEntity.noContent().build(); // 204
        }
        return ResponseEntity.notFound().build(); // 404
    }
}