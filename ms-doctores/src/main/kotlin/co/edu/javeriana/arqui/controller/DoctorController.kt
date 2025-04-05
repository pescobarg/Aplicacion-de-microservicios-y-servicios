package co.edu.javeriana.arqui.controller

import co.edu.javeriana.arqui.model.Doctor
import co.edu.javeriana.arqui.repository.DoctorRepository
import jakarta.inject.Inject
import jakarta.ws.rs.*
import jakarta.ws.rs.core.MediaType
import jakarta.ws.rs.core.Response


@Path("/doctores")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
class DoctorController {

    @Inject
    lateinit var repository: DoctorRepository

    @POST
    fun addDoctor(doctor: Doctor): Response {
        repository.save(doctor)
        return Response.status(Response.Status.CREATED).entity(doctor).build()
    }

    @GET
    fun getAllDoctores(): List<Doctor> = repository.findAll()
}
