package services;

import java.util.List;

import model.Agent;


public interface AgentRemote {

	public void AjouterAgent(Agent a);
	public List<Agent> getAll();
	public void deleteAgent(int id);
	void UpdateAgent(Agent agent);
}
