package interfaceImp;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import model.Produit;
import model.User;
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

	@Override
	public Produit getProdId(int id_produit) {
		TypedQuery<Produit> query = 
				em.createQuery("select e from Produit e where e.id_produit=:id_produit", Produit.class);
		query.setParameter("id_produit", id_produit);
		Produit pr = null;
		try { pr = query.getSingleResult(); }
		catch (Exception e) { System.out.println("Erreur : " + e); }
		return pr;
	}

}
