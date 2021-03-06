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
import org.hibernate.query.Query;

import co.edu.campusucc.sd.modelo.Biometria;
import co.edu.campusucc.sd.modelo.Cliente;

/**
 * Home object for domain model class Cliente.
 * 
 * @see co.edu.campusucc.sd.modelo.Cliente
 * @author Hibernate Tools
 */
public class ClienteDAO {

	private static final Logger logger = Logger.getLogger(ClienteDAO.class.getName());

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

	public void persist(Cliente transientInstance) {
		logger.log(Level.INFO, "persisting Cliente instance");
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
	
	public void consultar(String idCliente) {
		logger.log(Level.INFO, "persisting Cliente instance");
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Query consulta = session.createQuery("from Cliente where idCliente =: idCliente");
			consulta.setParameter("idCliente", idCliente);
			List<Cliente> listCliente = consulta.list();
			Cliente cliente= (Cliente)listCliente.get(0);
			System.out.println(cliente);
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

	public void attachDirty(Cliente instance) {
		logger.log(Level.INFO, "attaching dirty Cliente instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			logger.log(Level.INFO, "attach successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "attach failed", re);
			throw re;
		}
	}

	public void attachClean(Cliente instance) {
		logger.log(Level.INFO, "attaching clean Cliente instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			logger.log(Level.INFO, "attach successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "attach failed", re);
			throw re;
		}
	}

	public void delete(Cliente persistentInstance) {
		logger.log(Level.INFO, "deleting Cliente instance");
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

	public Cliente merge(Cliente detachedInstance) {
		logger.log(Level.INFO, "merging Cliente instance");
		try {
			Cliente result = (Cliente) sessionFactory.getCurrentSession().merge(detachedInstance);
			logger.log(Level.INFO, "merge successful");
			return result;
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "merge failed", re);
			throw re;
		}
	}

	public Cliente findById(java.lang.String id) {
		logger.log(Level.INFO, "getting Cliente instance with id: " + id);
		try {
			Cliente instance = (Cliente) sessionFactory.getCurrentSession().get("co.edu.campusucc.sd.modelo.Cliente",
					id);
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

	public List findByExample(Cliente instance) {
		logger.log(Level.INFO, "finding Cliente instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("co.edu.campusucc.sd.modelo.Cliente")
					.add(Example.create(instance)).list();
			logger.log(Level.INFO, "find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "find by example failed", re);
			throw re;
		}
	}
}
