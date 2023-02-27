package Concessionaria;

public abstract class Veicolo {
    protected String marca, modello;
    protected int anno_fabbricazione;
    protected double cilindrata, prezzo;
    private static int count;

    public Veicolo(String marca, String modello, int anno_fabbricazione, double cilindrata, double prezzo) {
        count++;
        this.marca = marca;
        this.modello = modello;
        this.anno_fabbricazione = anno_fabbricazione;
        this.cilindrata = cilindrata;
        this.prezzo = prezzo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public int getAnno_fabbricazione() {
        return anno_fabbricazione;
    }

    public void setAnno_fabbricazione(int anno_fabbricazione) {
        this.anno_fabbricazione = anno_fabbricazione;
    }

    public double getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(float cilindrata) {
        this.cilindrata = cilindrata;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    public abstract String getTipo();

    public double getPrezzoIVA() {
        return this.prezzo * 1.22;
    }

    public static int getNumeroVeicoli() {
        return count;
    }

    public String toString() {
        return  "\n\t Marca: " + getMarca() +
                "\n\t Modello: " + getModello() +
                "\n\t Anno di fabbricazione: " + getAnno_fabbricazione() +
                "\n\t Cilindrata: %.2f".formatted(getCilindrata()) + " cm\u00B3" +
                "\n\t Prezzo: %,.2f".formatted(getPrezzo()) + " \u20AC" +
                "\n\t Prezzo ivato: %,.2f".formatted(this.getPrezzoIVA()) + " \u20AC";
    }
}

class Auto extends Veicolo {
    private int numeroPorte;

    public Auto(String marca, String modello, int anno_fabbricazione, double cilindrata, double prezzo, int numeroPorte) {
        super(marca, modello, anno_fabbricazione, cilindrata, prezzo);
        this.numeroPorte = numeroPorte;
    }

    public void setNumeroPorte(int numeroPorte) {
        this.numeroPorte = numeroPorte;
    }

    public int getnumeroPorte() {
        return numeroPorte;
    }

    public double getPrezzoIVA(int quantita) {
        double prezzoScontato = super.getPrezzoIVA();

        for (int i = 0; i < quantita; i++) {
            double sconto = (prezzoScontato * 2) / 100;
            prezzoScontato -= sconto;
        } return prezzoScontato;
    }

    @Override
    public String getTipo() {
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return  "Categoria: " + getTipo() +
                super.toString() +
                "\n\t Porte: " + getnumeroPorte();
    }
}

class Moto extends Veicolo{
    private boolean sidecar;

    public Moto(String marca, String modello, int anno_fabbricazione, double cilindrata, double prezzo, boolean sidecar) {
        super(marca, modello, anno_fabbricazione, cilindrata, prezzo);
        this.sidecar = sidecar;
    }

    public void setSidecar(boolean sidecar) {
        this.sidecar = sidecar;
    }

    public boolean isSidecar() {
        return sidecar;
    }

    public String hasSidecar(){
        if(isSidecar()){
            return "Si";
        } else return "No";
    }

    @Override
    public double getPrezzoIVA() {
        double prezzoIvato = super.getPrezzoIVA();
        double sconto = (prezzoIvato * 5) / 100;

        if (isSidecar()){
            return prezzoIvato - sconto;
        }
        else return prezzoIvato;
    }

    @Override
    public String getTipo() {
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return  "Categoria: " + getTipo() +
                super.toString() +
                "\n\t Sidecar: " + hasSidecar();
    }
}


suca