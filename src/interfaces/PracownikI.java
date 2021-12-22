package interfaces;
/*  e) napisać interfejs PracownikI który dziedziczy po interfejsie CzlowiekI
    f) zadeklarować 3 metody */
public interface PracownikI extends CzlowiekI{
    String getImie(String imie);
    String getNazwisko(String Nazwisko);
    double getStaz(double staz);
}
