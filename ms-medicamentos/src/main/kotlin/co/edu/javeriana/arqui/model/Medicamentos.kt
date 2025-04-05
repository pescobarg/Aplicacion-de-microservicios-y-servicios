package co.edu.javeriana.arqui.model

import jakarta.persistence.*
import jakarta.validation.constraints.*

@Entity
@Table(name = "medicamentos")
open class Medicamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    open var id: Long? = null

    @field:NotBlank
    @Column(nullable = false)
    open var nombre: String? = null

    @field:NotBlank
    @Column(nullable = false)
    open var dosis: String? = null

    @field:NotNull
    @Column(nullable = false)
    open var precio: Double? = null


    // Constructor sin argumentos (necesario para Hibernate)
    constructor()

    // Constructor conveniente
    constructor(nombre: String, dosis: String, precio: Double) {
        this.nombre = nombre
        this.dosis = dosis
        this.precio = precio

    }
}
