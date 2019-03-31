package controllers;

import play.mvc.*;
import play.data.*;
import javax.inject.Inject;

import views.html.*;
import play.db.ebean.Transactional;
import play.api.Environment;

// Import models
import models.users.*;
import models.*;
import models.shopping.*;
import models.users.*;
import models.shopping.OrderItem;

@Security.Authenticated(Secured.class)
// Authorise user (check if user is a customer)
@With(CheckIfMember.class)

public class ShoppingCtrl extends Controller {

    private FormFactory formFactory;
    private Environment env;

    @Inject
    public ShoppingCtrl(Environment e, FormFactory f) {
        this.env = e;
        this.formFactory = f;
    }
    // View an individual order
    @Transactional
    public Result viewOrder(long id) {
        ShopOrder order = ShopOrder.find.byId(id);
        return ok(orderConfirmed.render((Member)User.getUserById(session().get("email")), order));
    }

    // Add item to customer basket
    @Transactional
    public Result addToBasket(Long id) {

        // Find the item on sale
        Property property = Property.findp.byId(id);
        
        // Get basket for logged in customer
        Member member = (Member)User.getUserById(session().get("email"));
        
        // Check if item in basket
        if (member.getBasket() == null) {
            // If no basket, create one
            member.setBasket(new Basket());
            member.getBasket().setMember(member);
            member.update();
        }
        // Add product to the basket and save
        member.getBasket().addProperty(property);
        member.update();
        
        // Show the basket contents     
        return ok(basket.render(member));
    }

    @Transactional
    public Result emptyBasket() {
        
        Member m = (Member)User.getUserById(session().get("email"));
        m.getBasket().removeAllItems();
        m.getBasket().update();
        
        return ok(basket.render(m));
    }

    @Transactional
    public Result placeOrder() {
        Member m = (Member)User.getUserById(session().get("email"));
        
        // Create an order instance
        ShopOrder order = new ShopOrder();
        
        // Associate order with customer
        order.setMember(m);
        
        // Copy basket to order
        order.setItems(m.getBasket().getBasketItems());
        
        // Save the order now to generate a new id for this order
        order.save();
       
       // Move items from basket to order
        for (OrderItem i: order.getItems()) {
            // Associate with order
            i.setOrder(order);
            // Remove from basket
            i.setBasket(null);
            // update item
            i.update();
        }
        
        // Update the order
        order.update();
        
        // Clear and update the shopping basket
        m.getBasket().setBasketItems(null);
        m.getBasket().update();
        
        // Show order confirmed view
        return ok(orderConfirmed.render(m, order));
    }

    @Transactional
    public Result showBasket() {
        return ok(basket.render((Member)User.getUserById(session().get("email"))));
    }

    @Transactional
    public Result removeOne(Long itemId) {
        
        // Get the order item
        OrderItem item = OrderItem.find.byId(itemId);
        // Get user
        Member m = (Member)User.getUserById(session().get("email"));
        // Call basket remove item method
        m.getBasket().removeItem(item);
        m.getBasket().update();
        // back to basket
        return ok(basket.render(m));
    }


    
}