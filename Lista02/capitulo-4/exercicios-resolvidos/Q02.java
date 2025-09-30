package br.edu.princpal;
import java.util.Scanner;
public class principal {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite um número entre 0 e 9: ");
	        int numero = scanner.nextInt();
	        String extenso;

	        switch (numero) {
	            case 0:
	                extenso = "Zero";
	                break;
	            case 1:
	                extenso = "Um";
	                break;
	            case 2:
	                extenso = "Dois";
	                break;
	            case 3:
	                extenso = "Três";
	                break;
	            case 4:
	                extenso = "Quatro";
	                break;
	            case 5:
	                extenso = "Cinco";
	                break;
	            case 6:
	                extenso = "Seis";
	                break;
	            case 7:
	                extenso = "Sete";
	                break;
	            case 8:
	                extenso = "Oito";
	                break;
	            case 9:
	                extenso = "Nove";
	                break;
	            default:
	                extenso = "ERRO: Número fora do intervalo (0-9).";
	        }

	        System.out.println(extenso);
	        scanner.close();
	    }
	}

