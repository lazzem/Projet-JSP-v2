package model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;



/**
 * The persistent class for the Avis database table.
 * 
 */
@Entity
@Table(name="Avis")
@NamedQuery(name="Avi.findAll", query="SELECT a FROM Avi a")
public class Avi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="IdView")
	private int idView;

	@Column(name="Date")
	private Date date;

	@Column(name="Description")
	private String description;

	public Avi() {
	}

	public int getIdView() {
		return this.idView;
	}

	public void setIdView(int idView) {
		this.idView = idView;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}