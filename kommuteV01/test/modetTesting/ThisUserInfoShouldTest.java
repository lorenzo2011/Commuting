package modetTesting;

import org.junit.Before;
import org.junit.Test;
import models.UserInfoDB;
import models.UserInfo;

public class ThisUserInfoShouldTest {

	private UserInfoDB userInfoDb;
	private UserInfo userInfo;
	
	@Before
	public void init(){
		userInfoDb = new UserInfoDB();
		userInfo = new UserInfo("Laurence","mypassword");
	}
	@Test
	public void ThatAUserCredentialsCanBeAddedIntoTheMockDatabase(){
		userInfoDb.addUserInfo("Laurence", "mypassword");
	}
	@Test
	public void ThatThereAreValuesInTheMockDatabase(){}
	@Test
	public void ThatTheUserCredentialsAreTheSameAsExpected(){}

}
