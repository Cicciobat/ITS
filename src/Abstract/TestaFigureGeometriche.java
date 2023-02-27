package Abstract;

public class TestaFigureGeometriche {
    public static void main(String[] args) {

        Cerchio c = new Cerchio(5);
        System.out.println("L'area del Cerchio e': " + c.area());
        System.out.println("Il diametro del Cerchio e': " + c.perimetro());
        System.out.println(c.TipoFigura() + "\n");

        Quadrato q = new Quadrato(5);
        System.out.println("L'area del Quadrato e': " + q.area());
        System.out.println("Il perimetro del Quadrato e': " + q.perimetro());
        System.out.println(q.TipoFigura() + "\n");

        Rettangolo r = new Rettangolo(5, 6);
        System.out.println("L'area del Rettangolo e': " + r.area());
        System.out.println("Il perimetro del Rettangolo e': " + r.perimetro());
        System.out.println(r.TipoFigura());
    }
}
