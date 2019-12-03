package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;


/**
 * The persistent class for the Complaints database table.
 * 
 */
@Entity
@Table(name="Complaints")
@NamedQuery(name="Complaint.findAll", query="SELECT c FROM Complaint c")
public class Complaint implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ComplaintID")
	private int complaintID;

	@Column(name="Clossing_date")
	private String clossing_date;

	@Column(name="Creation_date")
	private Date creation_date;

	@Column(name="Description")
	private String description;

	@Column(name="Etat")
	private boolean etat;

	@Column(name="Image")
	private String image;

	@Column(name="Objet")
	private String objet;

	@Column(name="Processing_date")
	private String processing_date;

	@Column(name="Responsable")
	private String responsable;

	//bi-directional many-to-one association to TypeRec
	@ManyToOne
	@JoinColumn(name="Id_type")
	private TypeRec typeRec;

	public Complaint() {
	}

	public int getComplaintID() {
		return this.complaintID;
	}

	public void setComplaintID(int complaintID) {
		this.complaintID = complaintID;
	}

	public String getClossing_date() {
		return this.clossing_date;
	}

	public void setClossing_date(String clossing_date) {
		this.clossing_date = clossing_date;
	}

	public Date getCreation_date() {
		return this.creation_date;
	}

	public void setCreation_date(Date creation_date) {
		this.creation_date = creation_date;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean getEtat() {
		return this.etat;
	}

	public void setEtat(boolean etat) {
		this.etat = etat;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getObjet() {
		return this.objet;
	}

	public void setObjet(String objet) {
		this.objet = objet;
	}

	public String getProcessing_date() {
		return this.processing_date;
	}

	public void setProcessing_date(String processing_date) {
		this.processing_date = processing_date;
	}

	public String getResponsable() {
		return this.responsable;
	}

	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}

	public TypeRec getTypeRec() {
		return this.typeRec;
	}

	public void setTypeRec(TypeRec typeRec) {
		this.typeRec = typeRec;
	}

}