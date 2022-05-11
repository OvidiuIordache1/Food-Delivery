package src.model;

public class Delivery extends Order{
    private Address adresa;
    private String status;
    private Driver driver;

    public Address getAdresa() {
        return adresa;
    }

    public void setAdresa(Address adresa) {
        this.adresa = adresa;
    }

    public String getStatus() { return status; };

    public void setStatus(String status) { this.status = status; }

    public Driver getDriver() { return driver; }

    public void setDriver(Driver driver) { this.driver = driver; }

    @Override
    public String toString() {
        return "src.classes.Delivery{" +
                "client=" + client +
                "data='" + data + '\'' +
                ", comanda=" + comanda +
                ", totalPrice=" + totalPrice +
                ", addresa=" + adresa +
                ", status='" + status + '\'' +
                ", driver=" + driver +
                '}';
    }
}
