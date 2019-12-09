package services;

import java.util.List;

import Enums.ClaimType;
import model.Agent;
import model.Claim;

public interface ClaimRemote {

	public int AjouterClaim(Claim c) throws Exception;
	public Agent findAnAgentFreeAndActif(ClaimType t) throws Exception ;
	public List<Claim> getAll();
	public void deleteClaim(int id);
}
