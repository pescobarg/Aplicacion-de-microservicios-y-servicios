package co.edu.javeriana.arqui.rest.controller;

import co.edu.javeriana.arqui.rest.model.Paciente;
import co.edu.javeriana.arqui.rest.service.PacienteService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;

@Path("/pacientes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PacienteResource {

    @Inject
    private PacienteService pacienteService;

    @POST
    public Response registrarPaciente(Paciente paciente) {
        Paciente p = pacienteService.registrarPaciente(paciente);
        return Response.status(Response.Status.CREATED).entity(p).build();
    }

    @GET
    public List<Paciente> listarPacientes() {
        return pacienteService.listarPacientes();
    }
}
