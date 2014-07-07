package org.bs5lnd.webservice.endpoints;

import javax.jws.WebService;

import main.DataManager;

/*@WebService(
        portName = "LoginServicePort",
        serviceName = "LoginService",
        targetNamespace = "http://bs5lnd.org/wsdl")*/
public class LoginServiceEndpoint {
	
	public boolean validateLogin(String userid, String password){
		DataManager handle = new DataManager();
		return handle.validateLogin(userid, password);
	}
}