package interfaceImp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;


import model.User;
import services.EmployeServiceAuthentificationRemote;



@Stateless
@LocalBean
	public class EmployeServiceAuthentification implements EmployeServiceAuthentificationRemote {

	@PersistenceContext(unitName = "ProjJSF2-ejb")
	EntityManager em;

	@Override
	public int ajouterEmployeAuthentification() throws Exception {
		User e=new User();
		//"Username","LastName","Name",88888888,88888888, 2017-08-19 12:17:55, "photo.pnj","Password","ConfirmPassword","Email","Gender",1,"ADMINISTRATEUR");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

		String dateString = format.format( new Date()   );
		Date   date       = format.parse ( "2009-12-31" ); 
		Date   date1       = format.parse ( "2009-12-31" ); 
		e.setBirthDate(date);
		e.setSignUpDate(date1);
		e.setCin(88888888);
		e.setConfirmPassword("lazlazlaz");
		e.setEmail("laz@laz.laz");
		e.setGender(0);
		e.setLastName("Lazzem");
		e.setName("Lazzem");
		e.setPassword("Lazzem");
		e.setPhone(88888888);
		e.setPicture("laz.laz");
		e.setRole("ADMINISTRATEUR");
		e.setUserName("Lazzem");
		e.setIsActive(true);
		
		em.persist(e);
		return 1;
	}

	@Override
	public User getEmployeAuthentificationByEmailAndPassword(String login, String password) {
		TypedQuery<User> query = 
				em.createQuery("select e from User e where e.UserName=:login AND e.Password=:password", User.class);
		query.setParameter("login", login);
		query.setParameter("password", password);
		User employe = null;
		try { employe = query.getSingleResult(); }
		catch (Exception e) { System.out.println("Erreur : " + e); }
		return employe;
	}

	@Override
	public void ajouterEmployeAuthentification(User e) {
		em.persist(e); 
		
	}
	
	
	
	}
	

