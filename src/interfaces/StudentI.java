package interfaces;
 /* c) napisać interfejs StudentI który dziedziczy po interfejsie CzlowiekI
    d) zadeklarować 3 metody*/
public interface StudentI extends CzlowiekI{
    int getRok(int rok);
    int getSemestr(int semester);
    String getKierunek(String kierunek);



}
