package models.shopping;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import models.*;
import models.users.*;

// OrderItem entity managed by Ebean
@Entity
public class OrderItem extends Model {
    @ManyToOne
    private ShopOrder order;
    
    @ManyToOne
    private Basket basket;
    
    // Unidirection mapping - Many order items can have one product
    // Product not interested in this
    @ManyToOne
    private Property property;

    @Id
    private Long id;
    
    private int quantity;
    private double price;

    // Default constructor
    public  OrderItem() {
    }

    public OrderItem(Property prop) {
        property = prop;
        quantity = 1;
        price = prop.getPrice();
    }
    
    
    // Increment quantity
    public void increaseQty() {
        quantity += 1;
    }
    
    // Decrement quantity
    public void decreaseQty() {
        quantity -= 1;
    }
    
    // Calculate and return total price for this order item
    public double getItemTotal() {
        return this.price * this.quantity;
    }
	
   //Generic query helper
    public static Finder<Long,OrderItem> find = new Finder<Long,OrderItem>(OrderItem.class);

    //Find all Products in the database
    public static List<OrderItem> findAll() {
        return OrderItem.find.all();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //Mapped getters and setters
    public ShopOrder getOrder() {
        return order;
    }

    public void setOrder(ShopOrder order) {
        this.order = order;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }
}