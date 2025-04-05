package co.edu.javeriana.arqui.repository

import co.edu.javeriana.arqui.model.Medicamento
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject
import org.hibernate.SessionFactory

@ApplicationScoped
class MedicamentoRepository @Inject constructor(
    private val sessionFactory: SessionFactory
) {
    fun save(medicamento: Medicamento) {
        sessionFactory.openSession().use { session ->
            val transaction = session.beginTransaction()
            session.persist(medicamento)
            transaction.commit()
        }
    }

    fun findAll(): List<Medicamento> =
        sessionFactory.openSession().createQuery("FROM Medicamento", Medicamento::class.java).resultList
}
