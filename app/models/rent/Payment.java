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
public class Payment extends Model {

    @Id
    private Long id;
    @Constraints.Required
    private double amtPaid;
    @Constraints.Required
    private Date datePaid;


    
    // Default constructor
    public  Payment() {
    }

    public Payment(Long id, double amtPaid, Date datePaid) {
        this.id = id;
        this.amtPaid = amtPaid;
        this.datePaid = datePaid;
    }
    
	
   //Generic query helper
    public static Finder<Long,Payment> find = new Finder<>(Payment.class);

    //Find all Products in the database
    public static List<Payment> findAll() {
        return Payment.find.all();
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getAmtPaid() {
        return amtPaid;
    }

    public void setAmtPaid(double amtPaid) {
        this.amtPaid = amtPaid;
    }

    public Date getDatePaid() {
        return datePaid;
    }

    public void setDatePaid(Date datePaid) {
        this.datePaid = datePaid;
    }
    
}