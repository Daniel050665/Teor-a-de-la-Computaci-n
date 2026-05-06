package edu.javeriana.estudiante_notas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.javeriana.estudiante_notas.model.nota;
import org.springframework.stereotype.Repository;

@Repository
public interface notaRepositorie extends JpaRepository<nota, String> {
    List<nota> findByEstudianteId(String estudianteId);

    void deleteByEstudianteId(String estudianteId);
}
