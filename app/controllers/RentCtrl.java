package controllers;

import play.mvc.*;

import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import models.*;
import models.users.*;
import models.rent.*;

import views.html.*;

@Security.Authenticated(Secured.class)
@With(CheckIfMember.class)
public class RentCtrl extends Controller {
    private FormFactory formFactory;
    private Environment env;

    @Inject
    public RentCtrl(Environment e, FormFactory f) {
        this.env = e;
        this.formFactory = f;
    }

    @Transactional
    public Result viewRent() {
        List<RentDue> rentList = RentDue.findAll();
        return ok(viewRent.render(rentList, (Member)User.getUserById(session().get("email"))));
    }

    @Transactional
    public Result setupRent(String email) {
        Form<Member> memberForm;
        Form<RentDue> rentForm = formFactory.form(RentDue.class);
        Form<Property> propertyForm = formFactory.form(Property.class);

        Form<Houses> houseForm;

        try{
            //Find by id
            Member m = (Member) User.getUserById(email);
            m.update();

            memberForm = formFactory.form(Member.class).fill(m);
        } catch (Exception e) {
            return badRequest("error");
        }

        return ok(setupRent.render(memberForm, rentForm, propertyForm, User.getUserById(session().get("email"))));

    }
}