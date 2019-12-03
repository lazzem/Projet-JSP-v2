package services;

import model.User;

public interface EmployeServiceAuthentificationRemote {
	
	public int ajouterEmployeAuthentification() throws Exception;
	public User getEmployeAuthentificationByEmailAndPassword(String login, String password);
	public void ajouterEmployeAuthentification(User e);

}
