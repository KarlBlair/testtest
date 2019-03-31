package models;

import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import models.users.*;

@Table(name="Property")
// the user type of this class is "admin"
@DiscriminatorValue("a")

@Entity
public class Apartment extends Property {
    @Id
    private Long id;

    private int floor;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="AID")
    private Address address;

    public Apartment() {

    }

    //Overloaded Cons
    public Apartment(Long id,  int numBeds, int numBaths, double price, int floor) {
        super(id, numBeds, numBaths, price);
        this.floor = floor;
    }

    //Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(){
        
    }


    //Finders
    public static final Finder<Long, Apartment> find = new Finder<>(Apartment.class);

    public static final List<Apartment> findAll() {
        return Apartment.find.all();
    }
}