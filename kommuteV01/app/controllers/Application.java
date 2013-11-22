package controllers;

import play.mvc.Controller;
import play.mvc.Result;

import views.html.*;

public class Application extends Controller {

    public static Result index(){
        return ok(index.render("This is a template."));
    }
    public static Result testing(){
    	return ok("This is a test");
    }
    public static Result testing2(){
    	return ok("This is testing no2");
    }

}
