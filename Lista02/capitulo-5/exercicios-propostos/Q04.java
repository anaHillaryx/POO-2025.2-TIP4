package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num,res ;
        System.out.println("digite o numero  :" );
        num = sc.nextInt();
        int mutiplicador = 0 ;

        while (num >= 0  & mutiplicador <= 10) {
        	res = num * mutiplicador;
            System.out.println( +num + " x " + mutiplicador  + " = " + res );        	
        	mutiplicador +=1;

        }

	}

}
