package services;

import java.util.List;

import javax.ejb.Remote;

import model.Boutique;
import model.User;

@Remote
public interface BoutiqueInterface {
	public void ajouterBoutique(Boutique b);
	public void ajouterBoutique(int id_boutique, String nom);
	public void supprimerBoutique(int Id);
	public List<Boutique> getBoutiques();
	

}
