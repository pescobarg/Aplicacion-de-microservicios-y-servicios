package co.edu.javeriana.arqui.repository

import co.edu.javeriana.arqui.model.Doctor
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject
import org.hibernate.SessionFactory

@ApplicationScoped
class DoctorRepository @Inject constructor(
    private val sessionFactory: SessionFactory
) {
    fun save(doctor: Doctor) {
        sessionFactory.openSession().use { session ->
            val transaction = session.beginTransaction()
            session.persist(doctor)
            transaction.commit()
        }
    }

    fun findAll(): List<Doctor> =
        sessionFactory.openSession().createQuery("FROM Doctor", Doctor::class.java).resultList
}
