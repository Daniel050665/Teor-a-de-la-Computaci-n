package edu.javeriana.estudiante_notas.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class nota {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(nullable = false)
    private String materia;

    @Column(nullable = false)
    private String observacion;

    @Column(nullable = false)
    private Double valor;

    @Column(nullable = false)
    private Double porcentaje;

    @ManyToOne 
    @JoinColumn(name = "estudiante_id", nullable = false)
    @JsonIgnore
    private estudiante estudiante;

}
