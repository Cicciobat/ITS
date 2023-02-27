package Concessionaria;

public class Main {
    public static void main(String[] args) {
        Auto porsche = new Auto("Porsche", "Carrera", 1990, 2500, 75_000, 2);
        Auto audi = new Auto("Audi", "TT", 1998, 1900.00, 50_000.50, 5);

        Moto BMW = new Moto("BMW", "GS", 2008, 1200, 22_000, false);

        System.out.println(audi);

        System.out.println();

        System.out.println(BMW);

        System.out.println(Veicolo.getNumeroVeicoli());
    }
}
