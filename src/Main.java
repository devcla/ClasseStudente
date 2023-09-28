import Scuola.Studente;

public class Main {
    public static void main(String[] args) {
        Studente s1 = new Studente("Mario", "Rossi", "2004/11/11", 12345, "Informatica");
        Studente s2 = new Studente("Luigi", "Verdi", "2005/11/11", 12346, "Informatica");

        s1.aggiungiVoto(10);
        s1.aggiungiVoto(9);
        s1.aggiungiVoto(8);
        s1.aggiungiVoto(7);
        System.out.println(s1.calcolaMedia());
        System.out.println(s1.calcolaEta());

        s2.aggiungiVoto(2);
        s2.aggiungiVoto(3);
        s2.aggiungiVoto(2);
        s2.aggiungiVoto(1);
        System.out.println(s2.calcolaMedia());
        System.out.println(s2.calcolaEta());
    }
}