package co.edu.javeriana.arqui.rest.service;

import java.util.List;

import co.edu.javeriana.arqui.rest.model.Paciente;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
public class PacienteService {

    @PersistenceContext(unitName = "default")
    private EntityManager em;

    public Paciente registrarPaciente(Paciente paciente) {
        em.persist(paciente);
        return paciente;
    }

    public List<Paciente> listarPacientes() {
        return em.createQuery("SELECT p FROM Paciente p", Paciente.class).getResultList();
    }
}
