package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Produit {
	@Id
	@GeneratedValue
private int idProduit;
private String nomProduit;
private String descProduit;
private double prixProduit;
@JoinColumn(name="idMarque")
@ManyToOne
private Marque marque;

public Marque getMarque() {
	return marque;
}
public void setMarque(Marque marque) {
	this.marque = marque;
}
public Produit(int idProduit, String nomProduit, String descProduit, double prixProduit) {
	super();
	this.idProduit = idProduit;
	this.nomProduit = nomProduit;
	this.descProduit = descProduit;
	this.prixProduit = prixProduit;
}
public Produit() {
	super();
}
public int getIdProduit() {
	return idProduit;
}
public void setIdProduit(int idProduit) {
	this.idProduit = idProduit;
}
public String getNomProduit() {
	return nomProduit;
}
public void setNomProduit(String nomProduit) {
	this.nomProduit = nomProduit;
}
public String getDescProduit() {
	return descProduit;
}
public void setDescProduit(String descProduit) {
	this.descProduit = descProduit;
}
public double getPrixProduit() {
	return prixProduit;
}
public void setPrixProduit(double prixProduit) {
	this.prixProduit = prixProduit;
}
@Override
public String toString() {
	return "Produit [idProduit=" + idProduit + ", nomProduit=" + nomProduit + ", descProduit=" + descProduit
			+ ", prixProduit=" + prixProduit + ", marque=" + marque + "]";
}



}
