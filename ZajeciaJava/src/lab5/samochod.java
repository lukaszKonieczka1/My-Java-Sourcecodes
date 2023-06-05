package lab5;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class samochod {
    String marka, model, pojemnosc, typ, silnik, rok_produkcji,cena;
    LocalDate datarej;

    public samochod(String marka, String model, String pojemnosc, String typ, String silnik, String rok_produkcji, String cena, int y, int m, int d){
        setMarka(marka);
        setModel(model);
        setPojemnosc(pojemnosc);
        setTyp(typ);
        setSilnik(silnik);
        setCena(cena);
        setRok_produkcji(rok_produkcji);
        setDatarej(y,m,d);
    }

    public void getter(){
        System.out.print("\n| Marka: "+getMarka()+" |" +
                " Model: "+getModel()+"|" +
                " Pojemnosc: "+getPojemnosc()+" |" +
                " Typ: "+getTyp()+" |" +
                " Silnik: "+getSilnik()+" |" +
                " Cena: "+getCena()+" |" +
                " Rok produkcji: "+getRok_produkcji()+" |" +
                " Data pierwszej rejestracji: "+getDatarej()+" |" +
                " "+warranty()+" |\n");
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPojemnosc() {
        return pojemnosc;
    }

    public void setPojemnosc(String pojemnosc) {
        this.pojemnosc = pojemnosc;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public String getSilnik() {
        return silnik;
    }

    public void setSilnik(String silnik) {
        this.silnik = silnik;
    }

    public String getRok_produkcji() {
        return rok_produkcji;
    }

    public void setRok_produkcji(String rok_produkcji) {
        this.rok_produkcji = rok_produkcji;
    }

    public String getCena() {
        return cena;
    }

    public void setCena(String cena) {
        this.cena = cena+" zl";
    }

    public LocalDate getDatarej() {
        return datarej;
    }

    public void setDatarej(int y, int m, int d) {

        this.datarej = LocalDate.of(y,m,d);
    }


    public String warranty(){
        long diff=ChronoUnit.DAYS.between(datarej,LocalDate.now());
        if(diff>730)
            return "Nie ma gwarancji";
        else
            return "Ma gwarancje";
    }
}
