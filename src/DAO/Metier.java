package DAO;

import Model.Produit;

public class Metier {
public static void main(String[] args) {
	Produit produit=new Produit(1, "dfdf", "dfdf", 200.2);
	IProduitDAO daoP=new ProduitDAO();
	daoP.SaveProduit(produit);
}
}
