package src.model;

import java.util.Date;
import java.util.List;

public class Order {
    protected Client client;
    protected Date data;
    protected List<Food> comanda;
    protected double totalPrice;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getData() {
        return this.data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public List<Food> getComanda() {
        return comanda;
    }

    public void setComanda(List<Food> comanda) {
        this.comanda = comanda;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "src.classes.Order{" +
                "client=" + client +
                "data='" + data + '\'' +
                ", comanda=" + comanda +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
