/*
 * Copyright (c) 2023. Ciccio Battaglia
 * All rights reserved.
 *
 */

package Abstract;

public abstract class FormaGeometrica {
    protected abstract double perimetro();
    protected abstract double area();
    protected String TipoFigura(){
        return "Sono un " + getClass().getSimpleName();
    }
}


final class Quadrato extends FormaGeometrica {
    private int lato;

    public int getLato() {
        return lato;
    }

    public void setLato(int lato) {
        this.lato = lato;
    }

    public Quadrato(int lato) {
        this.lato = lato;
    }

    @Override
    public double perimetro() {
        return lato * 4;
    }

    @Override
    public double area() {
        return lato*lato;
    }
}


final class Cerchio extends FormaGeometrica {
    private int raggio;
    private final double PI_GRECO = 3.1415;

    public int getRaggio() {
        return raggio;
    }

    public void setRaggio(int raggio) {
        this.raggio = raggio;
    }

    public Cerchio(int raggio) {
            this.raggio = raggio;
    }

    @Override
    public double perimetro() {
        return 2 * PI_GRECO * raggio;
    }

    @Override
    public double area() {
        return PI_GRECO * (raggio * raggio);
    }
}


final class Rettangolo extends FormaGeometrica {
    private int base, altezza;

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltezza() {
        return altezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    public Rettangolo(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public double perimetro() {
        return (base * 2) + (altezza * 2);
    }

    @Override
    public double area() {
        return base * altezza;
    }
}