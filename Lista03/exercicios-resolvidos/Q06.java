package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Digite um número de 1 a 9: ");
        num = sc.nextInt();

        if (num >= 1 && num <= 9) {

            tabelaMultiplicacao(num);

        } else {
            
            System.out.println("Ocorreu um erro. Tente novamente com um número de (1 a 9).");
        }
    }

    public static void tabelaMultiplicacao(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print((i * j) + " ");
            }
            System.out.println();
        }
        
    }
    
}
