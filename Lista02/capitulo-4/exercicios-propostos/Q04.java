package br.edu.principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Double num1 , num2,num3 ;
		
		System.out.println("digite seu primeiro numero  : ");

		num1  = sc.nextDouble();
		System.out.println("digite seu segundo numero : ");
		num2  = sc.nextDouble();
		System.out.println("digite seu terceiro numero  numero : ");
		num3  = sc.nextDouble();
		
		if (num1 > num2 & num1 > num3 ) {
			System.out.println("o numero maior é : " + num1);
			if (num2 > num3) {
				System.out.println("o segundo maior é  : " + num2);
				System.out.println("o numero menor é : " + num3);
			}else {
				System.out.println("o segundo maior é  : " + num3);
				System.out.println("o numero menor  é : " + num2);
			}
		}else if (num2 > num1 & num2 > num3) {
			System.out.println("o numero maior é : " + num2);
			if (num1 > num3) {
				System.out.println("o segundo maior é  : " + num1);
				System.out.println("o numero menor é : " + num3);
			}else {
				System.out.println("o segundo maior é  : " + num3);
				System.out.println("o numero menor  é : " + num1);
			}
		}else if (num3 > num1 & num3 > num2 ) {
			System.out.println("o numero maior é : " + num3);
			if (num1 > num2) {
				System.out.println("o segundo maior é  : " + num1);
				System.out.println("o numero menor é : " + num2);
			}else {
				System.out.println("o segundo maior é  : " + num2);
				System.out.println("o numero menor  é : " + num1);
			}
		}else {
			System.out.println("os tres numeros são iguais : " );

		}
	}

}
