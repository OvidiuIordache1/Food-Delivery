package src.model;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String nume;
    private Address adresa;
    private String nrTelefon;
    private Menu meniu;
    private List<Review> reviews;

    public Restaurant(String nume, Address adresa, String nrTelefon){
        this.nume = nume;
        this.adresa = adresa;
        this.nrTelefon = nrTelefon;
    }

    public Restaurant(String nume, Address adresa, String nrTelefon, Menu meniu){
        this.nume = nume;
        this.adresa = adresa;
        this.nrTelefon = nrTelefon;
        this.meniu = meniu;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Address getAdresa() {
        return adresa;
    }

    public void setAdresa(Address adresa) {
        this.adresa = adresa;
    }

    public String getNrTelefon() {
        return nrTelefon;
    }

    public void setNrTelefon(String nrTelefon) {
        this.nrTelefon = nrTelefon;
    }

    public Menu getMeniu() {
        return meniu;
    }

    public void setMeniu(Menu meniu) {
        this.meniu = meniu;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public double getAvgReview() {
        double suma = 0;
        for (Review review: reviews)
        {
            suma += review.getNr();
        }
        if (reviews.size() > 0) {
            return suma / reviews.size();
        }
        return -1;
    }

    public void addReview(Review review) {
        if (this.reviews == null) {
            List<Review> newList = new ArrayList<Review>();
            newList.add(review);
            this.reviews = newList;
        }
        else {
            this.reviews.add(review);
        }
    }

    @Override
    public String toString() {
        return "Restaurant { \n" +
                "nume='" + nume + '\'' +
                ",\n adresa=" + adresa +
                ",\n nrTelefon=" + nrTelefon + + '\'' +
                ",\n meniu=" + meniu +
                ",\n reviews=" + reviews +
                '}';
    }
}
