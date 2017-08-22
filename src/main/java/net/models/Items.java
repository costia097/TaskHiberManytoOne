package net.models;

import javax.persistence.*;

@Entity
@Table(name = "items")
public class Items {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

//    @Column(name = "cart_id")
//    private int cart_id;

    @Column(name = "item_id")
    private String item_id;

    @Column(name = "item_toltal")
    private int item_total;

    @Column(name = "quantity")
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "cart_id",nullable = false)
    private Cart cart;

    public Items() {
    }

    public Items(String item_id, int item_total, int quantity, Cart cart) {
        this.item_id = item_id;
        this.item_total = item_total;
        this.quantity = quantity;
        this.cart = cart;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    public int getCart_id() {
//        return cart_id;
//    }
//
//    public void setCart_id(int cart_id) {
//        this.cart_id = cart_id;
//    }

    public String getItem_id() {
        return item_id;
    }

    public void setItem_id(String item_id) {
        this.item_id = item_id;
    }

    public int getItem_total() {
        return item_total;
    }

    public void setItem_total(int item_total) {
        this.item_total = item_total;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
