public class Libreria {

    private String autore;
    private String sbn;
    private String titolo;
    private double prezzo;

    public Libreria(String autore, String sbn, String titolo, double prezzo) {
        this.autore = autore;
        this.sbn = sbn;
        this.titolo = titolo;
        this.prezzo = prezzo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getSbn() {
        return sbn;
    }

    public void setSbn(String sbn) {
        this.sbn = sbn;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
}
