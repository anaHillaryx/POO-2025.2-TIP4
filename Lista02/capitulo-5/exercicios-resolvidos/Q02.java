package br.edu.principal;
import java.util.Scanner;
public class Principal {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int[] numbers = new int[10];
	        int maiorNumero;


	        System.out.println("Digite 10 números inteiros:");
	        for (int i = 0; i < 10; i++) {
	            System.out.print("Número " + (i + 1) + ": ");
	            numbers[i] = scanner.nextInt();
	        }


	        maiorNumero = numbers[0]; 

	        for (int i = 1; i < numbers.length; i++) {
	            if (numbers[i] > maiorNumero) {
	                maiorNumero = numbers[i];
	            }
	        }


	        System.out.println("\nO número de maior valor digitado é: " + maiorNumero);
	        scanner.close();
	    }
	}

