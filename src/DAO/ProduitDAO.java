package DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import Model.Marque;
import Model.Produit;

public class ProduitDAO implements IProduitDAO {

	@Override
	public int SaveProduit(Produit produit) {
		try {
			SessionFactory factory = ConnexionDB.getInstance().getFactory();
			Session session= factory.openSession();
			session.beginTransaction();
			session.save(produit);
			session.getTransaction().commit();
			return 1;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
		
	}

	@Override
	public List<Produit> listeProduit() {
		List<Produit> liste= new ArrayList<Produit>();
		try {
			SessionFactory factory = ConnexionDB.getInstance().getFactory();
			Session session= factory.openSession();
			session.beginTransaction();
			String q="Select * from Produit";
			SQLQuery query =session.createSQLQuery(q);
			query.addEntity(Produit.class);
			liste=query.list();
			
			
			return liste;
			
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
	}}

}
