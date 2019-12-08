package interfaceImp;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import model.Devi;
import model.Produit;
import model.User;
import services.DevisServiceRemote;

@Stateless
@LocalBean
public class DevisServiceImp implements DevisServiceRemote {
	@PersistenceContext(unitName = "ProjJSF2-ejb")
	EntityManager em;

	@Override
	public void ajouterDevis(Devi d) {
		em.persist(d);		
	}

	@Override
	public void modifierDevis(Devi d, int Id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimerDevis(int Id) {
		em.remove(em.find(Devi.class, Id));
	}

	@Override
	public List<Devi> getDevis() {
		List<Devi> ListDevis = em.createQuery("Select e from Devi e", Devi.class).getResultList();
		return ListDevis;
	}

	@Override
	public List<Devi> getDevisUser(int Id) {
		List<Devi> ListDevis = em.createQuery("Select e from Devi e where e.idUser=:Id", Devi.class).getResultList();
		return ListDevis;
	}

	@Override
	public Produit getProdId(int id_produit) {
		TypedQuery<Produit> query = 
				em.createQuery("select p from Produit p where p.id_produit=:id_produit", Produit.class);
		query.setParameter("id_produit", id_produit);
		Produit pr = null;
		try { pr = query.getSingleResult(); }
		catch (Exception e) { System.out.println("Erreur : " + e); }
		return pr;
	}

	@Override
	public void traiterDevis(Devi d) {
		em.merge(d);
	}

}
