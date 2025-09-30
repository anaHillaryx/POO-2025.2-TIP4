package br.edu.principal;
import java.util.Scanner;
public class Principal {



	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int[] valores = new int[5];
	        int soma = 0;

	        for (int i = 0; i < valores.length; i++) {
	            System.out.print("Digite o valor " + (i+1) + ": ");
	            valores[i] = sc.nextInt();
	            soma += valores[i];
	        }

	        double media = (double)soma / valores.length;
	        System.out.println("Média: " + media);
	        sc.close();
	    }
	}

