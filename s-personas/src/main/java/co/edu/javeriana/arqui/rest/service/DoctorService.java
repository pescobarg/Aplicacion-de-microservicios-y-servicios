package co.edu.javeriana.arqui.rest.service;

import java.util.List;

import co.edu.javeriana.arqui.rest.model.Doctor;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
public class DoctorService {

    @PersistenceContext(unitName = "default")
    private EntityManager em;

    public Doctor registrarDoctor(Doctor doctor) {
        em.persist(doctor);
        return doctor;
    }

    public List<Doctor> listarDoctores() {
        return em.createQuery("SELECT d FROM Doctor d", Doctor.class).getResultList();
    }
}
