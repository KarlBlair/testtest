package models.rent;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import models.*;
import models.users.*;


// Product entity managed by Ebean
@Entity
public class RentDue extends Model {

    @OneToOne
    private Member member;

    private Long id;
    private double price;
    private Date dueDate;

    public RentDue() {

    }

    public RentDue(Long id, double price, Date dueDate) {
        this.id = id;
        this.price = price;
        this.dueDate = dueDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
    
    //Generic query helper
    public static Finder<Long,RentDue> find = new Finder<>(RentDue.class);

    //Find all Products in the database
    public static List<RentDue> findAll() {
        return RentDue.find.all();
    }

    
}
