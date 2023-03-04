/*
 * Copyright (c) 2023. Ciccio Battaglia
 * All rights reserved.
 *
 */

package Geometria.FigurePiane;

public final class Cerchio {
    private int raggio;
    static final double PI_GRECO = 3.1415;

    public Cerchio(int raggio){
        this.raggio = raggio;
    }

    public double calcolaArea (){
        double area;

        area = PI_GRECO * (raggio * raggio);

        return area;
    }
}

