/*
 * Copyright (c) 2023. Ciccio Battaglia
 * All rights reserved.
 *
 */

package its.Animali;

/* Classe Astratta per la creazione di nuovi oggetti "Animali" */
public abstract class Animale {
    protected String nome;  // Nome dell'animale
    protected String razza;     // Razza dell'animale
    protected double peso;      // Peso dell'animale
    protected boolean isPeloLungo;      // Pelo dell'animale: True se lungo, False se corto
    private static int numeroAnimali;   // Contatore per il numero di Animali creati

    /*
     * Costruttore della classe animale che viene ereditato solo dalle sue sottoclassi
     */
    protected Animale(String nome, String razza, double peso, boolean isPeloLungo) {
        setNome(nome);
        setRazza(razza);
        setPeso(peso);
        setPeloLungo(isPeloLungo);
        numeroAnimali++;    // Viene incrementato il numero di animali ogni volta che il costruttore viene chiamato
    }

    /*
     * Di seguito metodi getter and setter per gli attributi della classe
     */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRazza() {
        return razza;
    }

    public void setRazza(String razza) {
        this.razza = razza;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isPeloLungo() {
        return isPeloLungo;
    }

    public void setPeloLungo(boolean peloLungo) {
        isPeloLungo = peloLungo;
    }
    /*
     * Il metodo hasPeloLungo verifica il valore passato al costruttore e ritorna "corto" o "lungo"
     * per una più leggibile descrizione all'interno del metodo toString
     */
    public String hasPeloLungo() {
        if (isPeloLungo()) {
            return "Lungo";
        } else return "Corto";
    }

    /*
     * Ritorna il movimento dell'animale in base alla sua classe
     */
    public abstract String muovi();

    /*
     * Ritorna il verso dell'animale in base alla sua classe
     */
    protected abstract String verso();

    public String toString() {      // Stampa i dettagli
        return "\n\t Nome: " + getNome() +
                "\n\t Razza: " + getRazza() +
                "%n\t Peso: %,.2f %s".formatted(getPeso(), "Kg")+
                "\n\t Pelo: " + hasPeloLungo();
    }

    /*
     * Verifica se due oggetti sono effettivamente uguali
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Animale)) {
            return false;
        }
        Animale temp = (Animale) o;

        return this.getClass() == temp.getClass() && this.getNome() == temp.getNome() && this.getRazza() == temp.getRazza() && this.getPeso() == temp.getPeso() && this.isPeloLungo() == temp.isPeloLungo;
    }
}

    /*
     * La classe Cane estende la classe Animali, resa final poiché non ha ulteriori classi che la ereditano
     */
final class Cane extends Animale{
    private final double pesoDefaultCane = 3, pesoMinimoCane = 3;       // Valori predefiniti per il peso minimo ed il peso da inserire come valore di default in caso venga inserito un parametro errato

    private boolean isPedigree;     // Pedigree del cane: True se presente, False se assente

    /*
     * Di seguito metodi getter and setter per gli attributi della classe
     */
    public boolean isPedigree() {
        return isPedigree;
    }

    public void setPedigree(boolean pedigree) {
        isPedigree = pedigree;
    }

    /*
     * Il metodo hasPedigree verifica il valore passato al costruttore e ritorna "si" o "no"
     * per una più leggibile descrizione all'interno del metodo toString
     */
    public String hasPedigree(){
        if (isPedigree()){
            return "Si";
        }
        else return "No";
    }

    /*
     * Costruttore della classe Cane, implementa la verifica del peso prima della sua assegnazione
     */
    protected Cane(String nome, String razza, double peso, boolean isPeloLungo, boolean isPedigree) {
        super(nome, razza, peso, isPeloLungo);
        setPedigree(isPedigree);
        System.out.println("Un nuovo cane \u00E8 stato creato");
    }

    /*
     * Ridefinizione del metodo setPeso() incluso in Animale, in modo da verificare il parametro peso passato
     * in ingresso e settarlo ad un valore di default qualora sia stato inserito un valore non valido
     */
    @Override
    public void setPeso(double peso) {
        this.peso = (peso < pesoMinimoCane) ? pesoDefaultCane : peso; // Verifica il peso dell'animale ed assegna il corretto valore (Shorthand IF)
    }

    /*
     * Ridefinizione del metodo muovi() incluso in Animale, ritorna il movimento dell'animale
     */
    @Override
    public String muovi(){
        return "Il cane cammina";
    }

    /*
     * Ridefinizione del metodo verso() incluso in Animale, ritorna il verso dell'animale
     */
    @Override
    protected String verso() {
        return "Bau";
    }

    /*
     * Ridefinizione del metodo toString() incluso in Animale con implementazione degli attributi propri della classe
     */
    @Override
    public String toString() {
        return  "\n\t Tipo: " + getClass().getSimpleName() +
                super.toString() +
                "\n\t Pedigree: " + hasPedigree() +
                "\n\t Verso: "+ this.verso();
    }
}

    /*
     * La classe Gatto estende la classe Animali, resa final poiché non ha ulteriori classi che la ereditano
     */
final class Gatto extends Animale{
    private final double pesoDefaultGatto = 3, pesoMinimoGatto = 0.5; // Valori predefiniti per il peso minimo ed il peso da inserire come valore di default in caso venga inserito un parametro errato

    private String carattere;       // Carattere del gatto: Es.: Socievole, indipendente

    /*
     * Di seguito metodi getter and setter per gli attributi della classe
     */
    public String getCarattere() {
        return carattere;
    }

    public void setCarattere(String carattere) {
        this.carattere = carattere;
    }

    /*
     * Costruttore della classe Cane, implementa la verifica del peso prima della sua assegnazione
     */
    protected Gatto(String nome, String razza, double peso, boolean isPeloLungo, String carattere) {
        super(nome, razza, peso, isPeloLungo);
        setCarattere(carattere);
        System.out.println("Un nuovo gatto \u00E8 stato creato");
    }

    /*
     * Ridefinizione del metodo setPeso() incluso in Animale, in modo da verificare il parametro peso passato
     * in ingresso e settarlo ad un valore di default qualora sia stato inserito un valore non valido
     */
    @Override
    public void setPeso(double peso) {
        this.peso = (peso < pesoMinimoGatto) ? pesoDefaultGatto : peso;     // Verifica il peso dell'animale ed assegna il corretto valore (Shorthand IF)
    }

    /*
     * Ridefinizione del metodo muovi() incluso in Animale, ritorna il movimento dell'animale
     */
    @Override
    public String muovi() {
        return "Il gatto si struscia";
    }

    /*
     * Ridefinizione del metodo verso() incluso in Animale, ritorna il verso dell'animale
     */
    @Override
    protected String verso() {
        return "Miao";
    }

    /*
     * Ridefinizione del metodo toString() incluso in Animale con implementazione degli attributi propri della classe
     */
    @Override
    public String toString() {
        return  "\n\t Tipo: " + getClass().getSimpleName() +
                super.toString() +
                "\n\t Carattere: " + getCarattere() +
                "\n\t Verso: "+ this.verso();

    }
}