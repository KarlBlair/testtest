package controllers;

import play.mvc.*;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.CompletableFuture;

import models.users.*;

public class AuthLandlord extends Action.Simple {
    public CompletionStage<Result> call(Http.Context ctx) {

        String id = ctx.session().get("email");
        //If the user is logged in check if it is an admin
        if (id != null) {
            User u = User.getUserById(id);
            if ("landlord".equals(u.getRole())) {
                // Call this method to intercept the action
                return delegate.call(ctx);
            }
        }
        //Message that explains to the user why it didn't work
        ctx.flash().put("error", "Landlord login required");
        //Redirect to login page
        return CompletableFuture.completedFuture(redirect(routes.LoginController.login())); 

    }
}