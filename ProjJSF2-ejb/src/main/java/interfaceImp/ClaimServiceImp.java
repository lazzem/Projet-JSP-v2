package interfaceImp;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import Enums.ClaimType;
import Enums.Role;
import model.Agent;
import model.Claim;
import model.User;
import services.ClaimRemote;

@Stateless
@LocalBean
public class ClaimServiceImp implements ClaimRemote{
	@PersistenceContext(unitName = "ProjJSF2-ejb")
	EntityManager em;

	@Override
	public int AjouterClaim(Claim c) throws Exception {
		c.toString();
		c.setCreatedBy(em.find(User.class, c.getCreatedById()));
		System.out.print(c.getType());
		c.setResponsable(this.findAnAgentFreeAndActif(c.getType()));
		c.setFirstResponsable(c.getResponsable());
		c.setResolvedBy(null);
		em.persist(c);
		return c.getId();
	}
	
	
	@Override
	public Agent findAnAgentFreeAndActif(ClaimType t) throws Exception {
		Agent a;
		Role type = null;

		if (t == ClaimType.FINANCIERE) {
			type = Role.financial;
		} else if (t == ClaimType.TECHNIQUE) {
			type = Role.technical;
		} else if (t == ClaimType.RELATIONNELLE) {
			type = Role.relational;
		}

		String qlString = "SELECT a from Agent a where a.role=:t and a.dispoClaim=:d ORDER BY a.nbrClaimsResolved";
		Query query = em.createQuery(qlString, Agent.class).setParameter("d", "disponible").setParameter("t", type);
		List<Agent> agents = query.getResultList();
		System.out.println("160 - CLAIM TYPE " + t);

		if (agents.size() == 1) {
			a = (Agent) query.getResultList().get(0);
			a.setDispoClaim("indisponible");
			
			//System.out.println("done1");
			System.out.println(a.getRole());
		} else { // on prend l'agent ayant le moins de Réclamation traités
			TypedQuery<Agent> query2 = em
					.createQuery("SELECT a from Agent a WHERE a.role=:t ORDER BY nbrClaimsResolved DESC", Agent.class)
					.setParameter("t", type);
			a = query2.getResultList().get(0);
			//System.out.println("done2");
		}
		return a;
		
	}


	
	
	@Override
	public List<Claim> getAll() {
		List<Claim> ListClaim = em.createQuery("Select e from Claim e", Claim.class).getResultList();
		return ListClaim;
	}
	
}
