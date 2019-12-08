package services;

import java.util.List;

import javax.ejb.Remote;

import model.Produit;
@Remote
public interface ProduitServiceRemote {
	public List<Produit> getProduits();
	public Produit getProdId(int id_produit);

}
