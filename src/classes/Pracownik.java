package classes;
//b) napisać klasę Pracownik która będzie implementować interfejs PracownikI
import enums.PlecEnum;
import interfaces.CzlowiekI;
import interfaces.PracownikI;

public class Pracownik implements PracownikI {

    private String imie;
    private String nazwisko;
    private double staz;
    private int wiek;
    private PlecEnum getPlec;

    public Pracownik(){

    }

    public Pracownik(String imie, String nazwisko, double staz, int wiek, PlecEnum getPlec){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.staz = staz;
        this.wiek = wiek;
        this.getPlec = getPlec;
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
    public String toString() {
        return "Pracownik{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", lata stazu=" + staz +
                ", wiek=" + wiek +
                ", plec=" + getPlec +
                '}';
    }
}
