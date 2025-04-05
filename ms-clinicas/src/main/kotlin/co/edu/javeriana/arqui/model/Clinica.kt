package co.edu.javeriana.arqui.model

import jakarta.persistence.*
import jakarta.validation.constraints.NotBlank

@Entity
@Table(name = "clinicas")
open class Clinica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    open var id: Long? = null

    @field:NotBlank
    @Column(nullable = false)
    open var nombre: String? = null

    @field:NotBlank
    @Column(nullable = false)
    open var direccion: String? = null

    @field:NotBlank
    @Column(nullable = false)
    open var telefono: String? = null

    // Constructor sin argumentos (necesario para Hibernate)
    constructor()

    // Constructor conveniente
    constructor(nombre: String, direccion: String, telefono: String) {
        this.nombre = nombre
        this.direccion = direccion
        this.telefono = telefono
    }
}
