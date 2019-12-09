package managedBean;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import Enums.Role;
import interfaceImp.AgentServiceImpl;
import model.Agent;



@ManagedBean(name="AgentBean")
@ApplicationScoped
public class AgentBean  implements Serializable {
	private static final long serialVersionUID = 1L;

	private String name;
	private String image;
	private String email;
	private Date startDate;
	private Date endDate;
	private Role role;
	private double salary;
	private String contractType;
	private String dispoClaim;

	
	@EJB
	AgentServiceImpl AgentService;
	
//	public void addAgent() {
//		AgentService.AjouterAgent(new Agent( contractType,startDate,endDate,salary,name,image, email,role));
//	}

		private List<Agent> ListAgents;
	
		public List<Agent> getAgents() {
		ListAgents = AgentService.getAll();
		return ListAgents;
	}
	

		public List<Agent> getListAgents() {
			return ListAgents;
		}


		public void RemoveAgent(int id)
	{
		AgentService.deleteAgent(id);
	}
	

		public String modifier(Agent agent) 
		{
//			this.setName(agent.getName());
//			this.setEmail(agent.getEmail());
//			this.setImage(agent.getImage());
			this.setSalary(agent.getSalary());
			this.setContractType(agent.getContractType());
			this.setRole(agent.getRole());
			this.setStartDate(agent.getStartDate());
			this.setEndDate(agent.getEndDate());
			
			
			return "/Agent/EditAgent?faces-redirect=true";
		}
		
//		public String mettreAjourAgent() {
//			AgentService.UpdateAgent(new Agent( contractType, startDate,endDate, salary,name,image, email,role));
//			return "/Agent/ListAgent?faces-redirect=true";
//		}
//		
//		
//		
//		
		
		
		
		
		
		
		


		public void setListAgents(List<Agent> listAgents) {
			ListAgents = listAgents;
		}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getContractType() {
		return contractType;
	}

	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	public AgentServiceImpl getAgentService() {
		return AgentService;
	}

	public void setAgentService(AgentServiceImpl agentService) {
		AgentService = agentService;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	

	
	


	
}
