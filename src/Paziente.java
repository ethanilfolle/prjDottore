public class Paziente extends Persona{
    private String nIde;

    public Paziente(String nome, String nIde) {
        super(nome);
        this.nIde = nIde;
    }

    public String getnIde() {
        return nIde;
    }

    public void setnIde(String nIde) {
        this.nIde = nIde;
    }

    @Override
    public String toString() {
        String testo = "";
        testo += nIde;
        return testo;
    }
}
