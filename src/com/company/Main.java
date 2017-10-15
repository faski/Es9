package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        int a = Integer.parseInt(JOptionPane.showInputDialog("Inserisci un numero intero:"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Inserisci un numero intero:"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Inserisci un numero intero:"));

        int max;

        if (a > b && a > c ) {
            max = a;
        } else {
            if (b > c) {
                max = b;
            } else {
                max = c;
            }

        }


        JOptionPane.showMessageDialog(null, "Il massimo è: " + max);

    }
}


