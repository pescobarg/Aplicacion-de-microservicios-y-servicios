package co.edu.javeriana.arqui.controller

import co.edu.javeriana.arqui.model.Medicamento
import co.edu.javeriana.arqui.repository.MedicamentoRepository
import jakarta.inject.Inject
import jakarta.ws.rs.*
import jakarta.ws.rs.core.MediaType
import jakarta.ws.rs.core.Response

@Path("/medicamentos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
class MedicamentoController {

    @Inject
    lateinit var repository: MedicamentoRepository

    @POST
    fun addMedicamento(medicamento: Medicamento): Response {
        repository.save(medicamento)
        return Response.status(Response.Status.CREATED).entity(medicamento).build()
    }

    @GET
    fun getAllMedicamentos(): List<Medicamento> = repository.findAll()
}
