public class Dottore extends Persona{
    private double parcella;
    private String specificazione;

    public Dottore(String nome, double parcella, String specificazione) {
        super(nome);
        this.parcella = parcella;
        this.specificazione = specificazione;
    }

    public double getParcella() {
        return parcella;
    }

    public void setParcella(double parcella) {
        this.parcella = parcella;
    }

    public String getSpecificazione() {
        return specificazione;
    }

    public void setSpecificazione(String specificazione) {
        this.specificazione = specificazione;
    }

    @Override
    public String toString() {
        String testo = "";
        testo += parcella + "\n";
        testo += specificazione + "\n";
        return testo;
    }
}
