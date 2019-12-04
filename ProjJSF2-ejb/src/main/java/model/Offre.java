package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;


/**
 * The persistent class for the Offres database table.
 * 
 */
@Entity
@Table(name="Offres")
@NamedQuery(name="Offre.findAll", query="SELECT o FROM Offre o")
public class Offre implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="IdOffer")
	private int idOffer;

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

	@Column(name="Titee")
	private String titee;

	//bi-directional many-to-one association to Produit
	@ManyToOne
	@JoinColumn(name="Products_Id_produit")
	private Produit produit;

	public Offre() {
	}

	public int getIdOffer() {
		return this.idOffer;
	}

	public void setIdOffer(int idOffer) {
		this.idOffer = idOffer;
	}

	public Date getDateDebut() {
		return this.dateDebut;
	}

	public void setDateDebut(Timestamp dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return this.dateFin;
	}

	public void setDateFin(Timestamp dateFin) {
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

	public Object getTitee() {
		return this.titee;
	}

	public void setTitee(String titee) {
		this.titee = titee;
	}

	public Produit getProduit() {
		return this.produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

}