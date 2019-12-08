package services;

import java.util.List;

import javax.ejb.Remote;

import model.User;

@Remote
public interface UserServiceRemote {
	public void ajouterUser(User u);
	public void modifierUser(User u);
	public void supprimerUser(int Id);
	public List<User> getUsers();

}
