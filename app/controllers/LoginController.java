package controllers;

import play.mvc.*;

import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import models.users.*;

import views.html.*;

public class LoginController extends Controller {
    private FormFactory formFactory;

    @Inject
    public LoginController(FormFactory f) {
        this.formFactory = f;
    }

    public Result login() {
        Form<Login> loginForm = formFactory.form(Login.class);
        return ok(login.render(loginForm, User.getUserById(session().get("email"))));
    }

    public Result loginSubmit() {
        Form<Login> loginForm = formFactory.form(Login.class).bindFromRequest();

        if (loginForm.hasErrors()) {
            return badRequest(login.render(loginForm, User.getUserById(session().get("email"))));
        } else {
            //Clear sessions
            session().clear();

            //Store email in cookie
            session("email", loginForm.get().getEmail());

            return redirect(controllers.routes.HomeController.index());
        }
    }

    public Result logout() {
        //Clears the login session
        session().clear();
        flash("success", "You have been logged out");

        return redirect(routes.LoginController.login());
    }

    

}