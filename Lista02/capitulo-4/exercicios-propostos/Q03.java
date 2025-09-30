package br.rdu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Double num1 , num2 ;
		System.out.println("digite seu primeiro numero  : ");

		num1  = sc.nextDouble();
		System.out.println("digite seu segundo numero : ");
		num2  = sc.nextDouble();
		
		if  (num1 > num2) {
			System.out.println("o numero maior é : " + num1);
			System.out.println("o numero menor é  : " + num2);

		}else if (num2 > num1) {
			System.out.println("o numero maior é  : " + num2);
			System.out.println("numero menor é : " + num1);
		}else {
			System.out.println("os dois são iguais : ");
		}



	}

}
