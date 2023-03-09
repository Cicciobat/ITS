/*
 * Copyright (c) 2023. Ciccio Battaglia
 * All rights reserved.
 *
 */

package its.persona;

public class Persona {
    protected String nome, cognome;

    public Persona(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

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

    @Override
    public String toString() {
        return "Mi chiamo: " +
                "\n\t Nome: " + getNome() +
                "\n\t Cognome: " + getCognome();
    }
}

class Studente extends Persona{
    private String universita, matricola;

    public Studente(String nome, String cognome, String universita, String matricola) {
        super(nome, cognome);
        this.universita = universita;
        this.matricola = matricola;
    }

    public String getUniversita() {
        return universita;
    }

    public void setUniversita(String universita) {
        this.universita = universita;
    }

    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n Studio a: " +
                "\n\t Universit\u00E0: " + getUniversita() +
                "\n\t Matricola: " + getMatricola();
    }
}

class Impiegato extends Persona{
    private String datoreLavoro;
    private double salario;

    public Impiegato(String nome, String cognome, String datoreLavoro, double salario) {
        super(nome, cognome);
        this.datoreLavoro = datoreLavoro;
        this.salario = salario;
    }

    public String getDatoreLavoro() {
        return datoreLavoro;
    }

    public void setDatoreLavoro(String datoreLavoro) {
        this.datoreLavoro = datoreLavoro;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n Informazioni lavorative: " +
                "\n\t Datore di lavoro: " + getDatoreLavoro() +
                "\n\t Stipendio: " + getSalario();
    }
}

class Dirigente extends Impiegato{
    private String dipartimento;

    public Dirigente(String nome, String cognome, String datoreLavoro, double salario, String dipartimento) {
        super(nome, cognome, datoreLavoro, salario);
        this.dipartimento = dipartimento;
    }

    public String getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(String dipartimento) {
        this.dipartimento = dipartimento;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n\t Dipartimento: " + getDipartimento();
    }
}
