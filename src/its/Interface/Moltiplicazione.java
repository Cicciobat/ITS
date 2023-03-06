/*
 * Copyright (c) 2023. Ciccio Battaglia
 * All rights reserved.
 *
 */

package its.Interface;

public class Moltiplicazione extends Funzionalita implements Operazione{
    private double num1, num2;

    public Moltiplicazione(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public double operazione() {
        return this.num1 * this.num2;
    }

    @Override
    public void StampaVideo() {
        System.out.println(operazione());
    }

    public static void main(String[] args) {
        Moltiplicazione moltiplicazione = new Moltiplicazione(4, 6);
        moltiplicazione.StampaVideo();
    }
}
