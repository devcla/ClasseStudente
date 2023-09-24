package Scuola;


import java.util.Date;
import java.util.List;

public class Studente {

    private String nome;
    private String cognome;
    private Date dataDiNascita;
    private int matricola;
    private String corsoDiStudi;
    private List<Float> voti;
    private final int MAX_VOTI = 10;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Date getDataDiNascita() {
        return dataDiNascita;
    }

    public int getMatricola() {
        return matricola;
    }

    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }

    public String getCorsoDiStudi() {
        return corsoDiStudi;
    }

    public void setCorsoDiStudi(String corsoDiStudi) {
        this.corsoDiStudi = corsoDiStudi;
    }

    public List<Float> getVoti() {
        return voti;
    }

    public void aggiungiVoto(float voto) {
        if(voti.size() < MAX_VOTI) {
            voti.add(voto);
        }
    }

    public void rimuoviVoti() {
        if(!voti.isEmpty()) {
            voti.clear();
        }
    }

    public int calcolaEta() {
        return ;
    }

    public String toString() {
        String studenteToString;
        StringBuilder studenteToStringBuilder = new StringBuilder("Nome: " + nome + " Cognome: " + cognome + "\n"
                + "Eta: " + calcolaEta() + "\n" + "Matricola: " + matricola + "\n"
                + "Corso di Studi: " + corsoDiStudi);
        for (float voto : voti) {
            studenteToStringBuilder.append(voto);
        }
        studenteToString = studenteToStringBuilder.toString();
        return studenteToString;
    }
}
