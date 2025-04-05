package co.edu.javeriana.arqui.model

import jakarta.persistence.*
import jakarta.validation.constraints.*

@Entity
@Table(name = "pacientes")
open class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    open var id: Long? = null

    @field:NotBlank
    @Column(nullable = false)
    open var nombre: String? = null

    @field:NotBlank
    @Column(nullable = false)
    open var cedula: String? = null

    @field:NotBlank
    @Column(nullable = false)
    open var telefono: String? = null


    constructor()

    constructor(nombre: String, cedula: String, telefono: String) {
        this.nombre = nombre
        this.cedula = cedula
        this.telefono = telefono

    }
}
