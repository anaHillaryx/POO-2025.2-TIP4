package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double nota1 , nota2 ,nota3 , nota4,media ;
		
		System.out.println("=========== CALCULO MEDIA IFCE ============= ");
		System.out.println("digite sua primeira nota : ");
		nota1  = sc.nextDouble();
		System.out.println("digite sua segunda nota : ");
		nota2  = sc.nextDouble();
		System.out.println("digite sua terceira nota : ");
		nota3  = sc.nextDouble();
		System.out.println("digite sua quarta nota : ");
		nota4  = sc.nextDouble();
		
		media = (nota1 + nota2 + nota3 + nota4 ) / 4 ;
		
		if (media >= 7 ) {
			System.out.println("voce foi aprovado direto parabens! : ");
			System.out.println("sua media foi  : " + media );
		}else if (media >=3 & media <=7 ) {
			System.out.println("voce ficou de recuperação que pena !, mais não desista tem como recuperar : ");
			System.out.println("sua media foi  : " + media );
		}else {
			System.out.println("voce reprovou direto que pena tente novamente no prximo semestre   : ");
			System.out.println("sua media foi  : " + media );
		}
	}
}
