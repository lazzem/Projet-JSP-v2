package managedBean;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;


import interfaceImp.ProduitServiceImp;
import model.Produit;

@ManagedBean(name="produitBean")
@ApplicationScoped
public class ProduitBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private List<Produit> ListProduits;
    private Produit selectedProduit;
	private int id_produit;
	private String description;
	private int idPack;
	private String image;
	private String libelle;
	private String nom;
	private float price;
	private int quantitee;
	private Produit p;
	


     
	@EJB
    private ProduitServiceImp service;
    
	public List<Produit> getAllProds() {
		return service.getProduits();
	}
 
	public List<Produit> getListProduits() {
		return ListProduits;
	}
	
	public void getProdId(int id) {	
		p=service.getProdId(id);
		//return p;
	}
 
    public void setService(ProduitServiceImp service) {
        this.service = service;
    }
 
    public Produit getselectedProduit() {
        return selectedProduit;
    }
 
    public void setselectedProduit(Produit selectedProduit) {
        this.selectedProduit = selectedProduit;
    }
    
    public ProduitBean() {
    	super();
    }

	public Produit getSelectedProduit() {
		return selectedProduit;
	}
	
	public Produit getP() {
		return p;
	}
	public void setP(Produit p) {
		this.p = p;
	}

	public void setSelectedProduit(Produit selectedProduit) {
		this.selectedProduit = selectedProduit;
	}

	public int getId_produit() {
		return id_produit;
	}

	public void setId_produit(int id_produit) {
		this.id_produit = id_produit;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getIdPack() {
		return idPack;
	}

	public void setIdPack(int idPack) {
		this.idPack = idPack;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getQuantitee() {
		return quantitee;
	}

	public void setQuantitee(int quantitee) {
		this.quantitee = quantitee;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public ProduitServiceImp getService() {
		return service;
	}

	public void setListProduits(List<Produit> listProduits) {
		ListProduits = listProduits;
	}
    
    
}
