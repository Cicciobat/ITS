public class Rettangolo {
    public static int base = 10, altezza = 5, area, perimetro;

    public static void main(String[] args) {
        perimetro = (base + altezza) * 2;
        area = base * altezza;

        System.out.println("Il perimetro del rettangolo avente base 10 ed altezza 5 e': " + perimetro);
        System.out.println("L'area del rettangolo avente base 10 ed altezza 5 e': " + area);

    }
}