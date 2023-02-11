package com.polizasauotos.demo;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class vehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long placa_vehiculo_id;
    @Column(nullable = false)
    private String modelo;

    @Column(nullable = false)
    private boolean inspeccio_vehiculo;

}
