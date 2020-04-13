package co.edu.campusucc.sd.daos;
// Generated 28/03/2020 03:59:05 PM by Hibernate Tools 5.4.7.Final

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Example;

import co.edu.campusucc.sd.modelo.Pais;

/**
 * Home object for domain model class Pais.
 * 
 * @see co.edu.campusucc.sd.modelo.Pais
 * @author Hibernate Tools
 */
public class PaisDAO {

	private static final Logger logger = Logger.getLogger(PaisDAO.class.getName());

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			// return (SessionFactory) new InitialContext().lookup("SessionFactory");
			return new Configuration().configure().buildSessionFactory();
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}
	
	public void delete(Pais persistentInstance) {
		logger.log(Level.INFO, "deleting Pais instance");
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.delete(persistentInstance);
			tx.commit();
			logger.log(Level.INFO, "delete successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "delete failed", re);
			if (tx != null) tx.rollback();
			throw re;
		} finally {
			session.close();
		}
	}

	public void persist(Pais transientInstance) {
		logger.log(Level.INFO, "persisting Pais instance");
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.save(transientInstance);
			tx.commit();
			logger.log(Level.INFO, "persist successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "persist failed", re);
			if (tx != null)
				tx.rollback();
			throw re;

		} finally {
			session.close();
		}
	}
	
	

}
