import classes.*;
import enums.PlecEnum;
import interfaces.PracownikI;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /* zad.1
        a) napisać interfejs CzlowiekI
        b) zadeklarować 2 metody
        c) napisać interfejs StudentI który dziedziczy po interfejsie CzlowiekI
        d) zadeklarować 3 metody
        e) napisać interfejs PracownikI który dziedziczy po interfejsie CzlowiekI
        f) zadeklarować 3 metody
         */

        /* zad.2
        a) napisać klasę Student która będzie implementować interfejs StudentI
        b) napisać klasę Pracownik która będzie implementować interfejs PracownikI
        c) stworzyć pola, gettery i settery, metodę toString dla obu klas, (constructor z przeciążeniem - jak ktoś chce ),
        (gettery i settery / toString() ..., najlepiej wygenerować: Code/Prawy myszy-->Generate-->getters/setters/toString)
        */

        /* zad.3
        a) stworzyć 2 objekty typu Student i uzupełnić wszystkie pola
        b) stworzyć 2 objekty typu Pracownik i uzupełnić wszystkie pola
        c) wypisać metody toString() wszystkich objektów

        zad.4 - Dla chętnych
        a) stworzyć klasę Kierownik która będzie implementować interfejs PracownikI,
        b) zaimplementować wszystkie metody, i stworzyć pola
        c) stworzyć 2 objekty typu Kierownik i uzupełnić wszystkie pola,
        d) stworzyć listę typu PracownikI --> List<PracownikI> listaPracownikow = new ArrayList<>();
        e) dodać do niej objekty typu Kierownik i Pracownik
        f) wypisać pętlą metody toString() wszystkich elementów listy
        */

        /* zad5 - Dla chętnych
        Stworzyć klasę która będzie implementować 2 lub 3 interfejsy następnie będzie
        dziedziczona przez inną klasę
        */

        Student kasia = new Student();
        kasia.getPlec(PlecEnum.KOBIETA);
        kasia.getKierunek("Informatyka");
        kasia.getWiek(23);
        kasia.getRok(2);
        kasia.getSemestr(3);
        System.out.println(kasia);
        System.out.println();

        Student bartek = new Student(3,5,"Administracja",25,PlecEnum.MEZCZYZNA);
        System.out.println(bartek);
        System.out.println();

        Pracownik anna = new Pracownik();
        anna.getImie("Anna");
        anna.getNazwisko("Kowalska");
        anna.getStaz(3.5);
        anna.setWiek(29);
        anna.getPlec(PlecEnum.KOBIETA);
        System.out.println(anna);
        System.out.println();

        Pracownik michal = new Pracownik("Michal","Nowak",4,35,PlecEnum.MEZCZYZNA);
        System.out.println(michal);
        System.out.println();

        Kierownik jan = new Kierownik("Jan","Batory",12.9,45,PlecEnum.MEZCZYZNA);
        Kierownik ewa = new Kierownik("Ewa","Potocka",13.5,50,PlecEnum.KOBIETA);
        
        List<PracownikI> listaPracownikow = new ArrayList<>();
        listaPracownikow.add(anna);
        listaPracownikow.add(michal);
        listaPracownikow.add(jan);
        listaPracownikow.add(ewa);

        for (Object pracownik: listaPracownikow
             ) {
            System.out.println(pracownik.toString());
        }
        System.out.println();

        Boss pawel = new Boss("Pato SA",150,"Pawel", "Kordel", 15,40,PlecEnum.MEZCZYZNA);
        System.out.println(pawel);
        System.out.println();

        CzlonekZarzadu andrzej = new CzlonekZarzadu("Prezes","Pato SA",150,"Andrzej","Popek",25,62,PlecEnum.MEZCZYZNA);
        System.out.println(andrzej);

    }
}
