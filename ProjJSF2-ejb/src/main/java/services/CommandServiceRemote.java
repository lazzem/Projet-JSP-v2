package services;

import java.util.List;

import javax.ejb.Remote;

import model.Commande;


@Remote
public interface CommandServiceRemote {
	public List<Commande> getCommande();
}
