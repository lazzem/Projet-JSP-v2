package interfaceImp;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.Commande;
import model.Devi;
import services.CommandServiceRemote;

@Stateless
@LocalBean
public class CommandeServiceImp implements CommandServiceRemote{
	@PersistenceContext(unitName = "ProjJSF2-ejb")
	EntityManager em;

	@Override
	public List<Commande> getCommande() {
		List<Commande> LisCommande = em.createQuery("Select e from Commande e", Commande.class).getResultList();
		return LisCommande;
	}

}
