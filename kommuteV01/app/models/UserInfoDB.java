package models;

import java.util.HashMap;
import java.util.Map;

public class UserInfoDB {
	
	private static Map<String, UserInfo> userinfos = new HashMap<String, UserInfo>();
	
	public static void addUserInfo(String username, String password){
		userinfos.put(username, new UserInfo(username, password));
	}
	public static boolean isUser(String username){
		return userinfos.containsKey(username);
	}
	public static UserInfo getUser(String username) {
		return userinfos.get((username == null) ? "" :  username);
	}
	public static boolean isValid(String username, String password){
		return ((username != null) && (password != null) && getUser(username).getPassword().equals(password));
	}
}
