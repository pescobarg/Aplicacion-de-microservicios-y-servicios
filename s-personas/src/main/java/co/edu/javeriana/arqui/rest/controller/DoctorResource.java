package co.edu.javeriana.arqui.rest.controller;

import java.util.List;

import co.edu.javeriana.arqui.rest.model.Doctor;
import co.edu.javeriana.arqui.rest.service.DoctorService;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/doctores")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class DoctorResource {

    @Inject
    private DoctorService doctorService;

    @POST
    public Response registrarDoctor(Doctor doctor) {
        Doctor d = doctorService.registrarDoctor(doctor);
        return Response.status(Response.Status.CREATED).entity(d).build();
    }

    @GET
    public List<Doctor> listarDoctores() {
        return doctorService.listarDoctores();
    }
}
