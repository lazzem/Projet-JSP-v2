package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;


/**
 * The persistent class for the Commandes database table.
 * 
 */
@Entity
@Table(name="Commandes")
@NamedQuery(name="Commande.findAll", query="SELECT c FROM Commande c")
public class Commande implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="IdCommande")
	private int idCommande;

	@Column(name="DateCommand")
	private Date dateCommand;

	@Column(name="PrixTotal")
	private float prixTotal;

	//bi-directional many-to-one association to Panier
	@ManyToOne
	@JoinColumn(name="IdPanier")
	private Panier panier;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="IdUser")
	private User user;

	public Commande() {
	}

	public int getIdCommande() {
		return this.idCommande;
	}

	public void setIdCommande(int idCommande) {
		this.idCommande = idCommande;
	}

	public Date getDateCommand() {
		return this.dateCommand;
	}

	public void setDateCommand(Date dateCommand) {
		this.dateCommand = dateCommand;
	}

	public float getPrixTotal() {
		return this.prixTotal;
	}

	public void setPrixTotal(float prixTotal) {
		this.prixTotal = prixTotal;
	}

	public Panier getPanier() {
		return this.panier;
	}

	public void setPanier(Panier panier) {
		this.panier = panier;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}