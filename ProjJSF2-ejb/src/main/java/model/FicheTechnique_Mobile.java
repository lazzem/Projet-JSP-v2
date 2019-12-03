package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the FicheTechnique_Mobile database table.
 * 
 */
@Entity
@NamedQuery(name="FicheTechnique_Mobile.findAll", query="SELECT f FROM FicheTechnique_Mobile f")
public class FicheTechnique_Mobile implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id_fichemobile")
	private int id_fichemobile;

	@Column(name="Batterie")
	private int batterie;

	@Column(name="Capteur_enpreintes")
	private String capteur_enpreintes;

	@Column(name="Coloris")
	private String coloris;

	@Column(name="Connectivite")
	private String connectivite;

	@Column(name="Definition")
	private String definition;

	@Column(name="Dimensions")
	private String dimensions;

	@Column(name="Ecrant")
	private String ecrant;

	@Column(name="Marque")
	private String marque;

	@Column(name="Memoire_interne")
	private String memoire_interne;

	@Column(name="Micro_sd")
	private String micro_sd;

	@Column(name="Nfc")
	private String nfc;

	@Column(name="Os")
	private String os;

	@Column(name="Photo")
	private String photo;

	@Column(name="Poids")
	private float poids;

	@Column(name="Port_charge")
	private String port_charge;

	@Column(name="Prix")
	private float prix;

	@Column(name="Ram")
	private String ram;

	@Column(name="Recharge_rapide")
	private String recharge_rapide;

	@Column(name="Recharge_sansfil")
	private String recharge_sansfil;

	@Column(name="Resistance_eau")
	private String resistance_eau;

	@Column(name="Soc")
	private String soc;

	public FicheTechnique_Mobile() {
	}

	public int getId_fichemobile() {
		return this.id_fichemobile;
	}

	public void setId_fichemobile(int id_fichemobile) {
		this.id_fichemobile = id_fichemobile;
	}

	public int getBatterie() {
		return this.batterie;
	}

	public void setBatterie(int batterie) {
		this.batterie = batterie;
	}

	public Object getCapteur_enpreintes() {
		return this.capteur_enpreintes;
	}

	public void setCapteur_enpreintes(String capteur_enpreintes) {
		this.capteur_enpreintes = capteur_enpreintes;
	}

	public Object getColoris() {
		return this.coloris;
	}

	public void setColoris(String coloris) {
		this.coloris = coloris;
	}

	public Object getConnectivite() {
		return this.connectivite;
	}

	public void setConnectivite(String connectivite) {
		this.connectivite = connectivite;
	}

	public Object getDefinition() {
		return this.definition;
	}

	public void setDefinition(String definition) {
		this.definition = definition;
	}

	public Object getDimensions() {
		return this.dimensions;
	}

	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;
	}

	public Object getEcrant() {
		return this.ecrant;
	}

	public void setEcrant(String ecrant) {
		this.ecrant = ecrant;
	}

	public Object getMarque() {
		return this.marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public Object getMemoire_interne() {
		return this.memoire_interne;
	}

	public void setMemoire_interne(String memoire_interne) {
		this.memoire_interne = memoire_interne;
	}

	public Object getMicro_sd() {
		return this.micro_sd;
	}

	public void setMicro_sd(String micro_sd) {
		this.micro_sd = micro_sd;
	}

	public Object getNfc() {
		return this.nfc;
	}

	public void setNfc(String nfc) {
		this.nfc = nfc;
	}

	public Object getOs() {
		return this.os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public Object getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public float getPoids() {
		return this.poids;
	}

	public void setPoids(float poids) {
		this.poids = poids;
	}

	public Object getPort_charge() {
		return this.port_charge;
	}

	public void setPort_charge(String port_charge) {
		this.port_charge = port_charge;
	}

	public float getPrix() {
		return this.prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public Object getRam() {
		return this.ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public Object getRecharge_rapide() {
		return this.recharge_rapide;
	}

	public void setRecharge_rapide(String recharge_rapide) {
		this.recharge_rapide = recharge_rapide;
	}

	public Object getRecharge_sansfil() {
		return this.recharge_sansfil;
	}

	public void setRecharge_sansfil(String recharge_sansfil) {
		this.recharge_sansfil = recharge_sansfil;
	}

	public Object getResistance_eau() {
		return this.resistance_eau;
	}

	public void setResistance_eau(String resistance_eau) {
		this.resistance_eau = resistance_eau;
	}

	public Object getSoc() {
		return this.soc;
	}

	public void setSoc(String soc) {
		this.soc = soc;
	}

}