package co.edu.javeriana.arqui.model

import jakarta.persistence.*
import jakarta.validation.constraints.NotBlank

@Entity
@Table(name = "doctores")
open class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    open var id: Long? = null

    @field:NotBlank
    @Column(nullable = false)
    open var cedula: String? = null

    @field:NotBlank
    @Column(nullable = false)
    open var nombre: String? = null

    @field:NotBlank
    @Column(nullable = false)
    open var telefono: String? = null

    @field:NotBlank
    @Column(nullable = false)
    open var especialidad: String? = null


    // Constructor sin argumentos (necesario para Hibernate)
    constructor()

    // Constructor conveniente
    constructor(cedula: String, nombre: String, telefono: String, especialidad: String) {
        this.cedula = cedula
        this.nombre = nombre
        this.telefono = telefono
        this.especialidad = especialidad

    }
}
