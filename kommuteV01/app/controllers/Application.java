package controllers;

import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.formdata.LoginFormData;
import views.html.index;
import views.html.test;

public class Application extends Controller {

    public static Result index(){
    	Form<LoginFormData> loginFormData = Form.form(LoginFormData.class);
        return ok(index.render(loginFormData));
    }
    public static Result postLogin(){
    	Form<LoginFormData> loginFormData = Form.form(LoginFormData.class).bindFromRequest();
    	LoginFormData loginData = loginFormData.get();
    	
    	return ok(test.render(loginData.username, loginData.password));
    }

}
