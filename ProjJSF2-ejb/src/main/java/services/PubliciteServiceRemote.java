package services;

import java.util.List;

import javax.ejb.Remote;

import model.Publicite;


@Remote
public interface PubliciteServiceRemote {
	public void ajouterPublicite(Publicite u);
	public void modifierPublicite(Publicite u,int Id);
	public void supprimerPublicite(int Id);
	public List<Publicite> getPublicite();

}
