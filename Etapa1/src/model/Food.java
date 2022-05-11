package src.model;

import java.util.Arrays;

public class Food {
    protected String nume;
    protected String[] continut;
    protected String descriere;
    protected double pret;

    public Food() {

    }

    public Food(String nume, String[] continut, String descriere, double pret){
        this.nume = nume;
        this.continut = continut;
        this.descriere = descriere;
        this.pret = pret;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String[] getContinut() {
        return continut;
    }

    public void setContinut(String[] continut) {
        this.continut = continut;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "src.classes.Food{" +
                "nume='" + nume + '\'' +
                ", continut='" + Arrays.toString(continut) + '\'' +
                ", descriere='" + descriere + '\'' +
                ", pret=" + pret +
                '}';
    }
}
