package co.edu.javeriana.arqui.repository

import co.edu.javeriana.arqui.model.Paciente
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject
import org.hibernate.SessionFactory

@ApplicationScoped
class PacienteRepository @Inject constructor(
    private val sessionFactory: SessionFactory
) {
    fun save(paciente: Paciente) {
        sessionFactory.openSession().use { session ->
            val transaction = session.beginTransaction()
            session.persist(paciente)
            transaction.commit()
        }
    }

    fun findAll(): List<Paciente> =
        sessionFactory.openSession().createQuery("FROM Paciente", Paciente::class.java).resultList
}
