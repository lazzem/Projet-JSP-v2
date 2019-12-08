//package model;
//
//import java.io.Serializable;
//import javax.persistence.*;
//import java.sql.Date;
//import java.util.List;
//
//
///**
// * The persistent class for the Packs database table.
// * 
// */
//@Entity
//@Table(name="Packs")
//@NamedQuery(name="Pack.findAll", query="SELECT p FROM Pack p")
//public class Pack implements Serializable {
//	private static final long serialVersionUID = 1L;
//
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	@Column(name="IdPack")
//	private int idPack;
//
//	@Column(name="DateDebut")
//	private Date dateDebut;
//
//	@Column(name="DateFin")
//	private Date dateFin;
//
//	@Column(name="Description")
//	private String description;
//
//	@Column(name="IdProduit")
//	private int idProduit;
//
//	@Column(name="Image")
//	private String image;
//
//	@Column(name="Prix")
//	private float prix;
//
//	@Column(name="Titre")
//	private String titre;
//
//	//bi-directional many-to-one association to PacksProduit
//	@OneToMany(mappedBy="pack")
//	private List<PacksProduit> packsProduits;
//
//	public Pack() {
//	}
//
//	public int getIdPack() {
//		return this.idPack;
//	}
//
//	public void setIdPack(int idPack) {
//		this.idPack = idPack;
//	}
//
//	public Date getDateDebut() {
//		return this.dateDebut;
//	}
//
//	public void setDateDebut(Date dateDebut) {
//		this.dateDebut = dateDebut;
//	}
//
//	public Date getDateFin() {
//		return this.dateFin;
//	}
//
//	public void setDateFin(Date dateFin) {
//		this.dateFin = dateFin;
//	}
//
//	public String getDescription() {
//		return this.description;
//	}
//
//	public void setDescription(String description) {
//		this.description = description;
//	}
//
//	public int getIdProduit() {
//		return this.idProduit;
//	}
//
//	public void setIdProduit(int idProduit) {
//		this.idProduit = idProduit;
//	}
//
//	public String getImage() {
//		return this.image;
//	}
//
//	public void setImage(String image) {
//		this.image = image;
//	}
//
//	public float getPrix() {
//		return this.prix;
//	}
//
//	public void setPrix(float prix) {
//		this.prix = prix;
//	}
//
//	public String getTitre() {
//		return this.titre;
//	}
//
//	public void setTitre(String titre) {
//		this.titre = titre;
//	}
//
//	public List<PacksProduit> getPacksProduits() {
//		return this.packsProduits;
//	}
//
//	public void setPacksProduits(List<PacksProduit> packsProduits) {
//		this.packsProduits = packsProduits;
//	}
//
//	public PacksProduit addPacksProduit(PacksProduit packsProduit) {
//		getPacksProduits().add(packsProduit);
//		packsProduit.setPack(this);
//
//		return packsProduit;
//	}
//
//	public PacksProduit removePacksProduit(PacksProduit packsProduit) {
//		getPacksProduits().remove(packsProduit);
//		packsProduit.setPack(null);
//
//		return packsProduit;
//	}
//
//}