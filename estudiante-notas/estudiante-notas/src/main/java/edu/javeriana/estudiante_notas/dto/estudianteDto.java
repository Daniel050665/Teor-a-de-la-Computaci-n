package edu.javeriana.estudiante_notas.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class estudianteDto {

    private String id;

    @NotBlank (message = "El nombre es obligatorio")
    private String nombre;

    @NotBlank (message = "El apellido es obligatorio")
    private String apellido;

    @NotBlank (message = "El correo es obligatorio")
    @Email (message = "El correo debe ser válido")
    private String correo;

}
