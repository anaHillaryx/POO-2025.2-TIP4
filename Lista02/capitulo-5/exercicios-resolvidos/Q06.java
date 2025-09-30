package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String turno, categoria;
		Double salMin, sal_inicial, aux, sal_final, nht, valor;
		int cont, codigo; 
		
		salMin = 450.0;
		cont = 1;
		
		while (cont <= 10) {
			
			System.out.print("Digite o seu código de funcionário: ");
			codigo = sc.nextInt();
			
			System.out.print("Digite o número de horas trabalhadas: ");
			nht = sc.nextDouble();
			
			while (true){
				
			System.out.print("Digite o seu turno [M (Matutino) / V (Vespertino)/ N (Noturno) ]: ");
			turno = sc.next();
			
			if (turno.equals("M") || turno.equals("V") || turno.equals("N")) { 
				
				break;
			}
			
			else {
				System.out.println("Ocorreu um erro. Tente novamente!");
			}
			
			}
			
			while (true){
				
			System.out.print("Digite a sua categoria [G (Gerente) | O (Operário) ]: ");
			categoria = sc.next();
			
			if (categoria.equals("G") | categoria.equals("O")) {
				break;
			}
			
			else {
				System.out.print("Ocorreu um erro! Tente novamente!");
			}
			
			
			}
			
			
			
			if (categoria.equals("G")){
				
				if (turno.equals("N")) {
					valor = salMin * 0.18;
				}
				
				else {
					valor = salMin * 0.15;
				}
			}
			
			else {
				if(turno.equals("N")) {
					valor = salMin * 0.13;
				}
				
				else {
					valor = salMin * 0.10;
				}
			}
			
			
			
			sal_inicial = nht * valor;
			
			
			if (sal_inicial <= 300) {
				aux = sal_inicial * 0.20;
			}
			
			else if (sal_inicial < 600) {
				aux = sal_inicial * 0.15;
			}
			
			else {
				aux = sal_inicial * 0.05;
			}
			
			sal_final = sal_inicial + aux;
			
			System.out.println("Trabalhador:"  + codigo );
            System.out.println("Número de horas trabalhadas:" + nht);
            System.out.println("Valor da hora: R$ " + valor);
            System.out.println("Salário Inicial: " + sal_inicial);
			System.out.println("Auxílio Alimentação: " + aux );
            System.out.println("Salário Final: " + sal_final );
			cont = cont + 1;
		}
		

	}
}