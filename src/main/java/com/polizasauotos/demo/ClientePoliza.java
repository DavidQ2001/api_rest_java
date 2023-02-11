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
public class ClientePoliza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idcliente;
    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String fecha_nacimiento;

    @Column(nullable = false)
    private String ciudad_residencia;

    @Column(nullable = false)
    private String direccion_residencia;




}
