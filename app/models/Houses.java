package models;

import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import models.users.*;


@Table(name="Property")
// the user type of this class is "admin"
@DiscriminatorValue("h")

@Entity
public class Houses extends Property {
    
    private double gardenSize;
    private boolean garage;

    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="AID")
    private Address address;

    //Default Cons
    public Houses() {

    }

    //Overloaded Cons
    public Houses(Long id,  int numBeds, int numBaths, double price, double gardenSize, boolean garage) {
        super(id, numBeds, numBaths, price);
        this.gardenSize = gardenSize;
        this.garage = garage;
    }


    //Getters and Setters
    public double getGardenSize() {
        return this.gardenSize;
    }

    public void setGardenSize(double gardenSize) {
        this.gardenSize = gardenSize;
    }

    public boolean getGarage() {
        return garage;
    }

    public void setGarage(boolean garage){
        this.garage = garage;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address a) {
        this.address = a;
    }



    //Finders
    public static final Finder<Long, Houses> find = new Finder<>(Houses.class);

    public static final List<Houses> findAll() {
        return Houses.find.all();
    }

    public static final List<Houses> findRange(int min, int max) {
        List<Houses> resList = Houses.find.all();
        Iterator<Houses> i = resList.iterator();

        while (i.hasNext()) {
            Houses house = i.next();
            double hp = house.getPrice();

            if(hp < min || hp > max)
                i.remove();
        }

        return resList;
    }




}