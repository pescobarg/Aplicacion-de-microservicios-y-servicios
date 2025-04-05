package co.edu.javeriana.arqui.rest.service;

import co.edu.javeriana.arqui.rest.model.Clinica;
import jakarta.ejb.Stateless;
import jakarta.persistence.*;
import java.util.List;

@Stateless
public class ClinicaService {
    @PersistenceContext(unitName = "RecursosPU")
    private EntityManager em;

    public Clinica registrar(Clinica c) {
        em.persist(c);
        return c;
    }

    public List<Clinica> listar() {
        return em.createQuery("SELECT c FROM Clinica c", Clinica.class).getResultList();
    }
}
