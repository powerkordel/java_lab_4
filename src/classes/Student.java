package classes;
//a) napisać klasę Student która będzie implementować interfejs StudentI
import enums.PlecEnum;
import interfaces.StudentI;

public class Student implements StudentI {

    private int rok;
    private int semestr;
    private String kierunek;
    private int wiek;
    private PlecEnum getPlec;

    public Student(){

    }

    public Student(int rok,int semestr,String kierunek,int wiek, PlecEnum getPlec){
        this.rok = rok;
        this.semestr = semestr;
        this.kierunek = kierunek;
        this.wiek = wiek;
        this.getPlec = getPlec;
    }

    public int getRok() {
        return rok;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }

    public int getSemestr() {
        return semestr;
    }

    public void setSemestr(int semestr) {
        this.semestr = semestr;
    }

    public String getKierunek() {
        return kierunek;
    }

    public void setKierunek(String kierunek) {
        this.kierunek = kierunek;
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
    public int getRok(int rok) {
        this.rok = rok;
        return rok;
    }

    @Override
    public int getSemestr(int semestr) {
        this.semestr = semestr;
        return semestr;
    }

    @Override
    public String getKierunek(String kierunek) {
        this.kierunek = kierunek;
        return kierunek;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rok=" + rok +
                ", semestr=" + semestr +
                ", kierunek='" + kierunek + '\'' +
                ", wiek=" + wiek +
                ", plec=" + getPlec +
                '}';
    }
}
