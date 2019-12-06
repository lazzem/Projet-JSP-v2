package interfaceImp;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import model.Publicite;

import services.PubliciteServiceRemote;


@Stateless
@LocalBean
public class PubliciteServiceImp implements PubliciteServiceRemote {
	@PersistenceContext(unitName = "ProjJSF2-ejb")
	EntityManager em;

	@Override
	public void ajouterPublicite(Publicite u) {
		em.persist(u);
		
	}

	@Override
	public void modifierPublicite(Publicite u, int Id) {
		
	}

	@Override
	public void supprimerPublicite(int Id) {
		em.remove(em.find(Publicite.class, Id));
		
	}

	@Override
	public List<Publicite> getPublicite() {
		List<Publicite> ListPublicite = em.createQuery("Select e from Publicite e", Publicite.class).getResultList();
		return ListPublicite;
	}



}
