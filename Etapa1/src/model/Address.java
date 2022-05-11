package src.model;

public class Address {
    protected String judet;
    protected String localitate;
    protected String sector;
    protected String strada;
    protected String nr;
    protected String bloc;
    protected String scara;
    protected String etaj;
    protected String ap;

    public Address(String judet, String localitate, String sector, String strada, String nr, String bloc, String scara,
                   String etaj, String ap ) {
        this.judet = judet;
        this.localitate = localitate;
        this.sector = sector;
        this.strada = strada;
        this.nr = nr;
        this.bloc = bloc;
        this.scara = scara;
        this.etaj = etaj;
        this.ap = ap;
    }

    public String getJudet() {
        return judet;
    }

    public void setJudet(String judet) {
        this.judet = judet;
    }

    public String getLocalitate() {
        return localitate;
    }

    public void setLocalitate(String localitate) {
        this.localitate = localitate;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getStrada() {
        return strada;
    }

    public void setStrada(String strada) {
        this.strada = strada;
    }

    public String getnr() {
        return nr;
    }

    public void setNr(String nr) {
        this.nr = nr;
    }

    public String getBloc() {
        return bloc;
    }

    public void setBloc(String bloc) {
        this.bloc = bloc;
    }

    public String getScara() {
        return scara;
    }

    public void setScara(String scara) {
        this.scara = scara;
    }

    public String getEtaj() {
        return etaj;
    }

    public void setEtaj(String etaj) {
        this.etaj = etaj;
    }

    public String getAp() {
        return ap;
    }

    public void setAp(String ap) {
        this.ap = ap;
    }

    @Override
    public String toString() {
        return "{" +
                "judet='" + judet + '\'' +
                ", localitate='" + localitate + '\'' +
                ", sector=" + sector +
                ", strada='" + strada + '\'' +
                ", nr='" + nr +
                ", bloc='" + bloc + '\'' +
                ", scara='" + scara + '\'' +
                ", etaj=" + etaj +
                ", ap=" + ap +
                '}';
    }
}
