package br.edu.principal;
import java.util.Scanner;
public class Principal {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Digite um número para ver a tabuada: ");
	        int n = sc.nextInt();

	        for (int i = 1; i <= 10; i++) {
	            System.out.println(n + " x " + i + " = " + (n * i));
	        }
	        sc.close();
	    }
	}

