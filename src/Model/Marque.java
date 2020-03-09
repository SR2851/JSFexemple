package Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Marque {
	@Id
	@GeneratedValue
private int idMarque;
	@Column(unique=true)
private String nomMarque;
	@Temporal(TemporalType.DATE)
private Date dateCreation;
public int getIdMarque() {
	return idMarque;
}
public void setIdMarque(int idMarque) {
	this.idMarque = idMarque;
}
public String getNomMarque() {
	return nomMarque;
}
public void setNomMarque(String nomMarque) {
	this.nomMarque = nomMarque;
}
public Date getDateCreation() {
	return dateCreation;
}
public void setDateCreation(Date dateCreation) {
	this.dateCreation = dateCreation;
}
@Override
public String toString() {
	return "Marque [idMarque=" + idMarque + ", nomMarque=" + nomMarque + ", dateCreation=" + dateCreation + "]";
}
public Marque(String nomMarque, Date dateCreation) {
	super();
	this.nomMarque = nomMarque;
	this.dateCreation = dateCreation;
}
public Marque() {
	super();
}







}
