package co.edu.javeriana.arqui.controller

import co.edu.javeriana.arqui.model.Clinica
import co.edu.javeriana.arqui.repository.ClinicaRepository
import jakarta.enterprise.context.ApplicationScoped
import jakarta.ws.rs.*
import jakarta.ws.rs.core.MediaType
import jakarta.ws.rs.core.Response

@Path("/clinicas")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@ApplicationScoped
class ClinicaController(private val repository: ClinicaRepository) {

    @GET
    fun getAllClinicas(): List<Clinica> = repository.findAll()

    @POST
    fun createClinica(clinica: Clinica): Response {
        println("Recibiendo clinica" + clinica.nombre + ", " + clinica.direccion)
        repository.save(clinica)
        return Response.status(Response.Status.CREATED).entity(clinica).build()
    }
}
