package managedBean;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import interfaceImp.BoutiqueService;
import model.Boutique;
import model.User;
import model.Ville;

@ManagedBean(name="BoutBean")
@ApplicationScoped
public class BoutiqueBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private float ascisse_X;
	private String email;
	private String heure_fermeture;
	private String heure_ouverture;
	private String nom;
	private float ordonné_Y;
	private String phone;
	private String service;
	private String zone;
	private Ville ville;
	
	@EJB
	BoutiqueService  BoutiqueServ;
	
	public void addBoutique() {
		BoutiqueServ.ajouterBoutique(new Boutique(nom));
	}
	

	
	private List<Boutique> ListBoutique;

	public List<Boutique> getBoutiques() {
		ListBoutique = BoutiqueServ.getBoutiques();
		return ListBoutique;
	}

	public float getAscisse_X() {
		return ascisse_X;
	}

	public void setAscisse_X(float ascisse_X) {
		this.ascisse_X = ascisse_X;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHeure_fermeture() {
		return heure_fermeture;
	}

	public void setHeure_fermeture(String heure_fermeture) {
		this.heure_fermeture = heure_fermeture;
	}

	public String getHeure_ouverture() {
		return heure_ouverture;
	}

	public void setHeure_ouverture(String heure_ouverture) {
		this.heure_ouverture = heure_ouverture;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public float getOrdonné_Y() {
		return ordonné_Y;
	}

	public void setOrdonné_Y(float ordonné_Y) {
		this.ordonné_Y = ordonné_Y;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public Ville getVille() {
		return ville;
	}

	public void setVille(Ville ville) {
		this.ville = ville;
	}

	public BoutiqueService getBoutiqueServ() {
		return BoutiqueServ;
	}

	public void setBoutiqueServ(BoutiqueService boutiqueServ) {
		BoutiqueServ = boutiqueServ;
	}

	public List<Boutique> getListBoutique() {
		return ListBoutique;
	}

	public void setListBoutique(List<Boutique> listBoutique) {
		ListBoutique = listBoutique;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public BoutiqueBean() {
		super();
	}
	
	
	
	
	
	

}
