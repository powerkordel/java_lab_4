public class Main {
    public static void main(String[] args) {

        /* zad.1
        a) Stwożyć interfejs Budynek,
        b) interfejs powinien mieć metody:
            - double powierzchnia(double pow);
            - String adresBudynku(String adres);
            - int liczbaOkien(int value);
            - void liczbaMieszkancow(int value);
            - void kolorDomu(KolorEnum kolor);
        c) stworzyć enum KolorEnum z przykładowymi kolorami,
        c) stworzyć jedną metodę z 2 parametrami wymyśloną przez siebie,
        */
        /* zad.2
        a) napisać klasę Dom implementującą interfejs Budynek,
        b) zaimplementować wszystkie metody,
        c) stworzyć brakujące pola(prywatne), gettery i settery, napisać metodę toString
        (gettery i settery najlepiej wygenerować: Code/Prawy myszy --> Generate --> getters/setters/toString)
        d) stworzyć jedną dowolną metodę przez siebie
        */
        /* zad.3
        a) w klasie Main stworzyć 2 objekty typu Dom deklarując pierwszy objekt Typem Dom,
        drugi objekt typem Budynek,
        b) wykorzystać wszystkie metody do implementacji pól
        c) wyświetlić w konsoli metodę toString (na obu objektach) opisującą zachowanie klasy Dom
        */

        Dom blizniak = new Dom(70,"ul. Szara", 8,5, "dom",3,KolorEnum.NIEBIESKI);
        System.out.println(blizniak);
        blizniak.wycena(700000);
        System.out.println();

        Dom mieszkanie = new Dom();

        mieszkanie.powierzchnia(86.9);
        mieszkanie.adresBudynku("ul. Piwna 38");
        mieszkanie.liczbaOkien(7);
        mieszkanie.kolorDomu(KolorEnum.SZARY);
        mieszkanie.opis("blok",7);
        mieszkanie.liczbaMieszkancow(4);
        System.out.println(mieszkanie);
        mieszkanie.wycena(550000);
        System.out.println();

        Budynek loft = new Dom();
        loft.powierzchnia(45.5);
        loft.adresBudynku("ul. Srebrna 45");
        loft.liczbaOkien(5);
        loft.kolorDomu(KolorEnum.CZERWONY);
        loft.opis("kamienica",4);
        loft.liczbaMieszkancow(2);
        System.out.println(loft);
        System.out.println();




    }
}
