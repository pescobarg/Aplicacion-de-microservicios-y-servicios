package co.edu.javeriana.arqui.controller

import co.edu.javeriana.arqui.model.Paciente
import co.edu.javeriana.arqui.repository.PacienteRepository
import jakarta.inject.Inject
import jakarta.ws.rs.*
import jakarta.ws.rs.core.MediaType
import jakarta.ws.rs.core.Response

@Path("/pacientes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
class PacienteController {

    @Inject
    lateinit var repository: PacienteRepository

    @POST
    fun addPaciente(paciente: Paciente): Response {
        repository.save(paciente)
        return Response.status(Response.Status.CREATED).entity(paciente).build()
    }

    @GET
    fun getAllPacientes(): List<Paciente> = repository.findAll()
}
