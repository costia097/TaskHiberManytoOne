package net;

import net.models.Cart;
import net.models.Items;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.Set;

@Component
public class Logic {

    @Autowired
    private SessionFactory sessionFactory;
    @Transactional
    public void method() {
        Session currentSession = sessionFactory.getCurrentSession();
        Cart cart = new Cart();
        cart.setName("My");

        Items items1 = new Items("t1100",2,2,cart);
        Items items2 = new Items("t1100",2,2,cart);
        Items items3 = new Items("t1100",2,2,cart);

        Set<Items> items = new HashSet<Items>();

        items.add(items1);
        items.add(items2);
        items.add(items3);

        currentSession.save(cart);
        currentSession.save(items1);
        currentSession.save(items2);
        currentSession.save(items3);
    }
}
