package managedBean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.ejb.ApplicationException;
import javax.ejb.EJB;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import interfaceImp.UserServiceImp;
import model.User;

@ManagedBean(name="userBean")
@ApplicationScoped
public class UserBean  implements Serializable {
	private static final long serialVersionUID = 1L;
	private Date birthDate;
	private int cin; 
	private String confirmPassword; 
	private String email; 
	private int gender; 
	private boolean isActive;
	private String lastName; 
	private String name; 
	private String password;
	private int phone; 
	private String picture;
	private String role; 
	private Date signUpDate;
	private String userName;
	private int userID;
	
	@EJB
	UserServiceImp UserService;
	
	public void addUser() {
		UserService.ajouterUser(new User(birthDate ,cin,  confirmPassword,  email,  gender,  isActive,
				 lastName,  name,  password,  phone,  picture,  role, signUpDate,
				 userName));
	}

	private List<User> ListUser;

	public List<User> getUsers() {
		ListUser = UserService.getUsers();
		return ListUser;
	}

	//private Integer postIdToBeUpdated;

	public void updateUser() {
		UserService.modifierUser(new User(userID,birthDate,  cin,  confirmPassword,  email,  gender,  isActive,
				 lastName,  name,  password,  phone,  picture,  role,  signUpDate,
				 userName));
	}
	
	public void removeUser(int IdUser) {
		UserService.supprimerUser(IdUser);
	}
	
	
	//Getter & Setters
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public int getCin() {
		return cin;
	}

	public void setCin(int cin) {
		this.cin = cin;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Date getSignUpDate() {
		return signUpDate;
	}

	public void setSignUpDate(Date signUpDate) {
		this.signUpDate = signUpDate;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

public int getUserID() {
	return userID;
}
public void setUserID(int userID) {
	this.userID = userID;
}

	public List<User> getListUser() {
		return ListUser;
	}

	public void setListUser(List<User> listUser) {
		ListUser = listUser;
	}

	public List<User> getAllUsers() {
		return UserService.getUsers();
	}
	
	public UserBean() {
		super();
	}
	public UserServiceImp getUserService() {
		return UserService;
	}
	

	public void setUserService(UserServiceImp userService) {
		UserService = userService;
	}

}
