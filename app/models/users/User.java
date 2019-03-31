package models.users;

import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity

@Table(name = "User")

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

@DiscriminatorColumn(name = "type")

@DiscriminatorValue("u")

public class User extends Model {
    @Id
    public String email;

    @Constraints.Required
    public String role;

    @Constraints.Required
    public String fname;

    @Constraints.Required
    public String lname;

    @Constraints.Required
    public String password;

    //Default cons
    public User() {
    }

    //Overloaded
    public User(String email, String role, String fname, String lname,String password) {
        this.email = email;
        this.fname = fname;
        this.lname = lname;
        this.role = role;
        this.password = password;

    }

    //Getters and Setters
    public String getEmail() {
        return this.email;
    }

    public void setEmail() {
        this.email = email;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole() {
        this.role = role;
    }

    public String getFname() {
        return this.fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return this.lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword() {
        this.password = password;
    }

    //Finders
    public static final Finder<Long, User> find = new Finder<>(User.class);

    //Identification
    public static User authenticate(String email, String password) {
        return find.query().where().eq("email", email).eq("password", password).findUnique();
    }

    //For the dynamic login, log out
    public static User getUserById(String id) {
        if (id == null) {
            return null;
        } else {
            return find.query().where().eq("email", id).findUnique();
        }
    } 

}