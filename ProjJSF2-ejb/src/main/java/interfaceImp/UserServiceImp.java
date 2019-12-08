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

import model.User;
import services.UserServiceRemote;

@Stateless
@LocalBean
public class UserServiceImp implements UserServiceRemote {
	@PersistenceContext(unitName = "ProjJSF2-ejb")
	EntityManager em;

	@Override
	public void ajouterUser(User u) {
		em.persist(u);
	}

	@Override
	public void supprimerUser(int Id) {
		em.remove(em.find(User.class, Id));
	}

	@Override
	public void modifierUser(User u) {
		em.merge(u);
	}

	@Override
	public List<User> getUsers() {
		List<User> ListUser = em.createQuery("Select e from User e", User.class).getResultList();
		return ListUser;
	}
	
	public User getUserById(int userID) {
		TypedQuery<User> query = 
				em.createQuery("select e from User e where e.userID=:userID", User.class);
		query.setParameter("userID", userID);
		User employe = null;
		try { employe = query.getSingleResult(); }
		catch (Exception e) { System.out.println("Erreur : " + e); }
		return employe;
	}

}
