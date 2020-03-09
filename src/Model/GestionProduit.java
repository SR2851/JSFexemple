package Model;

import java.util.List;

import javax.faces.bean.ManagedBean;

import DAO.IMarqueDAO;
import DAO.IProduitDAO;
import DAO.MarqueDAO;
import DAO.ProduitDAO;
@ManagedBean(name="gp")
public class GestionProduit {
private Produit produit=new Produit();
private IProduitDAO daoP=new ProduitDAO();

private Marque marque=new Marque();
public Marque getMarque() {
	return marque;
}

public void setMarque(Marque marque) {
	this.marque = marque;
}

private IMarqueDAO daoM=new MarqueDAO();



	
	public IMarqueDAO getDaoM() {
	return daoM;
}

public void setDaoM(IMarqueDAO daoM) {
	this.daoM = daoM;
}

	public String ajoutProduit() {
		produit.setMarque(marque);
		if(daoP.SaveProduit(produit)==1) {
			return "succes";
		}
		return "failed";
	}
	
	public List<Produit> listeProduit(){
		return daoP.listeProduit();
	}
	
	public String ajoutMarque() {
		if(daoM.ajoutMarque(marque)==1) {
			return "succes";
		}
		return "failed";
	}
	public List<Marque> listeMarque(){
		return daoM.listeMarque();
	}


	public Produit getProduit() {
		return produit;
	}


	public void setProduit(Produit produit) {
		this.produit = produit;
	}


	public IProduitDAO getDaoP() {
		return daoP;
	}


	public void setDaoP(IProduitDAO daoP) {
		this.daoP = daoP;
	}
	
	public String createProduit() {
		
		return "createProduit";
	}
}
