package br.edu.principal;

import java.util.Scanner;

public class Princpal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		double A, B, C;
		System.out.print("Digite um valor para A: ");
		A = sc.nextDouble();
		System.out.print("Digite um valor para B: ");
		B = sc.nextDouble();
		System.out.print("Digite um valor para C: ");
		C = sc.nextDouble();
		System.out.print("Digite um valor para i (1, 2 ou 3): ");
		i = sc.nextInt();
	    if (i == 1) { 
		    if ((A < B) && (A < C)) {
			if (B < C) {
                System.out.println("A ordem crescente dos número é: "+ A + " - " + B + " - " + C );
			    }
			    else
                {
                System.out.println("A ordem crescente dos números é: "+ A + " - " + C + " - " + B );
			    }
            }
		
		    if ((B < A) && (B < C)) {
			
			if (A < C) {
				System.out.println("A ordem crescente dos números é: "+ B + " - " + A + " - " + C );
			    }
			    else {
				System.out.println("A ordem crescente dos números é: "+ B + " - " + C + " - " + A );
			    }
			
		}
        
		    if ((C < A) && (C < B)) {
		    if (A < B) {
				System.out.println("A ordem crescente dos números é: "+ C + " - " + A + " - " + B );
			    }
			    else {
				System.out.println("A ordem crescente dos números é: "+ C + " - " + B + " - " + A );
			    }
		}
        }
        
        if (i == 2) {
            if ((A > B) && (A > C)) {
            if (B > C) {
                System.out.println("A ordem decrescente dos números é: "+ A + " - " + B + " - " + C );
            }

            else {
                System.out.println("A ordem decrescente dos números é: "+ A + " - " + C + " - " + B );
            }
            }
        

            if ((B > A) && (B > C)) {
			
			if (A > C) {
				System.out.println("A ordem decrescente dos números é: "+ B + " - " + A + " - " + C );
			    }
			    else {
				System.out.println("A ordem decrescente dos números é: "+ B + " - " + C + " - " + A );
			    }
			
		}
            if ((C > A) && (C > B)) {
		    if (A > B) {
				System.out.println("A ordem decrescente dos números é: "+ C + " - " + A + " - " + B );
			    }
			    else {
				System.out.println("A ordem decrescente dos números é: "+ C + " - " + B + " - " + A );
			    }
		}
        }

        if (i == 3) {
            if (( A > B ) && (A > C)) {
                System.out.println("A ordem desejada é: " + B + " - " + A + " - " + C);
            }
            if ((B > A) && (B > C)) {
                System.out.println("A ordem desejada é: " + A + " - " + B + " - " + C);
            }
            if ((C > A) && (C > B)) {
                System.out.println("A ordem desejada é: " + A + " - " + C + " - " + B);   
            } 
        }
        sc.close();
    }
}
