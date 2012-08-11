package net.bluedash.jsf.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * @author Weinan Li
 * @created_at 08 11 2012
 */
@ManagedBean
@RequestScoped
public class Order {

    private int amount = 0;
    private int total = 0;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        total = total - this.amount;
        total = total + amount;
        this.amount = amount;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
