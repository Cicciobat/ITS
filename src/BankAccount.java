/*
 * Copyright (c) 2023. Ciccio Battaglia
 * All rights reserved.
 *
 */

import javax.swing.*;
import java.util.Scanner;

public class BankAccount {
    private double balance;
    long ID;
    String firstName;
    String lastName;

    public BankAccount(long ID, String firstName, String lastName, double balance){
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }

    public void Whitdraw(double whitdraw){
        this.balance -= whitdraw;
    }

    public void Deposit(double deposit){
        this.balance += deposit;
    }

    public static void bankTransfer(BankAccount user, BankAccount user1, double transfer){
        user1.Deposit(transfer);
        user.Whitdraw(transfer);
    }

    public String toString(){
        System.out.println("Conto" + "Nome" + "Cognome" + "Saldo");
        return String.format("%4d" + "%20s" + "%20s" + "%20d", this.ID + this.firstName, this.lastName, this.getBalance());

        //return  String.format("%20CConto" + "Nome " + "Cognome " + "Saldo\n" + this.ID + this.firstName + this.lastName + this.getBalance() + "\n");
    }

    public static void main(String[] args) {
        double vers, prel, trasf;

        BankAccount newUser = new BankAccount(0, "Ciccio", "Battaglia", 1000);
        Scanner sc = new Scanner(System.in);
        BankAccount newUser1 = new BankAccount(1, "Mario", "Rossi", 1000);

        System.out.println("Quanto vuoi versare?");
        vers = sc.nextDouble();

        newUser.Deposit(vers);

        System.out.println("Quanto vuoi prelevare?");
        prel = sc.nextDouble();

        newUser.Whitdraw(prel);

        System.out.format(String.valueOf(newUser));

        System.out.format(String.valueOf(newUser1));
        System.out.println();

        System.out.println("Da quanto vuoi effettuare il bonifico?");
        trasf = sc.nextDouble();

        bankTransfer(newUser, newUser1, trasf);

        System.out.println(newUser);
        System.out.println();

        System.out.println(newUser1);

    }
}