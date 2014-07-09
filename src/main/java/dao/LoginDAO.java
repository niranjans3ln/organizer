package dao;

import model.Login;


public interface LoginDAO {

	void persistLogin(Login login);
	Login findLoginById(String id);
	void updateLogin(Login login);
	void deleteLogin(Login login);
	boolean activateUser(Login login);
}
