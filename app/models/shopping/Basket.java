package models.shopping;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import models.*;
import models.users.*;


// Product entity managed by Ebean
@Entity
public class Basket extends Model {
    @OneToMany(mappedBy = "basket", cascade = CascadeType.PERSIST)
    private List<OrderItem> basketItems;
    
    @OneToOne
    private Member member;

    @Id
    private Long id;
    
    // Default constructor
    public  Basket() {
    }
    
	
   //Generic query helper
    public static Finder<Long,Basket> find = new Finder<Long,Basket>(Basket.class);

    //Find all Products in the database
    public static List<Basket> findAll() {
        return Basket.find.all();
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //Mapped getters and setters
    public List<OrderItem> getBasketItems() {
        return basketItems;
    }

    public void setBasketItems(List<OrderItem> basketItems) {
        this.basketItems = basketItems;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    // Add item for sale to basket
    // Either update existing order item or ad a new one.
    public void addProperty(Property prop) {
        
        boolean itemFound = false;
        // Check if product already in this basket
        // Check if item in basket
        // Find orderitem with this product
        // if found increment quantity
        for (OrderItem oi : basketItems) {
            if (oi.getProperty().getId() == prop.getId()) {
                oi.increaseQty();
                itemFound = true;
                break;
            }
        }
        if (itemFound == false) {
            // Add orderItem to list
            OrderItem newProp = new OrderItem(prop);
            // Add to items
            basketItems.add(newProp);
        }
    }

    public double getBasketTotal() {
        
        double total = 0;
        
        for (OrderItem i: basketItems) {
            total += i.getItemTotal();
        }
        return total;
    }

    public void removeItem(OrderItem item) {

        // Using an iterator ensures 'safe' removal of list objects
        // Removal of list items is unreliable as index can change if an item is added or removed elsewhere
        // iterator works with an object reference which does not change
        for (Iterator<OrderItem> iter = basketItems.iterator(); iter.hasNext();) {
            OrderItem i = iter.next();
            if (i.getId().equals(item.getId()))
            {
                // If more than one of these items in the basket then decrement
                if (i.getQuantity() > 1 ) {
                    i.decreaseQty();
                }
                // If only one left, remove this item from the basket (via the iterator)
                else {
                    // delete object from db
                    i.delete();
                    // remove object from list
                    iter.remove();
                    break;
                }             
            }
       }
    }

    public void removeAllItems() {
        for(OrderItem i: this.basketItems) {
            i.delete();
        }
        this.basketItems = null;
    }

}