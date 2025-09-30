package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int op ;
        double in,preços;
        double receita,lucro;
        in = 120 ;
        preços  = 5 ; 
        
       
		while (preços > 0  ) {
			receita = preços * in;
			lucro = receita - 200;
			
			
            System.out.println("preço dos ingresos " + preços  + " ingreços vendidos " + in + " :");
            System.out.println("receita foi de " + receita + " :" );
            System.out.println("lucro foi de " + lucro + " :" );
            System.out.println("-------------------------------------------------------------------------- " );

		
			preços -= 0.50;
			in += 26 ;
						
		}

	}

}
