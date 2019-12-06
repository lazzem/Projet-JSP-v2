package managedBean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.ejb.ApplicationException;
import javax.ejb.EJB;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import interfaceImp.PubliciteServiceImp;
import model.Produit;
import model.Publicite;



@ManagedBean(name="publiciteBean")
@ApplicationScoped
public class PubliciteBean  implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idPublicite;
	private String description;
	
	private int idProduct;
	private String image;
	private String titre ;
	
	private Produit  produit;
   
	
	@EJB
	PubliciteServiceImp PubliciteService;
	
	public void addpublicite() {
		PubliciteService.ajouterPublicite(new Publicite( idPublicite, description,idProduct, image, "aaaaaa",  produit));
	}

	public PubliciteBean(int idPublicite, String description, int idProduct, String image, String titre,
			Produit produit, PubliciteServiceImp publiciteService) {
		super();
		this.idPublicite = idPublicite;
		this.description = description;
		this.idProduct = idProduct;
		this.image = image;
		this.titre = titre;
		this.produit = produit;
		PubliciteService = publiciteService;
	}

	public PubliciteBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdPublicite() {
		return idPublicite;
	}

	public void setIdPublicite(int idPublicite) {
		this.idPublicite = idPublicite;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public int getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public PubliciteServiceImp getPubliciteService() {
		return PubliciteService;
	}

	public void setPubliciteService(PubliciteServiceImp publiciteService) {
		PubliciteService = publiciteService;
	}





}
