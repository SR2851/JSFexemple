package DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import Model.Marque;


public class MarqueDAO implements IMarqueDAO {

	@Override
	public int ajoutMarque(Marque marque) {
		try {
			SessionFactory factory = ConnexionDB.getInstance().getFactory();
			Session session= factory.openSession();
			session.beginTransaction();
			session.save(marque);
			session.getTransaction().commit();
			return 1;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}}

	@Override
	public List<Marque> listeMarque() {
		List<Marque> liste= new ArrayList<Marque>();
		try {
			SessionFactory factory = ConnexionDB.getInstance().getFactory();
			Session session= factory.openSession();
			session.beginTransaction();
			String q="Select * from Marque";
			SQLQuery query =session.createSQLQuery(q);
			query.addEntity(Marque.class);
			liste=query.list();
			
			
			return liste;
			
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
	}}

}
