package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


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
	private Timestamp dateCommand;

	@Column(name="Description")
	private String description;

	@Column(name="PrixTotal")
	private double prixTotal;

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

	public Timestamp getDateCommand() {
		return this.dateCommand;
	}

	public void setDateCommand(Timestamp dateCommand) {
		this.dateCommand = dateCommand;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrixTotal() {
		return this.prixTotal;
	}

	public void setPrixTotal(double prixTotal) {
		this.prixTotal = prixTotal;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}