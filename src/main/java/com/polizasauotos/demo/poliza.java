package com.polizasauotos.demo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class poliza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idpoliza;
    @Column(nullable = false)
    private String nombre_poliza;

    @Column(nullable = false)
    private String fecha_inicio;

    @Column(nullable = false)
    private String cobertura;

    @Column(nullable = false)
    private int valor_maximo;
}
