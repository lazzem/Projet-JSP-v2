package managedBean;

import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import Enums.ClaimType;
import interfaceImp.ClaimServiceImp;
import model.Agent;
import model.Claim;



@ManagedBean(name="ClaimBean")
@ApplicationScoped
public class ClaimBean  implements Serializable {
	private static final long serialVersionUID = 1L;
	private String title;
	private String description;
	private ClaimType type;

	
	
	@EJB
	ClaimServiceImp ClaimService;
	
	public void addClaim() throws Exception {
		System.out.println("dssss");
		ClaimService.AjouterClaim(new Claim(title,description,type));
	}

	private List<Claim> ListClaims;
	
	public List<Claim> getClaims() {
		ListClaims = ClaimService.getAll();
		return ListClaims;
	}
	
	
	
	
	
	
	public List<Claim> getListClaims() {
		return ListClaims;
	}


	public void setListClaims(List<Claim> listClaim) {
		ListClaims = listClaim;
	}






	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ClaimType getType() {
		return type;
	}

	public void setType(ClaimType type) {
		this.type = type;
	}

	public ClaimServiceImp getClaimService() {
		return ClaimService;
	}

	public void setClaimService(ClaimServiceImp claimService) {
		ClaimService = claimService;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int AjouterClaim(Claim c) throws Exception {
		return ClaimService.AjouterClaim(c);
	}

	public boolean equals(Object arg0) {
		return ClaimService.equals(arg0);
	}

	public Agent findAnAgentFreeAndActif(ClaimType t) throws Exception {
		return ClaimService.findAnAgentFreeAndActif(t);
	}

	public List<Claim> getAll() {
		return ClaimService.getAll();
	}

	public int hashCode() {
		return ClaimService.hashCode();
	}

	public String toString() {
		return ClaimService.toString();
	}
	
	

	

	
}
