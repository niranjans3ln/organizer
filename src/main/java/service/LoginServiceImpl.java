package service;

import model.Login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.LoginDAO;

@Service("loginService")
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginDAO loginDAO;
	
	//@Override
	@Transactional
	public void persistLogin(Login login) {
		// TODO Auto-generated method stub
		loginDAO.persistLogin(login);
	}

	//@Override
	@Transactional
	public Login findLoginById(String id) {
		// TODO Auto-generated method stub
		return loginDAO.findLoginById(id);
	}

	//@Override
	@Transactional
	public void updateLogin(Login login) {
		// TODO Auto-generated method stub
		loginDAO.updateLogin(login);
	}

	//@Override
	@Transactional
	public void deleteLogin(Login login) {
		// TODO Auto-generated method stub
		loginDAO.deleteLogin(login);
	}

}
