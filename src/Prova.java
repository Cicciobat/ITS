public class Prova {
    String nome;
    String cognome;
    int eta;
    public void getAll(String nome,String cognome,int eta){ //
        this.nome = nome; //prendi questo nome e assegnalo al valore del parametro
        this.cognome = cognome;
        this.eta = eta;
    }

    public void checkAge(int eta) {
        this.eta = eta;

        if (eta < 18) {
            System.out.println("Non puoi procedere.");
        }
    }
    public static void main(String[] args) {

        Prova persona1 = new Prova();
        persona1.getAll("Mirko", "Pigliacelli", 17); //chiamata al metodo con attributi di persona1
        persona1.checkAge(persona1.eta);


    }

}
