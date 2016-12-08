package persistencia;

import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;

import java.util.ArrayList;
import org.hibernate.Query;

import dominio.Owner;
import dominio.Vehicle;

public class OwnerDao extends GeneralDao<Owner> {
	public OwnerDao() {
		super();
	}
	
	public Owner findByLicense(String license) throws HibernateException {
		Owner owner = null;
        try {     	
        	startOperation();
            Query query= session.createQuery("from Vehicle where license='"+license+"'");
            ArrayList array = (ArrayList) query.list();
            Vehicle vehicle=(Vehicle) array.get(0);
            owner=vehicle.getOwner();
            transaction.commit();
        } catch (HibernateException e) {
            throw e;
        } finally {
            HibernateFactory.close(session);
        }
        return owner;
	}
}
