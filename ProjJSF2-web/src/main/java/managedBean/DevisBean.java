package managedBean;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import interfaceImp.CommandeServiceImp;
import interfaceImp.DevisServiceImp;
import interfaceImp.ProduitServiceImp;
import interfaceImp.UserServiceImp;
import model.Commande;
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
	private Produit Produit;
	
	
	private LoginBean userCo;
	@EJB
    private DevisServiceImp service;
	@EJB
    private ProduitServiceImp serviceProd;
	@EJB
	private CommandeServiceImp serviceCommande;
	@EJB
	private UserServiceImp serviceUser;
	
	public List<Devi> getAllDevis() {
		ListDevis = service.getDevis();
		System.out.println(ListDevis.toString());
		return ListDevis;
	}
	
	
	public List<Devi> getDevisUser(int id) {
		ListDevisUser = service.getDevisUser(id);
		return ListDevisUser;
	}
	
	public void traiterBack(Devi d) {
		List<Commande> LsC = serviceCommande.getCommande();
		float AchatTotal=0;
		float Remise=0;
		int DiffDate;
		//Traitement pour date
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		Date dateCourante = new Date();
	    System.out.println(format.format(dateCourante));
	    Date dateInscrit = serviceUser.getUserById(1).getBirthDate();
	    int nbrMoisdateInscrit = dateInscrit.getMonth()+dateInscrit.getYear();
	    int nbrMoisdateCourante = dateCourante.getMonth()+dateCourante.getYear();
	    DiffDate = nbrMoisdateCourante-nbrMoisdateInscrit;
		for (int i=0;i<LsC.size();i++) {
			if(LsC.get(i).getUser().getUserID()==1)
			AchatTotal=AchatTotal+LsC.get(i).getPrixTotal();
		}
		if (AchatTotal==0) {
			service.traiterDevis(new Devi(d.getIdDevis(),"Traiter avec remise pour ancienneté",1,d.getPrixTotal()-DiffDate*10,"Traiter et envoyé",d.getProduit()));
		}
		else
		{
			Remise = AchatTotal/100;
			service.traiterDevis(new Devi(d.getIdDevis(),"Traiter avec remise total",1,d.getPrixTotal()-Remise/100-DiffDate/100,"Traiter",d.getProduit()));
		}
	}
	
	public  void addDevis(Produit Pr) {
		service.ajouterDevis(new Devi("ss",2,Pr.getPrice(),"En attente",Pr));
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

public Produit getProduit() {
	return Produit;
}
public void setProduit(Produit produit) {
	Produit = produit;
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
