package persistencia;

import java.util.ArrayList;

import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Query;

import dominio.Driver;

public class DriverDao extends GeneralDao<Driver> {
	public DriverDao() {
		super();
	}
	
	public Driver findByDni(String dni) throws HibernateException {
		Driver driver = null;
        try {
            startOperation();
            Query query=(Query) session.createQuery("from Driver where dni=?");
            query.setParameter(0, dni);
            ArrayList array= (ArrayList) query.list();
            driver = (Driver) array.get(0);
            transaction.commit();
        } catch (HibernateException e) {
            throw e;
        } finally {
            HibernateFactory.close(session);
        }
        return driver;
	}
}
