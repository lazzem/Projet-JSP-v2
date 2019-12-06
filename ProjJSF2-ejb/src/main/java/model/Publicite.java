package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Publicites database table.
 * 
 */
@Entity
@Table(name="Publicites")
@NamedQuery(name="Publicite.findAll", query="SELECT p FROM Publicite p")
public class Publicite implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="IdPublicite")
	private int idPublicite;

	@Column(name="Description")
	private String description;

	@Column(name="IdProduct")
	private int idProduct;

	@Column(name="Image")
	private String image;

	@Column(name="Titre")
	private String titre;

	//bi-directional many-to-one association to Produit
	@ManyToOne
	@JoinColumn(name="Produits_Id_produit")
	private Produit produit;

	public Publicite() {
	}

	public int getIdPublicite() {
		return this.idPublicite;
	}

	public void setIdPublicite(int idPublicite) {
		this.idPublicite = idPublicite;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getIdProduct() {
		return this.idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getTitre() {
		return this.titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public Produit getProduit() {
		return this.produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public Publicite(int idPublicite, String description, int idProduct, String image, String titre, Produit produit) {
		super();
		this.idPublicite = idPublicite;
		this.description = description;
		this.idProduct = idProduct;
		this.image = image;
		this.titre = titre;
		this.produit = produit;
	}
	

}