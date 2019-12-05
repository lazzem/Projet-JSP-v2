package interfaceImp;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.Produit;
import services.ProduitServiceRemote;

@Stateless
@LocalBean
public class ProduitServiceImp  implements ProduitServiceRemote {
	@PersistenceContext(unitName = "ProjJSF2-ejb")
	EntityManager em;
	
	@Override
	public List<Produit> getProduits() {
		List<Produit> ListProduit = em.createQuery("Select e from Produit e", Produit.class).getResultList();
		return ListProduit;
	}

}
