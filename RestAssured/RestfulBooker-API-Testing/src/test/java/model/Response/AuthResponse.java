package model.Response;

public class AuthResponse {
	
	private String token;
	
	AuthResponse(String token){
		this.token=token;
	}
	
	AuthResponse(){}
	
	public String getToken() {
		return this.token;
	}
	
}
