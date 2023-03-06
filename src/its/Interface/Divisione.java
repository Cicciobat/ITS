/*
 * Copyright (c) 2023. Ciccio Battaglia
 * All rights reserved.
 *
 */

package its.Interface;

public class Divisione extends Funzionalita implements Operazione{
    private double num1, num2;

    protected Divisione(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public double operazione() {
        return this.num1 / this.num2;
    }

    @Override
    public void StampaVideo() {
        System.out.println(operazione());
    }

    public static void main(String[] args) {
        Divisione divisione = new Divisione(4, 6);
        divisione.StampaVideo();
    }
}
