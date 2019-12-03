package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the Packs database table.
 * 
 */
@Entity
@Table(name="Packs")
@NamedQuery(name="Pack.findAll", query="SELECT p FROM Pack p")
public class Pack implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="IdPack")
	private int idPack;

	@Column(name="DateDebut")
	private Date dateDebut;

	@Column(name="DateFin")
	private Date dateFin;

	@Column(name="Description")
	private String description;

	@Column(name="IdProduit")
	private int idProduit;

	@Column(name="Image")
	private String image;

	@Column(name="Prix")
	private float prix;

	@Column(name="Titre")
	private String titre;

	//bi-directional many-to-many association to Produit
	@ManyToMany(mappedBy="packs")
	private List<Produit> produits;

	public Pack() {
	}

	public int getIdPack() {
		return this.idPack;
	}

	public void setIdPack(int idPack) {
		this.idPack = idPack;
	}

	public Date getDateDebut() {
		return this.dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return this.dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public Object getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getIdProduit() {
		return this.idProduit;
	}

	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}

	public Object getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public float getPrix() {
		return this.prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public Object getTitre() {
		return this.titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public List<Produit> getProduits() {
		return this.produits;
	}

	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}

}