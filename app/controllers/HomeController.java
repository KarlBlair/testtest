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

import views.html.*;

import play.mvc.Http.*;
import play.mvc.Http.MultipartFormData.FilePart;
import java.io.File;

import java.io.IOException;
import java.awt.image.*;
import javax.imageio.*;
import org.imgscalr.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    //Allows the user to make a class off a form
    public FormFactory formFactory;

    private Environment e;

    @Inject
    public HomeController(FormFactory f, Environment env) {
        this.formFactory = f;
        this.e = env;
    }
    
    public Result index() {
        return ok(index.render(User.getUserById(session().get("email"))));
    }

    public Result payment() {
        return ok(payment.render(User.getUserById(session().get("email"))));
    }

    public Result database() {
        List<Houses> houseList = Houses.findAll();
        List<Apartment> aList = Apartment.findAll();
        return ok(database.render(houseList, aList, User.getUserById(session().get("email")), e));
    }

    //Adds security so user must be logged in
    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    public Result addHouse() {
        Form<Houses> houseForm = formFactory.form(Houses.class);
        return ok(addHouse.render(houseForm, User.getUserById(session().get("email")), e));
    }

    //Interacts directly with the database so the @Transactional is added
    @Security.Authenticated(Secured.class)
    @Transactional
    public Result addHouseSubmit() {
        Form<Houses> newHouseForm = formFactory.form(Houses.class).bindFromRequest();

        //Error handling
        if (newHouseForm.hasErrors()) {
            //Finds the error and gives the user a new form to fill out
            return badRequest(addHouse.render(newHouseForm, User.getUserById(session().get("email")), e));
        } else {
            //Puts the form into the houses constructor
            Houses newHouse = newHouseForm.get();
            
            if(newHouse.getId() == null){
                //Saves to the database
                newHouse.save();
            } else {
                newHouse.update();
            }

            MultipartFormData<File> data = request().body().asMultipartFormData();

            FilePart<File> image = data.getFile("upload");

            String saveImageMessage = saveFile(newHouse.getId(), image);

            flash("success", "House " + newHouse.getId() + " was added/updated" + saveImageMessage);

            //Brings them back to the initial page and shows the update
            return redirect(controllers.routes.HomeController.database());
        }

    }

    @Security.Authenticated(Secured.class)
    @Transactional
    @With(AuthAdmin.class)
    public Result deleteHouse(Long id) {
        Houses.find.ref(id).delete();

        //Flash message showing result
        flash("success", "House has been deleted.");
        return redirect(controllers.routes.HomeController.database());
    }

    @Security.Authenticated(Secured.class)
    @Transactional
    @With(AuthAdmin.class)
    public Result updateHouse(Long id) {
        Houses i;
        Form<Houses> houseForm;

        try{
            //Find by id
            i = Houses.find.byId(id);

            //Show the form so they can update it
            houseForm = formFactory.form(Houses.class).fill(i);
        } catch (Exception ex) {
            return badRequest("error");
        }

        return ok(addHouse.render(houseForm, User.getUserById(session().get("email")), e));
    }

    public Result landlord() {
        List<Landlord> userList = null;

        userList = Landlord.findAll();

        return ok(landlord.render(userList,User.getUserById(session().get("email")), e));
    }

    public Result addLandlord() {
        Form<Landlord> lForm = formFactory.form(Landlord.class);
        return ok(addLandlord.render(lForm, User.getUserById(session().get("email")), e));
    }

    public Result addLandlordSubmit() {
        Form<Landlord> newLandlordForm = formFactory.form(Landlord.class).bindFromRequest();

        //Error handling
        if (newLandlordForm.hasErrors()) {
            //Finds the error and gives the user a new form to fill out
            return badRequest(addLandlord.render(newLandlordForm, User.getUserById(session().get("email")), e));
        } else {
            //Puts the form into the houses constructor
            Landlord newLandlord = newLandlordForm.get();
            
            if(newLandlord.getUserById(newLandlord.getEmail()) == null){
                //Saves to the database
                newLandlord.save();
            } else {
                newLandlord.update();
            }

            flash("success", "Landlord " + newLandlord.getFname() + " was added/updated.");

            //Brings them back to the initial page and shows the update
            return redirect(controllers.routes.HomeController.landlord());
        }
    }

    public Result updateLandlord(String email) {
        Landlord l;
        Form<Landlord> lForm;
    
        try {
            // Find the item by id
            l = (Landlord)User.getUserById(email);
    
            // Populate the form object with data from the item found in the database
            lForm = formFactory.form(Landlord.class).fill(l);
        } catch (Exception ex) {
            return badRequest("error");
        }
    
        // Display the "add item" page, to allow the user to update the item
        return ok(addLandlord.render(lForm,User.getUserById(session().get("email")), e));
        

    }

    public Result deleteLandlord(String email) {
        Landlord l = (Landlord) User.getUserById(email);
        l.delete();

        flash("success", "Landlord has been updated");
        return redirect(controllers.routes.HomeController.landlord());
        
    }

    public Result createAccount() {
        Form<Member> mForm = formFactory.form(Member.class);
        return ok(createAccount.render(mForm, User.getUserById(session().get("email"))));
    }

    public Result addMember() {
        Form<Member> mForm = formFactory.form(Member.class);
        return ok(createAccount.render(mForm, User.getUserById(session().get("email"))));
    }

    public Result addMemberSubmit() {
        Form<Member> newMemberForm = formFactory.form(Member.class).bindFromRequest();

        //Error handling
        if (newMemberForm.hasErrors()) {
            //Finds the error and gives the user a new form to fill out
            return badRequest(createAccount.render(newMemberForm, User.getUserById(session().get("email"))));
        } else {
            //Puts the form into the houses constructor
            Member newMember = newMemberForm.get();
            
            if(newMember.getUserById(newMember.getEmail()) == null){
                //Saves to the database
                newMember.save();
            } else {
                newMember.update();
            }

            flash("success", "Member " + newMember.getFname() + " was added/updated.");

            //Brings them back to the initial page and shows the update
            return redirect(controllers.routes.LoginController.login());
        }
    }

    public Result updateMember(String email) {
        Member m;
        Form<Member> mForm;
    
        try {
            // Find the item by id
            m = (Member)User.getUserById(email);
    
            // Populate the form object with data from the item found in the database
            mForm = formFactory.form(Member.class).fill(m);
        } catch (Exception ex) {
            return badRequest("error");
        }
    
        // Display the "add item" page, to allow the user to update the item
        return ok(createAccount.render(mForm,User.getUserById(session().get("email"))));
        

    }

    public Result deleteMember(String email) {
        Member m = (Member) User.getUserById(email);
        m.delete();

        flash("success", "Member has been deleted");
        return redirect(controllers.routes.LoginController.login());
        
    }

    public Result searchDB(int min, int max) {
        // perhaps checks vals are not zero

        List<Houses> searchList = Houses.findRange(min, max);
        return ok(searchQuery.render(searchList, User.getUserById(session().get("email")), e));
    }

    public String saveFile(Long id, FilePart < File > uploaded) {
        if (uploaded != null) {
            String mimeType = uploaded.getContentType();

            if (mimeType.startsWith("image/")) {
                String fileName = uploaded.getFilename();

                String extension = "";
                int i = fileName.lastIndexOf('.');

                if (i >= 0) {
                    extension = fileName.substring(i + 1);
                }

                File file = uploaded.getFile();

                File dir = new File("public/images/projectImages");

                if (!dir.exists()) {
                    dir.mkdirs();
                }

                File newFile = new File("public/images/projectImages/", id + "." + extension);

                if (file.renameTo(newFile)) {
                    try {
                        BufferedImage img = ImageIO.read(newFile);
                        BufferedImage scaledImg = Scalr.resize(img, 90);

                        if (ImageIO.write(scaledImg, extension, new File("public/images/projectImages/", id + "thumb.jpg"))) {
                            return "/ file uploaded and thumbnail created.";
                        } else {
                            return "/ file uploaded but thumbnail creation failed.";
                        }

                    } catch (IOException e) {
                        return "/ file uploaded but thumbnail creation failed.";
                    }

                } else {
                    return "/ file upload failed.";
                }
            }
        }
        return "/ no image file.";


    }
}