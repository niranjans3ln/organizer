package org.bs5lnd.servlets;

import hirondelle.date4j.DateTime;

import java.io.IOException;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.bs5lnd.util.CommonUtil;
import org.bs5lnd.util.MailUtil;

import nl.captcha.Captcha;

//import com.octo.captcha.module.servlet.image.SimpleImageCaptchaServlet;

import main.DataManager;
import model.Login;

/**
 * Servlet implementation class UserRegistrationServlet
 */
//@WebServlet(description = "Web Module for new user registration. User Registration is restricted to web registration only. Rest all could be done using the mobile app. This web app will be invoked from within the mobile app.", urlPatterns = { "/UserRegistrationServlet" })
public class UserRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserRegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boolean status = true;
		// TODO Auto-generated method stub
		
		System.out.println("UserRegistrationServlet is called from form action event.....");
		Login login = new Login();
		login = this.populateForm(request, login, status);
		boolean captchaStatus = false;
		String nextJSP = "";
		RequestDispatcher dispatcher;
		
		
		//String jcaptcha = request.getParameter("jcaptcha");
		
		//boolean captchaPassed = SimpleImageCaptchaServlet.validateResponse(request, jcaptcha);
		
		// We're doing this in a JSP here, but in your own app you'll want to put
	    // this logic in your MVC framework of choice.
		//HttpSession session = request.getSession(true);
	    //Captcha captcha = (Captcha) session.getAttribute(Captcha.NAME);
	    // Or, for an AudioCaptcha:
	    // AudioCaptcha captcha = (AudioCaptcha) session.getAttribute(Captcha.NAME);
	    /*request.setCharacterEncoding("UTF-8"); // Do this so we can capture non-Latin chars
	    String answer = request.getParameter("jcaptcha");
	    System.out.println("Captcha Input from Form: " + answer);
	    if (captcha.isCorrect(answer)) {
	    	System.out.println("Captcha Validation is Successful.....");
	    	captchaStatus = true;
	    }
		
		if(captchaStatus){*/
			System.out.println("Captcha bypassed. Now persisting New User.....");
			// proceed to submit action
			try{
				boolean dbStatus = DataManager.getInstance().createUser(login);
				boolean mailStatus = MailUtil.getInstance().sendMailSSL(login);
				if(dbStatus && mailStatus){
					nextJSP = "/loginSuccess.jsp";
					dispatcher = getServletContext().getRequestDispatcher(nextJSP);
					dispatcher.forward(request,response);
				}else{
					nextJSP = "/loginFailure.jsp";
					dispatcher = getServletContext().getRequestDispatcher(nextJSP);
					dispatcher.forward(request,response);
				}
			}catch(Exception e){
				System.out.println("Exception Occured in UserRegistrationServlet....." + e.getMessage().toString());
				e.getStackTrace();
				nextJSP = "/errorPage.jsp";
				dispatcher = getServletContext().getRequestDispatcher(nextJSP);
				dispatcher.forward(request,response);
			}
		/*}else{
		// return error to user
			System.out.println("Captcha Failed. Aborting operation.....");
		}*/
	}
	
	private Login populateForm(HttpServletRequest request, Login login, boolean status){
		
		/*Date date = new Date();
		String currentDate = Integer.toString(date.getYear()) + "-" + Integer.toString(date.getMonth()) + "-" + Integer.toString(date.getDate());*/
		//String date = DateTime.now(new GregorianCalendar().getTimeZone()).toString().substring(0, 10);
		
		if(request.getParameter("password").equals(request.getParameter("confirmPassword")))
			login.setLogin_password(request.getParameter("password"));
		else
			status = false;

		login.setLogin_id(request.getParameter("userid"));
		login.setLogin_aliasname(request.getParameter("alias"));
		login.setLogin_name(request.getParameter("name"));
		login.setLogin_secretquestion(request.getParameter("secretquestion"));
		login.setLogin_secretanswer(request.getParameter("secretanswer"));
		login.setLogin_dob(request.getParameter("dob"));
		login.setLogin_phone_no(request.getParameter("phone"));
		login.setLogin_doj(DateTime.now(new GregorianCalendar().getTimeZone()).toString().substring(0, 10));
		login.setLogin_address(request.getParameter("address"));
		login.setLogin_city(request.getParameter("city"));
		login.setLogin_province(request.getParameter("province"));
		login.setLogin_zip(request.getParameter("zip"));
		login.setLogin_country_code(request.getParameter("country_code"));
		login.setLogin_email(request.getParameter("email"));
		login.setLogin_date_format(request.getParameter("date_format"));
		login.setLogin_currency_code(request.getParameter("currency"));
		login.setLogin_language(request.getParameter("language"));
		login.setLogin_highest_education(request.getParameter("education"));
		login.setLogin_industry(request.getParameter("industry"));
		login.setLogin_job_role(request.getParameter("job_role"));
		login.setLogin_company_name(request.getParameter("company"));
		login.setLogin_enable_mail_communication(request.getParameter("mail_communication"));
		login.setLogin_horoscope_sign(request.getParameter("horoscope"));
		login.setLogin_secretcode(CommonUtil.getInstance().randomNo());
		login.setLogin_isactive("N");
		
		return login;
	}

}
