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
	public boolean activateUser(Login login){
		String activationCode = login.getLogin_secretcode();
		login = findLoginById(login.getLogin_id());
		if(activationCode.equals(login.getLogin_secretcode())){
			login.setLogin_isactive("Y");
			sessionFactory.getCurrentSession().update(login);
			return true;
		}else
			return false;
	}
	
	//@Override
	public void deleteLogin(Login login){
		sessionFactory.getCurrentSession().delete(login);
	}
}
