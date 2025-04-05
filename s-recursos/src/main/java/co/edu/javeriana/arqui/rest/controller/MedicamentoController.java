package co.edu.javeriana.arqui.rest.controller;

import java.util.List;

import co.edu.javeriana.arqui.rest.model.Medicamento;
import co.edu.javeriana.arqui.rest.service.MedicamentoService;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/medicamentos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MedicamentoController {

    @Inject
    MedicamentoService service;

    @POST
    public Medicamento registrar(Medicamento m) {
        return service.registrar(m);
    }

    @GET
    public List<Medicamento> listar() {
        return service.listar();
    }
}
