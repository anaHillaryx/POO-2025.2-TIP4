package br.edu.pricipal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);


		int pessoas= 1 ;
		
		int faixa1 = 0;
		int faixa2 = 0; 
		int faixa3 = 0; 
		int faixa4 = 0; 
		int faixa5 = 0; 

		
		while (pessoas <=8 ) {
			
	        System.out.println("digite a idade da primeira pessoa  " +  pessoas + " :");
	    int	idade  = sc.nextInt();
	        if (idade <= 15) {
	            faixa1 = faixa1 + 1;
	        } else if (idade <= 30) {
	            faixa2 = faixa2 + 1;
	        } else if (idade <= 45) {
	            faixa3 = faixa3 + 1;
	        } else if (idade <= 60) {
	            faixa4 = faixa4 + 1;
	        } else {
	            faixa5 = faixa5 + 1;
	        }
	        pessoas +=1;	
		}
		
		double porcetagem ;
		
		int totalFaixa = 8 ;
		
		double porcFaixa1 = (faixa1 * 100.0) / totalFaixa;
		double porcFaixa5 = (faixa5 * 100.0) / totalFaixa;
		
		System.out.println("Quantidade em cada faixa:");
		System.out.println("1ª faixa: " + faixa1);
		System.out.println("2ª faixa: " + faixa2);
		System.out.println("3ª faixa: " + faixa3);
		System.out.println("4ª faixa: " + faixa4);
		System.out.println("5ª faixa: " + faixa5);

		System.out.println("Porcentagem da 1ª faixa: " + porcFaixa1 + "%");
		System.out.println("Porcentagem da 5ª faixa: " + porcFaixa5 + "%");
		

	}

}
