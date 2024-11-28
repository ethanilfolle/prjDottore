public class Main {
    public static void main(String[] args) {

        Paziente p1 = new Paziente("Stefano", "1981St");
        Dottore d1 = new Dottore("Davide", 30, "Chirurgo plastico");


        Persona p1 = new Persona("Ethan");
        Persona p2 = new Paziente("Stefano", "07St");
        Persona p3 = new Dottore("Davide", 20, "Chirugo plastico");
        Persona p4 = new Fattura(p1, d1, 50.99);
    }
}