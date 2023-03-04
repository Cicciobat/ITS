/*
 * Copyright (c) 2023. Ciccio Battaglia
 * All rights reserved.
 *
 */

public class LogicalTable {
        public static void main(String[] args) {
            boolean p, q;

            System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

            p = true;
            q = true;

            System.out.print(p + "\t" + q + "\t" + (p&q) + "\t" + (p|q) + "\t" + (p^q) + "\t" + !p + "\n");

            p = true;
            q = false;

            System.out.print(p + "\t" + q + "\t" + (p&q) + "\t" + (p|q) + "\t" + (p^q) + "\t" + !p + "\n");

            p = false;
            q = true;

            System.out.print(p + "\t" + q + "\t" + (p&q) + "\t" + (p|q) + "\t" + (p^q) + "\t" + !p + "\n");

            p = false;
            q = false;

            System.out.print(p + "\t" + q + "\t" + (p&q) + "\t" + (p|q) + "\t" + (p^q) + "\t" + !p + "\n");
        }
    }
