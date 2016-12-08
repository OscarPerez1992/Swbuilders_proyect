package persistencia;

import java.util.ArrayList;

import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Query;

import dominio.Vehicle;

public class VehicleDao extends GeneralDao<Vehicle> {
	public VehicleDao() {
		super();
	}
	
	public Vehicle findByLicense(String license) throws HibernateException {
		Vehicle vehicle = null;
        try {
            startOperation();
            Query query=(Query) session.createQuery("from Vehicle where license=?");
            query.setParameter(0, license);
            ArrayList array= (ArrayList) query.list();
            vehicle = (Vehicle) array.get(0);
            transaction.commit();
        } catch (HibernateException e) {
            throw e;
        } finally {
            HibernateFactory.close(session);
        }
        return vehicle;
	}
}
