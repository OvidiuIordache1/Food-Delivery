package src.model;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Driver extends User{
    private List<Review> reviews;
    private HashMap<Date, Delivery> livrari = new HashMap<Date, Delivery>();

    public Driver() {

    }

    public Driver(String username, String password, String email, String nume, String prenume, String nrTelefon) {
        userId = idSequence.incrementAndGet();
        this.username = username;
        this.password = password;
        this.email = email;
        this.nume = nume;
        this.prenume = prenume;
        this.nrTelefon = nrTelefon;
    }

    public void addReview(Review review) {
        reviews.add(review);
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public HashMap<Date, Delivery> getLivrari() {
        return livrari;
    }

    public void setLivrari(HashMap<Date, Delivery> livrari){
        this.livrari = livrari;
    }

    @Override
    public String toString() {
        return "src.classes.Driver{" +
                "id=" + userId +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", nrTelefon=" + nrTelefon +
                ", reviews=" + reviews +
                ", livrari=" + livrari +
                '}';
    }
}
