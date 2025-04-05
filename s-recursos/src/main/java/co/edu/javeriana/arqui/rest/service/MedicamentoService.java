package co.edu.javeriana.arqui.rest.service;

import co.edu.javeriana.arqui.rest.model.Medicamento;
import jakarta.ejb.Stateless;
import jakarta.persistence.*;
import java.util.List;

@Stateless
public class MedicamentoService {
    @PersistenceContext(unitName = "RecursosPU")
    private EntityManager em;

    public Medicamento registrar(Medicamento m) {
        em.persist(m);
        return m;
    }

    public List<Medicamento> listar() {
        return em.createQuery("SELECT m FROM Medicamento m", Medicamento.class).getResultList();
    }
}
