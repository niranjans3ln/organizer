package main;

import java.sql.Date;

import model.Login;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.LoginService;

public class Launcher {

	public static void main(String []args){
		System.out.println("Load Context...");
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Login login = new Login();
		LoginService service = (LoginService) context.getBean("loginService");
		
		// SETUP DATA FOR INSERTION
		//login.setLogin_slno(4);
		login.setLogin_id("niranjan");
		login.setLogin_password("niranjan");
		login.setLogin_name("Kaya Niranjan Kumar Reddy");
		login.setLogin_secretquestion("Random Question?");
		login.setLogin_secretanswer("Random Answer.");
		login.setLogin_doj("20140704");
		login.setLogin_address("Hong Kong");
		login.setLogin_aliasname("niranjans3ln");
		login.setLogin_dob("19800915");
		login.setLogin_email("something@domain.com");
		login.setLogin_isactive("Y");
		login.setLogin_secretcode("ABCD1234E5");
		service.persistLogin(login);
		
		//SETUP DATA FOR QUERY
		/*login = service.findLoginById("niranjan");
		System.out.println("DETAILS: " + login.getLogin_id() + " / " + login.getLogin_password());*/
		
		//SETUP DATA FOR UPDATE
		/*login = service.findLoginById("user001");
		login.setLogin_secretanswer("login_secretanswer");
		login.setLogin_registerdate(new Date(20052014));
		service.updateLogin(login);*/
		
		//SETUP DATA FOR DELETE
		/*login = service.findLoginById("user001");
		service.deleteLogin(login);*/
		
		
		context.close();
	}
}
