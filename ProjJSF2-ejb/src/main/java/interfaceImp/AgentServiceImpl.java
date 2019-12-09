package interfaceImp;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.Agent;
import model.Claim;
import services.AgentRemote;


@Stateless
@LocalBean
public class AgentServiceImpl implements AgentRemote{
	@PersistenceContext(unitName = "ProjJSF2-ejb")
	EntityManager em;

	@Override
	public void AjouterAgent(Agent a) {
		em.persist(a);
	}

	@Override
	public List<Agent> getAll() {
		List<Agent> ListAgent = em.createQuery("Select e from Agent e", Agent.class).getResultList();
		return ListAgent;
	}

	
	@Override
	public void deleteAgent(int id) {
		em.remove(em.find(Agent.class, id));
		
	}

	@Override
	public void UpdateAgent(Agent agent) {
		em.merge(agent);
		
	}

}
