package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número:");
        int num = sc.nextInt();

        verificarNumero(num);

        sc.close();
    }

    public static void verificarNumero(int num) {
        if (num > 0) {
            System.out.println("O número é positivo.");
        } else if (num < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }
    }
}
