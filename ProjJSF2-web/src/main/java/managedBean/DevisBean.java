package managedBean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import interfaceImp.DevisServiceImp;
import interfaceImp.ProduitServiceImp;
import model.Devi;
import model.Produit;
import model.User;

@ManagedBean(name="devisBean")
@ApplicationScoped
public class DevisBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idDevis;
	private Date dateCommande;
	private String description;
	private int idUser;
	private float prixTotal;
	private String status;
	private int idProduit;
	private List<Devi> ListDevis;
	private List<Devi> ListDevisUser;
	private Produit p;
	
	@EJB
    private DevisServiceImp service;
	@EJB
    private ProduitServiceImp serviceProd;
	
	public List<Devi> getAllDevis() {
		ListDevis = service.getDevis();
		return ListDevis;
	}
	
	public Produit getProdId(int id) {	
		p=serviceProd.getProdId(id);
		return p;
	}
	
	public List<Devi> getDevisUser(int id) {
		ListDevisUser = service.getDevisUser(id);
		return ListDevisUser;
	}
	
	public  void addDevis(Produit Pr) {
		//service.ajouterDevis(new Devi("ss",2,0,"En attente",Pr));
	}
	
	public void deleteDevis(int id) {
		service.supprimerDevis(id);
	}
	
	public DevisBean() {
		super();
	}

	public int getIdDevis() {
		return idDevis;
	}

	public Produit getP() {
		return p;
	}
	
	public void setP(Produit p) {
		this.p = p;
	}
	
	public void setIdDevis(int idDevis) {
		this.idDevis = idDevis;
	}

	public Date getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public float getPrixTotal() {
		return prixTotal;
	}

	public void setPrixTotal(float prixTotal) {
		this.prixTotal = prixTotal;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public DevisServiceImp getService() {
		return service;
	}

	public void setService(DevisServiceImp service) {
		this.service = service;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public List<Devi> getListDevis() {
		return ListDevis;
	}
	
	public void setListDevis(List<Devi> listDevis) {
		ListDevis = listDevis;
	}
	
	public List<Devi> getListDevisUser() {
		return ListDevisUser;
	}
	
	public void setListDevisUser(List<Devi> listDevisUser) {
		ListDevisUser = listDevisUser;
	}
	 
	public int getIdProduit() {
		return idProduit;
	}
	
	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}
	
	public ProduitServiceImp getServiceProd() {
		return serviceProd;
	}
	
	public void setServiceProd(ProduitServiceImp serviceProd) {
		this.serviceProd = serviceProd;
	}
}
