package models;

import java.util.HashMap;
import java.util.Map;

public class UserInfoDB {
	
	private Map<String, UserInfo> userinfos = new HashMap<String, UserInfo>();
	
	public void addUserInfo(String username, String password){
		userinfos.put(username, new UserInfo(username, password));
	}
	public boolean isUser(String username){
		return userinfos.containsKey(username);
	}
	public UserInfo getUser(String username) {
		return userinfos.get((username == null) ? "" :  username);
	}
	public boolean isValid(String username, String password){
		return ((username != null) && (password != null) && getUser(username).getPassword().equals(password));
	}
}
