package managedBean;

import java.io.Serializable;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import Enums.ClaimType;
import Enums.Role;



@ManagedBean(name="dataClaim")
@ApplicationScoped
public class DataClaimType implements Serializable{

	private static final long serialVersionUID = 1L;

	
	public ClaimType[] getClaims()
	{
		return ClaimType.values();
	}
	
	
}
