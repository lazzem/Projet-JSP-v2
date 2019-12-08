package model;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the Users database table.
 * 
 */
@Entity
@Table(name="Users")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="UserID")
	private int userID;

	@Column(name="BirthDate")
	private Date birthDate;

	@Column(name="CIN")
	private int cin;

	@Column(name="ConfirmPassword")
	private String confirmPassword;

	@Column(name="Email")
	private String email;

	@Column(name="Gender")
	private int gender;

	@Column(name="IsActive")
	private boolean isActive;

	@Column(name="LastName")
	private String lastName;

	@Column(name="Name")
	private String name;

	@Column(name="Password")
	private String password;

	@Column(name="Phone")
	private int phone;

	@Column(name="Picture")
	private String picture;

	@Column(name="Role")
	private String role;

	@Column(name="SignUpDate")
	private Date signUpDate;

	@Column(name="UserName")
	private String userName;

	//bi-directional many-to-one association to Commande
	@OneToMany(mappedBy="user")
	private List<Commande> commandes;

	//bi-directional many-to-one association to Devi
	@OneToMany(mappedBy="user")
	private List<Devi> devis;

	//bi-directional many-to-one association to Newslettre
	@OneToMany(mappedBy="user")
	private List<Newslettre> newslettres;

	//bi-directional many-to-one association to Panier
	@OneToMany(mappedBy="user")
	private List<Panier> paniers;

	public User() {
	}

	public int getUserID() {
		return this.userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public Date getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public int getCin() {
		return this.cin;
	}

	public void setCin(int cin) {
		this.cin = cin;
	}

	public String getConfirmPassword() {
		return this.confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getGender() {
		return this.gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getPhone() {
		return this.phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getPicture() {
		return this.picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Date getSignUpDate() {
		return this.signUpDate;
	}

	public void setSignUpDate(Date signUpDate) {
		this.signUpDate = signUpDate;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<Commande> getCommandes() {
		return this.commandes;
	}

	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}

	public Commande addCommande(Commande commande) {
		getCommandes().add(commande);
		commande.setUser(this);

		return commande;
	}

	public Commande removeCommande(Commande commande) {
		getCommandes().remove(commande);
		commande.setUser(null);

		return commande;
	}

	public List<Devi> getDevis() {
		return this.devis;
	}

	public void setDevis(List<Devi> devis) {
		this.devis = devis;
	}

	public Devi addDevi(Devi devi) {
		getDevis().add(devi);
		devi.setUser(this);

		return devi;
	}

	public Devi removeDevi(Devi devi) {
		getDevis().remove(devi);
		devi.setUser(null);

		return devi;
	}

	public List<Newslettre> getNewslettres() {
		return this.newslettres;
	}

	public void setNewslettres(List<Newslettre> newslettres) {
		this.newslettres = newslettres;
	}

	public Newslettre addNewslettre(Newslettre newslettre) {
		getNewslettres().add(newslettre);
		newslettre.setUser(this);

		return newslettre;
	}

	public Newslettre removeNewslettre(Newslettre newslettre) {
		getNewslettres().remove(newslettre);
		newslettre.setUser(null);

		return newslettre;
	}

	public List<Panier> getPaniers() {
		return this.paniers;
	}

	public void setPaniers(List<Panier> paniers) {
		this.paniers = paniers;
	}

	public Panier addPanier(Panier panier) {
		getPaniers().add(panier);
		panier.setUser(this);

		return panier;
	}

	public Panier removePanier(Panier panier) {
		getPaniers().remove(panier);
		panier.setUser(null);

		return panier;
	}

	public User(Date birthDate, int cin, String confirmPassword, String email, int gender, boolean isActive,
			String lastName, String name, String password, int phone, String picture, String role, Date signUpDate,
			String userName) {
		super();
		this.birthDate = birthDate;
		this.cin = cin;
		this.confirmPassword = confirmPassword;
		this.email = email;
		this.gender = gender;
		this.isActive = isActive;
		this.lastName = lastName;
		this.name = name;
		this.password = password;
		this.phone = phone;
		this.picture = picture;
		this.role = role;
		this.signUpDate = signUpDate;
		this.userName = userName;
	}
	
	

}