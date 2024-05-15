package web.service;

/**
 * Business logic to handle login functions.
 * 
 * @author Ahsan.
 */
public class LoginService {

	/**
	 * Static method returns true for successful login, false otherwise.
	 * @param username
	 * @param password
	 * @return
	 */
	public static boolean login(String username, String password, String dob) {
		
		if (username != null && !username.isEmpty() &&
	            password != null && !password.isEmpty() &&
	            dob != null && !dob.isEmpty() && dob.matches("\\d{4}-\\d{2}-\\d{2}")) {
		// Match a fixed user name and password.
		//
		if ("ahsan".equals(username) && "ahsan_pass".equals(password)&& "1997-12-10".equals(dob)) {
			return true;
		}
		}
		return false;
	}
	
	
}
