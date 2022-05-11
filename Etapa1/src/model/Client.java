package src.model;

import java.util.ArrayList;
import java.util.List;

public class Client extends User {
    private List<Order> comenzi;
    private List<Address> adrese;

    public Client(String username, String password, String email, String nume, String prenume, String nrTelefon) {
        userId = idSequence.incrementAndGet();
        this.username = username;
        this.password = password;
        this.email = email;
        this.nume = nume;
        this.prenume = prenume;
        this.nrTelefon = nrTelefon;
    }

    public Client(String username, String password, String email, String nume, String prenume, String nrTelefon, List<Address> adrese) {
        userId = idSequence.incrementAndGet();
        this.username = username;
        this.password = password;
        this.email = email;
        this.nume = nume;
        this.prenume = prenume;
        this.nrTelefon = nrTelefon;
        this.comenzi = comenzi;
        this.adrese = adrese;
    }

    public List<Order> getComenzi() { return comenzi; }

    public void setComenzi(List<Order> comenzi) { this.comenzi = comenzi; }

    public List<Address> getAdrese() { return adrese; }

    public void setAdrese(List<Address> adrese) { this.adrese = adrese; }

    public void addAdresa(Address adresa) {
        if (this.adrese == null) {
            List<Address> newList = new ArrayList<Address>();
            newList.add(adresa);
            this.adrese = newList;
        }
        else {
            this.adrese.add(adresa);
        }
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", nrTelefon=" + nrTelefon +
                ",\n comenzi=" + comenzi +
                ",\n adrese=" + adrese +
                "\n}";
    }
}
