package dao;

import model.Login;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("loginDAO")
public class LoginDAOImpl  implements LoginDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	//@Override
	public void persistLogin(Login login){
		sessionFactory.getCurrentSession().persist(login);
	}
	
	//@Override
	public Login findLoginById(String id){
		return (Login) sessionFactory.getCurrentSession().get(Login.class, id);
	}
	
	//@Override
	public void updateLogin(Login login){
		sessionFactory.getCurrentSession().update(login);
	}
	
	//@Override
	public void deleteLogin(Login login){
		sessionFactory.getCurrentSession().delete(login);
	}
}
