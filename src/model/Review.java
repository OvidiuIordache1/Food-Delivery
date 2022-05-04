package src.model;

import java.time.LocalDate;

public class Review {
    private User user;
    private String mesaj;
    private int nr;
    private LocalDate data;

    public Review(User user, String mesaj, int nr, LocalDate data) {
        this.user = user;
        this.mesaj = mesaj;
        this.nr = nr;
        this.data = data;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getMesaj() {
        return mesaj;
    }

    public void setMesaj(String mesaj) {
        this.mesaj = mesaj;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "src.classes.Review{" +
                "user=" + user.getUserId() +
                ", mesaj='" + mesaj + '\'' +
                ", nr=" + nr +
                "/5, data=" + data +
                '}';
    }
}
