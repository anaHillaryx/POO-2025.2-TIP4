package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner sc = new Scanner(System.in);
        int grupos = 1;

        while (grupos <= 5) {
            int a, b, c, d;

            System.out.println("Digite 4 valores do grupo " + grupos + ":");
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            d = sc.nextInt();


            System.out.println("Ordem lida: " + a + " " + b + " " + c + " " + d);

 
            if (a > b) { int t = a; a = b; b = t; }
            if (b > c) { int t = b; b = c; c = t; }
            if (c > d) { int t = c; c = d; d = t; }

            if (a > b) { int t = a; a = b; b = t; }
            if (b > c) { int t = b; b = c; c = t; }
            if (c > d) { int t = c; c = d; d = t; }

            System.out.println("Ordem crescente: " + a + " " + b + " " + c + " " + d);

  
            System.out.println("Ordem decrescente: " + d + " " + c + " " + b + " " + a);

            System.out.println(); 
            grupos++;
	}	
}
}
