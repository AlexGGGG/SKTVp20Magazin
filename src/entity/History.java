/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author User
 */
public class History implements Serializable{
    private Shoes shoes;
    private Buyer buyer;
    private Date takeOn;
    private int payment;
    private int quantity;

    public History() {
    }

    public History(Shoes shoes, Buyer buyer, Date takeOn, int payment, int quantity) {
        this.shoes = shoes;
        this.buyer = buyer;
        this.takeOn = takeOn;
        this.payment = payment;
        this.quantity = quantity;
    }

    public Shoes getShoes() {
        return shoes;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public Date getTakeOn() {
        return takeOn;
    }

    public int getPayment() {
        return payment;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setCar(Shoes shoes) {
        this.shoes = shoes;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public void setTakeOn(Date takeOn) {
        this.takeOn = takeOn;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "History{" + "shoes=" + shoes + ", buyer=" + buyer + ", takeOn=" + takeOn + ", payment=" + payment + ", quantity=" + quantity + '}';
    }

    public void setShoes(Shoes shoes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}