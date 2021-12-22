package classes;

import enums.PlecEnum;
import interfaces.Firma;
import interfaces.PracownikI;

public class Boss implements PracownikI, Firma {

    private String imie;
    private String nazwisko;
    private double staz;
    private int wiek;
    private PlecEnum getPlec;
    private String nazwa;
    private int liczbaPracownikow;

    public Boss(){
    }
    public Boss(String nazwa, int liczbaPracownikow,String imie, String nazwisko, double staz, int wiek, PlecEnum getPlec){
        this.nazwa = nazwa;
        this.liczbaPracownikow = liczbaPracownikow;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.staz = staz;
        this.wiek = wiek;
        this.getPlec = getPlec;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getLiczbaPracownikow() {
        return liczbaPracownikow;
    }

    public void setLiczbaPracownikow(int liczbaPracownikow) {
        this.liczbaPracownikow = liczbaPracownikow;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public double getStaz() {
        return staz;
    }

    public void setStaz(double staz) {
        this.staz = staz;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public PlecEnum getPlec() {
        return getPlec;
    }

    public void setPlec(PlecEnum getPlec) {
        this.getPlec = getPlec;
    }

    @Override
    public void getPlec(PlecEnum plec) {
        this.getPlec = plec;
    }

    @Override
    public int getWiek(int wiek) {
        this.wiek = wiek;
        return wiek;
    }

    @Override
    public String getImie(String imie) {
        this.imie = imie;
        return imie;
    }

    @Override
    public String getNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
        return nazwisko;
    }

    @Override
    public double getStaz(double staz) {
        this.staz = staz;
        return staz;
    }



    @Override
    public String getNazwa(String nazwa) {
        this.nazwa =nazwa;
        return nazwa;
    }

    @Override
    public int getLiczbaPracownikow(int liczbaPracownikow) {
        this.liczbaPracownikow = liczbaPracownikow;
        return liczbaPracownikow;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "nazwa firmy='" + nazwa + '\'' +
                ", liczba pracownikow=" + liczbaPracownikow + '\'' +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", staz=" + staz +
                ", wiek=" + wiek +
                ", plec=" + getPlec +
                '}';
    }
}
