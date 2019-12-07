package interfaceImp;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.Boutique;
import model.User;
import services.BoutiqueInterface;

@Stateless
@LocalBean
public class BoutiqueService implements BoutiqueInterface {

	@PersistenceContext(unitName = "ProjJSF2-ejb")
	EntityManager bt;


	public void ajouterBoutique(Boutique b) {
		bt.persist(b);
		
	}

	@Override
	public void ajouterBoutique(int id_boutique, String nom) {
		
		
	}

	@Override
	public void supprimerBoutique(int Id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Boutique> getBoutiques() {
		List<Boutique> ListBoutique = bt.createQuery("Select e from Boutique e", Boutique.class).getResultList();
		return ListBoutique;
	}

}
