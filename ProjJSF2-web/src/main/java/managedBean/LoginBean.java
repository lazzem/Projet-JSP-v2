package managedBean;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import interfaceImp.EmployeServiceAuthentification;
import model.User;

@ManagedBean(name = "loginBean")
@SessionScoped
public class LoginBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private String login;
	private String password;
	private User employe;
	private Boolean loggedIn;
	private String role;

	@EJB
	EmployeServiceAuthentification employeServiceAuthentification;

	public String doLogin() {
		String navigateTo = "null";
		employe = employeServiceAuthentification.getEmployeAuthentificationByEmailAndPassword(login, password);
		if (employe != null ) {
			if(employe.getRole().equals("ADMINISTRATEUR")) {
			navigateTo = "/Template/Back/Pages/HomeAdmin?faces-redirect=true";
			System.out.println("mriguil");
			loggedIn = true;
			}
			else {navigateTo = "/Template/Front/Pages/Home?faces-redirect=true";
			System.out.println("mriguil");
			loggedIn = true;
			}
				
		} else {
			navigateTo = "/Template/Back/Pages/User/IndexUser?faces-redirect=true";
			System.out.println("mriguil");
			loggedIn = true;
			FacesContext.getCurrentInstance().addMessage("form:btn", new FacesMessage("Failed to login"));
			System.out.println("mich mriguil");
		}
		return navigateTo;
	}

	public String doLogout() {
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		return "/login?faces-redirect=true";
	}

	public LoginBean() {
		super();
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User getEmploye() {
		return employe;
	}

	public void setEmploye(User employe) {
		this.employe = employe;
	}

	public Boolean getLoggedIn() {
		return loggedIn;
	}

	public void setLoggedIn(Boolean loggedIn) {
		this.loggedIn = loggedIn;
	}

	public EmployeServiceAuthentification getEmployeService() {
		return employeServiceAuthentification;
	}

	public void setEmployeService(EmployeServiceAuthentification employeService) {
		this.employeServiceAuthentification = employeService;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

//Générer un constructeur sans argument, les Getters et les Setters
}
