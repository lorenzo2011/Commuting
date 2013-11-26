import models.UserInfoDB;
import play.Application;
import play.GlobalSettings;
import play.Logger;

public class Global extends GlobalSettings {
	
	private UserInfoDB userInfoDb = new UserInfoDB();
	
	@Override
	public void onStart(Application app){
		userInfoDb.addUserInfo("Laurence", "mypassword");
	}
	@Override
	public void onStop(Application app){
		Logger.info("Application is shutting down blud");
	}
}
