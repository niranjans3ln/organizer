package service;

import model.Login;


public interface LoginService {

	void persistLogin(Login login);
	Login findLoginById(String id);
	void updateLogin(Login login);
	void deleteLogin(Login login);
}
