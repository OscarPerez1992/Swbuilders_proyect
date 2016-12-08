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
	public Owner findByDni(String dni) throws HibernateException {
		Owner owner = null;
        try {
            startOperation();    
            
           // Query query= session.createQuery("idOwner from OwnerVehicle where license=? and ");
           // query.setParameter(1, dni);      

            Query query= session.createQuery("from SanctionHolder where dni="+dni);// ¿? 
            ArrayList array= (ArrayList) query.list();
            owner = (Owner) array.get(0);
            transaction.commit();
        } catch (HibernateException e) {
            throw e;
        } finally {
            HibernateFactory.close(session);
        }
        return owner;
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
