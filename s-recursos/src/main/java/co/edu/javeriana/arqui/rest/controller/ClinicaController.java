package co.edu.javeriana.arqui.rest.controller;

import java.util.List;

import co.edu.javeriana.arqui.rest.model.Clinica;
import co.edu.javeriana.arqui.rest.service.ClinicaService;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/clinicas")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ClinicaController {

    @Inject
    ClinicaService service;

    @POST
    public Clinica registrar(Clinica c) {
        return service.registrar(c);
    }

    @GET
    public List<Clinica> listar() {
        return service.listar();
    }
}
