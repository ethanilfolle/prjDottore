public class Fattura {
    private Paziente paz;
    private Dottore doc;
    private double importo;

    public Fattura(Paziente paz, Dottore doc, double importo) {
        this.paz = paz;
        this.doc = doc;
        this.importo = importo;
    }

    public Paziente getPaz() {
        return paz;
    }

    public void setPaz(Paziente paz) {
        this.paz = paz;
    }

    public Dottore getDoc() {
        return doc;
    }

    public void setDoc(Dottore doc) {
        this.doc = doc;
    }

    public double getImporto() {
        return importo;
    }

    public void setImporto(double importo) {
        this.importo = importo;
    }

    @Override
    public String toString() {
        String testo = "";
        testo += paz + "\n";
        testo += doc + "\n";
        testo += importo + "\n";
        return testo;
    }
}
