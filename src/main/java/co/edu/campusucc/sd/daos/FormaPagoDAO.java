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

import co.edu.campusucc.sd.modelo.FormaPago;

/**
 * Home object for domain model class FormaPago.
 * 
 * @see co.edu.campusucc.sd.modelo.FormaPago
 * @author Hibernate Tools
 */
public class FormaPagoDAO {

	private static final Logger logger = Logger.getLogger(FormaPagoDAO.class.getName());

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

	public void persist(FormaPago transientInstance) {
		logger.log(Level.INFO, "persisting FormaPago instance");
		logger.log(Level.INFO, "persisting TipoCliente instance");
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.save(transientInstance);
			tx.commit();
			sessionFactory.getCurrentSession().persist(transientInstance);
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

	public void attachDirty(FormaPago instance) {
		logger.log(Level.INFO, "attaching dirty FormaPago instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			logger.log(Level.INFO, "attach successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "attach failed", re);
			throw re;
		}
	}

	public void attachClean(FormaPago instance) {
		logger.log(Level.INFO, "attaching clean FormaPago instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			logger.log(Level.INFO, "attach successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "attach failed", re);
			throw re;
		}
	}

	public void delete(FormaPago persistentInstance) {
		logger.log(Level.INFO, "deleting FormaPago instance");
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.delete(persistentInstance);
			tx.commit();
			sessionFactory.getCurrentSession().delete(persistentInstance);
			logger.log(Level.INFO, "delete successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "delete failed", re);
			if (tx != null)
				tx.rollback();
			throw re;
		} finally {
			session.close();
		}
	}

	public FormaPago merge(FormaPago detachedInstance) {
		logger.log(Level.INFO, "merging FormaPago instance");
		try {
			FormaPago result = (FormaPago) sessionFactory.getCurrentSession().merge(detachedInstance);
			logger.log(Level.INFO, "merge successful");
			return result;
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "merge failed", re);
			throw re;
		}
	}

	public FormaPago findById(java.lang.String id) {
		logger.log(Level.INFO, "getting FormaPago instance with id: " + id);
		try {
			FormaPago instance = (FormaPago) sessionFactory.getCurrentSession()
					.get("co.edu.campusucc.sd.modelo.FormaPago", id);
			if (instance == null) {
				logger.log(Level.INFO, "get successful, no instance found");
			} else {
				logger.log(Level.INFO, "get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "get failed", re);
			throw re;
		}
	}

	public List findByExample(FormaPago instance) {
		logger.log(Level.INFO, "finding FormaPago instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("co.edu.campusucc.sd.modelo.FormaPago")
					.add(Example.create(instance)).list();
			logger.log(Level.INFO, "find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "find by example failed", re);
			throw re;
		}
	}
}
