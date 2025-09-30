package br.edu.principal;

public class Principal {
    public static void main(String[] args) {

        int numero = 1;

        while (numero <= 10) { 
            System.out.println("Tabuada do " + numero + ":");

            int i = 1;
            while (i <= 10) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
                i++;
            }

            System.out.println(); 
            numero++;
        }
    }
}

