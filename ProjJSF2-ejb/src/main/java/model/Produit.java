package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Produit database table.
 * 
 */
@Entity
@NamedQuery(name="Produit.findAll", query="SELECT p FROM Produit p")
public class Produit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id_produit")
	private int id_produit;

	@Column(name="Description")
	private String description;

	@Column(name="IdPack")
	private int idPack;

	@Column(name="Image")
	private String image;

	@Column(name="Libelle")
	private String libelle;

	@Column(name="Nom")
	private String nom;

	@Column(name="Price")
	private double price;

	@Column(name="Quantitee")
	private int quantitee;

	//bi-directional many-to-one association to Panier
	@OneToMany(mappedBy="produit")
	private List<Panier> paniers;

	//bi-directional many-to-one association to Category
	@ManyToOne
	@JoinColumn(name="Id_categorie")
	private Category category;

	//bi-directional many-to-one association to Publicite
	@OneToMany(mappedBy="produit")
	private List<Publicite> publicites;

	//bi-directional many-to-one association to Stock
	@OneToMany(mappedBy="produit")
	private List<Stock> stocks;

	public Produit() {
	}

	public int getId_produit() {
		return this.id_produit;
	}

	public void setId_produit(int id_produit) {
		this.id_produit = id_produit;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getIdPack() {
		return this.idPack;
	}

	public void setIdPack(int idPack) {
		this.idPack = idPack;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantitee() {
		return this.quantitee;
	}

	public void setQuantitee(int quantitee) {
		this.quantitee = quantitee;
	}

	public List<Panier> getPaniers() {
		return this.paniers;
	}

	public void setPaniers(List<Panier> paniers) {
		this.paniers = paniers;
	}

	public Panier addPanier(Panier panier) {
		getPaniers().add(panier);
		panier.setProduit(this);

		return panier;
	}

	public Panier removePanier(Panier panier) {
		getPaniers().remove(panier);
		panier.setProduit(null);

		return panier;
	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public List<Publicite> getPublicites() {
		return this.publicites;
	}

	public void setPublicites(List<Publicite> publicites) {
		this.publicites = publicites;
	}

	public Publicite addPublicite(Publicite publicite) {
		getPublicites().add(publicite);
		publicite.setProduit(this);

		return publicite;
	}

	public Publicite removePublicite(Publicite publicite) {
		getPublicites().remove(publicite);
		publicite.setProduit(null);

		return publicite;
	}

	public List<Stock> getStocks() {
		return this.stocks;
	}

	public void setStocks(List<Stock> stocks) {
		this.stocks = stocks;
	}

	public Stock addStock(Stock stock) {
		getStocks().add(stock);
		stock.setProduit(this);

		return stock;
	}

	public Stock removeStock(Stock stock) {
		getStocks().remove(stock);
		stock.setProduit(null);

		return stock;
	}

}