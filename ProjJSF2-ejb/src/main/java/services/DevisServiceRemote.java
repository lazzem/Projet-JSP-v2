package services;

import java.util.List;

import javax.ejb.Remote;

import model.Devi;
import model.Produit;

@Remote
public interface DevisServiceRemote {
	public void ajouterDevis(Devi d);
	public void modifierDevis(Devi d,int Id);
	public void traiterDevis(Devi d);
	public void supprimerDevis(int Id);
	public List<Devi> getDevis();
	public List<Devi> getDevisUser(int Id);
	public Produit getProdId(int id_produit);

}
