package edu.javeriana.estudiante_notas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.javeriana.estudiante_notas.model.estudiante;
import org.springframework.stereotype.Repository;

@Repository
public interface estudianteRepositorie extends JpaRepository<estudiante, String> {

}
