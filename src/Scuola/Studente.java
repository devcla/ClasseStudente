package Scuola;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Studente {

    private String nome;
    private String cognome;
    private Date dataDiNascita;
    private int matricola;
    private String corsoDiStudi;
    private ArrayList<Float> voti;
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

    public ArrayList<Float> getVoti() {
        return voti;
    }

    public Studente(String nome, String cognome, String dataDiNascita, int matricola, String corsoDiStudi) {
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
        this.corsoDiStudi = corsoDiStudi;
        this.voti = new ArrayList<Float>();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        try {
            this.dataDiNascita = dateFormat.parse(dataDiNascita);
        } catch (ParseException e) {
            System.err.println("Error parsing date: " + e.getMessage());
        }
    }

    public void aggiungiVoto(float voto) {
        if(voti.size() < MAX_VOTI) {
            voti.add(voto);
        }
    }

    public float calcolaMedia() {
        float media = 0;
        for (float voto : voti) {
            media += voto;
        }
        media /= voti.size();
        return media;
    }

    public void rimuoviVoti() {
        if(!voti.isEmpty()) {
            voti.clear();
        }
    }

    public int calcolaEta() {
        LocalDate birthDate = dataDiNascita.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate now = LocalDate.now();
        Period age = Period.between(birthDate, now);
        return age.getYears();
    }

    @Override
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
