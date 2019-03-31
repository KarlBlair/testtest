package models.users;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import models.rent.*;
import models.*;
import models.shopping.*;

@Table(name="User")
// the user type of this class is "admin"
@DiscriminatorValue("m")
@Entity
public class Member extends User {

    @OneToOne(mappedBy="member", cascade = CascadeType.ALL)
    private RentDue rentDue;

    @ManyToOne
    private Property property;

    @OneToOne(mappedBy="member", cascade = CascadeType.ALL)
    private Basket basket;

    @OneToMany(mappedBy="member", cascade = CascadeType.ALL)
    private List<ShopOrder> orders;

    public Member(){

    }

    public Member(String email, String role, String fname, String lname, String password) {
        super(email, role, fname, lname,password);
    }

    public static final Finder<Long, Member> find = new Finder<>(Member.class);
			    
    public static final List<Member> findAll() {
       return Member.find.all();
    }

    //Mapped Getters and setters
    public RentDue getRentDue() {
        return rentDue;
    }

    public void setRentDue(RentDue rentDue) {
        this.rentDue = rentDue;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property p) {
        this.property = p;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public List<ShopOrder> getOrders() {
        return orders;
    }

    public void setOrders(List<ShopOrder> orders) {
        this.orders = orders;
}

}