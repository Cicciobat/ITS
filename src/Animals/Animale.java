

package Animals;

public abstract class Animale {
    protected String nome, razza;
    protected double peso;
    protected boolean isPeloLungo;
    private static int numeroAnimali;

    protected Animale(String nome, String razza, double peso, boolean isPeloLungo) {
        this.nome = nome;
        this.razza = razza;
        if (Cane.class.equals(getClass())) {
            this.peso = (peso < 3) ? 3 : peso;
        }
        else if (Gatto.class.equals(getClass())) {
            this.peso = (peso < 0.5) ? 3 : peso;
        }
        this.isPeloLungo = isPeloLungo;
        numeroAnimali++;
    }

    protected abstract String verso();

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

    public String hasPeloLungo() {
        if (isPeloLungo()) {
            return "Lungo";
        } else return "Corto";
    }

    public void setPeloLungo(boolean peloLungo) {
        isPeloLungo = peloLungo;
    }

    public abstract String muovi();

    public String toString() {      // Stampa i dettagli
        return "\n\t Nome: " + getNome() +
                "\n\t Razza: " + getRazza() +
                "%n\t Peso: %,.2f".formatted(getPeso()) + " Kg" +
                "\n\t Pelo: " + hasPeloLungo();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Animale)) {
            return false;
        }
        Animale temp = (Animale) o;
        if (this.getClass() == temp.getClass() && this.getNome() == temp.getNome() && this.getRazza() == ((Animale) o).getRazza() && this.getPeso() == ((Animale) o).getPeso() && this.isPeloLungo() == ((Animale) o).isPeloLungo) {
            return true;
        }
        else return false;
    }
}

class Cane extends Animale{

    private boolean isPedigree;

    public boolean isPedigree() {
        return isPedigree;
    }

    public void setPedigree(boolean pedigree) {
        isPedigree = pedigree;
    }

    public String hasPedigree(){
        if (isPedigree()){
            return "Si";
        }
        else return "No";
    }

    protected Cane(String nome, String razza, double peso, boolean isPeloLungo, boolean isPedigree) {
        super(nome, razza, peso, isPeloLungo);
        this.isPedigree = isPedigree;
        System.out.println("Un nuovo cane \u00E8 stato creato");
    }

    public String muovi(){
        return "Il cane cammina";
    }

    @Override
    protected String verso() {
        return "Bau";
    }

    @Override
    public String toString() {
        return  "\n\t Tipo: " + getClass().getSimpleName() +
                super.toString() +
                "\n\t Pedigree: " + hasPedigree() +
                "\n\t Verso: "+ this.verso();
    }
}

class Gatto extends Animale{

    private String carattere;

    public String getCarattere() {
        return carattere;
    }

    public void setCarattere(String carattere) {
        this.carattere = carattere;
    }

    protected Gatto(String nome, String razza, double peso, boolean isPeloLungo, String carattere) {
        super(nome, razza, peso, isPeloLungo);
        this.carattere = carattere;
        System.out.println("Un nuovo gatto \u00E8 stato creato");
    }

    public String muovi() {
        return "Il gatto si struscia";
    }

    @Override
    protected String verso() {
        return "Miao";
    }

    @Override
    public String toString() {
        return  "\n\t Tipo: " + getClass().getSimpleName() +
                super.toString() +
                "\n\t Carattere: " + getCarattere() +
                "\n\t Verso: "+ this.verso();

    }
}