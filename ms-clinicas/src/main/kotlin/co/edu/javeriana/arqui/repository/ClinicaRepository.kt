package co.edu.javeriana.arqui.repository

import co.edu.javeriana.arqui.model.Clinica
import jakarta.enterprise.context.ApplicationScoped
import jakarta.transaction.Transactional
import org.hibernate.SessionFactory
import jakarta.persistence.PersistenceContext

@ApplicationScoped
class ClinicaRepository {

    @PersistenceContext
    lateinit var sessionFactory: SessionFactory

    fun findAll(): List<Clinica> = sessionFactory.openSession().createQuery("FROM Clinica", Clinica::class.java).resultList

    fun findById(id: Long): Clinica? = sessionFactory.openSession().get(Clinica::class.java, id)

    @Transactional
    fun save(clinica: Clinica) {
        sessionFactory.openSession().apply {
            transaction.begin()
            persist(clinica)
            transaction.commit()
            close()
        }
    }
}
