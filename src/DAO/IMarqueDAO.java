package DAO;

import java.util.List;

import Model.Marque;


public interface IMarqueDAO {
public int ajoutMarque(Marque marque);
public List<Marque> listeMarque();
}
