package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Boutiques database table.
 * 
 */
@Entity
@Table(name="Boutiques")
@NamedQuery(name="Boutique.findAll", query="SELECT b FROM Boutique b")
public class Boutique implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id_boutique")
	private int id_boutique;

	@Column(name="Ascisse_X")
	private float ascisse_X;

	@Column(name="Email")
	private String email;

	@Column(name="Heure_fermeture")
	private String heure_fermeture;

	@Column(name="Heure_ouverture")
	private String heure_ouverture;

	@Column(name="Nom")
	private String nom;

	@Column(name="Ordonné_Y")
	private float ordonné_Y;

	@Column(name="Phone")
	private String phone;

	@Column(name="Service")
	private String service;

	@Column(name="Zone")
	private String zone;

	//bi-directional many-to-one association to Ville
	@ManyToOne
	@JoinColumn(name="Id_ville")
	private Ville ville;

	//bi-directional many-to-many association to Produit
	@ManyToMany(mappedBy="boutiques")
	private List<Produit> produits;

	//bi-directional many-to-one association to Stock
	@OneToMany(mappedBy="boutique")
	private List<Stock> stocks;

	public Boutique() {
	}

	public int getId_boutique() {
		return this.id_boutique;
	}

	public void setId_boutique(int id_boutique) {
		this.id_boutique = id_boutique;
	}

	public float getAscisse_X() {
		return this.ascisse_X;
	}

	public void setAscisse_X(float ascisse_X) {
		this.ascisse_X = ascisse_X;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHeure_fermeture() {
		return this.heure_fermeture;
	}

	public void setHeure_fermeture(String heure_fermeture) {
		this.heure_fermeture = heure_fermeture;
	}

	public String getHeure_ouverture() {
		return this.heure_ouverture;
	}

	public void setHeure_ouverture(String heure_ouverture) {
		this.heure_ouverture = heure_ouverture;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public float getOrdonné_Y() {
		return this.ordonné_Y;
	}

	public void setOrdonné_Y(float ordonné_Y) {
		this.ordonné_Y = ordonné_Y;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getService() {
		return this.service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getZone() {
		return this.zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public Ville getVille() {
		return this.ville;
	}

	public void setVille(Ville ville) {
		this.ville = ville;
	}

	public List<Produit> getProduits() {
		return this.produits;
	}

	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}

	public List<Stock> getStocks() {
		return this.stocks;
	}

	public void setStocks(List<Stock> stocks) {
		this.stocks = stocks;
	}

	public Stock addStock(Stock stock) {
		getStocks().add(stock);
		stock.setBoutique(this);

		return stock;
	}

	public Stock removeStock(Stock stock) {
		getStocks().remove(stock);
		stock.setBoutique(null);

		return stock;
	}

	public Boutique(float ascisse_X, String email, String heure_fermeture, String heure_ouverture,
			String nom, float ordonné_Y, String phone, String service, String zone, Ville ville) {
		super();
		
		this.ascisse_X = ascisse_X;
		this.email = email;
		this.heure_fermeture = heure_fermeture;
		this.heure_ouverture = heure_ouverture;
		this.nom = nom;
		this.ordonné_Y = ordonné_Y;
		this.phone = phone;
		this.service = service;
		this.zone = zone;
		this.ville = ville;
	}

	

	public Boutique(String nom) {
		super();
		this.nom = nom;
		
	}
	
	

}