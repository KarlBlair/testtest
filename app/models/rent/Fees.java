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
public class Fees extends Model {
    @Id
    private Long id;
    private double utility;
    private double councilTax;
    private double phoneBill;
    private double other;
    private double landlordFee;
    private double ourFee;

    @OneToOne
    private Property property;

    public Fees(){
        this.utility = .35;
        this.councilTax= .20;
        this.phoneBill=.10;
        this.other=.10;
        this.landlordFee = .20;
        this.ourFee = .5;
    }

    public Fees(Long id, double utility, double councilTax, double phoneBill, double other, double landlordFee, double ourFee) {
        this.id = id;
        this.utility = utility;
        this.councilTax = councilTax;
        this.phoneBill = phoneBill;
        this.other = other;
        this.landlordFee = landlordFee;
        this.ourFee = ourFee;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getUtility() {
        return utility;
    }

    public void setUtility(double utility) {
        this.utility = utility;
    }

    public double getCouncilTax() {
        return councilTax;
    }

    public void setCouncilTax(double councilTax) {
        this.councilTax = councilTax;
    }

    public double getPhoneBill() {
        return phoneBill;
    }

    public void setPhoneBill(double phoneBill) {
        this.phoneBill = phoneBill;
    }

    public double getOther() {
        return other;
    }

    public void setOther(double other) {
        this.other = other;
    }

    public double getLandlordFee() {
        return landlordFee;
    }

    public void setLandlordFee(double landlordFee) {
        this.landlordFee = landlordFee;
    }

    public double getOurFee() {
        return ourFee;
    }

    public void setOurFee(double ourFee) {
        this.ourFee = ourFee;
    }
    
    //Generic query helper
    public static Finder<Long,Fees> find = new Finder<Long,Fees>(Fees.class);

    //Find all Products in the database
    public static List<Fees> findAll() {
       return Fees.find.all();
    }
}