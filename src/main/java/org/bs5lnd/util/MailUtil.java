package org.bs5lnd.util;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import main.DataManager;
import model.Login;

public class MailUtil {

	private static MailUtil instance;
	
	private MailUtil(){
		super();
    }

    public static MailUtil getInstance(){
      if (instance == null)
          instance = new MailUtil();
      return instance;
    }
    
    public boolean sendMailSSL(Login login){
    	boolean mailStatus = false;
    	Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");
 
		Session session = Session.getDefaultInstance(props,
			new javax.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication("bs5lnd.corp","Delisha@123");
				}
			});
 
		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("noreply.bs5lnd.corp@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(login.getLogin_email()));
			message.setSubject("Account Activation Code");
			message.setText("Please activate your account via entering the following validation code in the Mobile Application. "
					+ "Code : '" + DataManager.getInstance().getUserInfo(login.getLogin_id()).getLogin_secretcode() + "'");
 
			Transport.send(message);
			System.out.println("Mail Sent Successfully.....");
			
			mailStatus = true;
		} catch (MessagingException e) {
			mailStatus = false;
			throw new RuntimeException(e);
		}
		return mailStatus;
    }
    
	public boolean sendMail(Login login){
		boolean mailStatus = false;
		
		/*
		 * transport.connect("smtp.gmail.com","originalname@gmail.com","password");  
			transport.send(msg);
		 */
		
		// Recipient's email ID needs to be mentioned.
	      String to = login.getLogin_email();

	      // Sender's email ID needs to be mentioned
	      String from = "support_bs5lnd@gmail.com";

	      // Assuming you are sending email from localhost
	      String host = "mail.gmx.com";

	      // Get system properties
	      Properties properties = System.getProperties();
	      properties.setProperty("mail.user", "niranjan-reddy@gmx.com");
	      properties.setProperty("mail.password", "Sarathi@123");

	      // Setup mail server
	      properties.setProperty("mail.smtp.host", host);

	      // Get the default Session object.
	      Session session = Session.getDefaultInstance(properties);

	      try{
	         // Create a default MimeMessage object.
	         MimeMessage message = new MimeMessage(session);

	         // Set From: header field of the header.
	         message.setFrom(new InternetAddress(from));

	         // Set To: header field of the header.
	         message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

	         // Set Subject: header field
	         message.setSubject("This is the Subject Line!");

	         // Now set the actual message
	         message.setText("Please activate your account via entering the following validation code in the Mobile Application. Code : '" + DataManager.getInstance().getUserInfo(login.getLogin_id()).getLogin_secretcode() + "'");

	         // Send message
	         Transport.send(message);
	         System.out.println("Sent message successfully....");
	      }catch (MessagingException mex) {
	         mex.printStackTrace();
	      }
		
		
		
		return mailStatus;
	}
	public static void main(String [] args)
	   {    
	      // Recipient's email ID needs to be mentioned.
	      String to = "abcd@gmail.com";

	      // Sender's email ID needs to be mentioned
	      String from = "web@gmail.com";

	      // Assuming you are sending email from localhost
	      String host = "localhost";

	      // Get system properties
	      Properties properties = System.getProperties();

	      // Setup mail server
	      properties.setProperty("mail.smtp.host", host);

	      // Get the default Session object.
	      Session session = Session.getDefaultInstance(properties);

	      try{
	         // Create a default MimeMessage object.
	         MimeMessage message = new MimeMessage(session);

	         // Set From: header field of the header.
	         message.setFrom(new InternetAddress(from));

	         // Set To: header field of the header.
	         message.addRecipient(Message.RecipientType.TO,
	                                  new InternetAddress(to));

	         // Set Subject: header field
	         message.setSubject("This is the Subject Line!");

	         // Now set the actual message
	         message.setText("This is actual message");

	         // Send message
	         Transport.send(message);
	         System.out.println("Sent message successfully....");
	      }catch (MessagingException mex) {
	         mex.printStackTrace();
	      }
	   }
}
