package model;

import java.io.Serializable;
import java.sql.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import Enums.Role;



@Entity
@Table(name="Agent")
//@PrimaryKeyJoinColumn(name="ID")
@NamedQuery(name="Agent.findAll", query="SELECT o FROM Agent o")
public class Agent implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="IdAgent")
	private int IdAgent;
	
	
	private String contractType;
	private Date startDate;
	private Date endDate;
	private double salary;

	
	@Column
	private int nbrClaimsOpenedAndResolved;
	private int nbrClaimsOpened;
	private int nbrClaimsResolved;
	private long moyAssiduite;
	private long moyReponse;
	
	@Column 
	private String dispoClaim;
	
	@Enumerated(EnumType.STRING)
	private Role role;
	
	public Agent() {
		super();
		this.nbrClaimsOpened = 0 ; 
		this.nbrClaimsResolved = 0 ; 
		this.nbrClaimsOpenedAndResolved = 0 ; 
		this.moyAssiduite = 0 ; 
		this.moyReponse = 0 ; 
	}
	
	public Agent(int idAgent, String contractType, Date startDate, Date endDate, double salary,
			int nbrClaimsOpenedAndResolved, int nbrClaimsOpened, int nbrClaimsResolved, long moyAssiduite,
			long moyReponse, String dispoClaim, Role role) {
		super();
		IdAgent = idAgent;
		this.contractType = contractType;
		this.startDate = startDate;
		this.endDate = endDate;
		this.salary = salary;
		this.nbrClaimsOpenedAndResolved = nbrClaimsOpenedAndResolved;
		this.nbrClaimsOpened = nbrClaimsOpened;
		this.nbrClaimsResolved = nbrClaimsResolved;
		this.moyAssiduite = moyAssiduite;
		this.moyReponse = moyReponse;
		this.dispoClaim = dispoClaim;
		this.role = role;
	}

	public String getContractType() {
		return contractType;
	}

	public void setContractType(String contractType) {
		this.contractType = contractType;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	public int getNbrClaimsOpenedAndResolved() {
		return nbrClaimsOpenedAndResolved;
	}

	public void setNbrClaimsOpenedAndResolved(int nbrClaimsOpenedAndResolved) {
		this.nbrClaimsOpenedAndResolved = nbrClaimsOpenedAndResolved;
	}

	public String getDispoClaim() {
		return dispoClaim;
	}

	public void setDispoClaim(String dispoClaim) {
		this.dispoClaim = dispoClaim;
	}
	
	

	public int getNbrClaimsOpened() {
		return nbrClaimsOpened;
	}

	public void setNbrClaimsOpened(int nbrClaimsOpened) {
		this.nbrClaimsOpened = nbrClaimsOpened;
	}

	public int getNbrClaimsResolved() {
		return nbrClaimsResolved;
	}

	public void setNbrClaimsResolved(int nbrClaimsResolved) {
		this.nbrClaimsResolved = nbrClaimsResolved;
	}

	public long getMoyAssiduite() {
		return moyAssiduite;
	}

	public void setMoyAssiduite(long moyAssiduite) {
		this.moyAssiduite = moyAssiduite;
	}

	public long getMoyReponse() {
		return moyReponse;
	}

	public void setMoyReponse(long moyReponse) {
		this.moyReponse = moyReponse;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((contractType == null) ? 0 : contractType.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agent other = (Agent) obj;
		if (contractType == null) {
			if (other.contractType != null)
				return false;
		} else if (!contractType.equals(other.contractType))
			return false;
		if (endDate == null) {
			if (other.endDate != null)
				return false;
		} else if (!endDate.equals(other.endDate))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		return true;
	}

	
	
	
	
}
