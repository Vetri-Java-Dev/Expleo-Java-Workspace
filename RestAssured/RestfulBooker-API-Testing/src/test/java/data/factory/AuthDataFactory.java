package data.factory;

import model.Request.AuthRequest;

public class AuthDataFactory {
	
	public static AuthRequest getValidData() {
		String username="admin";
		String password="password123";
		
		return new AuthRequest(username,password);
	}
}
