/*
 * Copyright (c) 2023. Ciccio Battaglia
 * All rights reserved.
 *
 */

package Geometria.FigurePiane;

public final class Quadrato {
    private int lato;

    public int getLato(){
        return lato;
    }

    public Quadrato(int lato){
        this.lato = lato;
    }
    public int calcolaArea(){
        int area;

        area = lato * lato;

        return area;
    }

    public int raddoppiaLato(){
        lato *= 2;
        return lato;
    }

}
