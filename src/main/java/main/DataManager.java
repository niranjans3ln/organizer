package main;

import model.Login;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.LoginService;

public class DataManager {

	public Login getUserInfo(String id){
		System.out.println("Load Context...");
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Login login = new Login();
		LoginService service = (LoginService) context.getBean("loginService");
		login = service.findLoginById(id);
		context.close();
		return login;
	}
	
	public boolean validateLogin(String id, String password){
		boolean status = false;
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Login login = new Login();
		LoginService service = (LoginService) context.getBean("loginService");
		login = service.findLoginById(id);
		context.close();
		System.out.println("Record fetched is for: " + login.getLogin_id() + "/" + login.getLogin_password());
		if(login.getLogin_password().equals(password))
			status = true;
		return status;
	}
	
	public void createUser(Login login){
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//Login login = new Login();
		LoginService service = (LoginService) context.getBean("loginService");
		
		/*login.setLogin_slno(3);
		login.setLogin_id("user001");
		login.setLogin_password("user001");
		login.setLogin_name("Test User 001");
		login.setLogin_secretquestion("Random Question?");
		login.setLogin_secretanswer("Random Answer.");
		login.setLogin_registerdate(new Date(20140520));*/
		service.persistLogin(login);
		context.close();
	}
	
	public void updateUserInfo(Login login){
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//Login login = new Login();
		LoginService service = (LoginService) context.getBean("loginService");
		/*login = service.findLoginById("user001");
		login.setLogin_secretanswer("login_secretanswer");
		login.setLogin_registerdate(new Date(20052014));*/
		service.updateLogin(login);
		context.close();
	}
	
	public void deleteUser(String id){
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Login login = new Login();
		LoginService service = (LoginService) context.getBean("loginService");
		login = service.findLoginById(id);
		service.deleteLogin(login);
		context.close();
	}
}
