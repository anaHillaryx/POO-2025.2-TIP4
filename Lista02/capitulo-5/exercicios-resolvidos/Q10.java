package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        float n1, n2, media, media_classe, Total_classe = 0;
		int cont, ta = 0, te = 0, tr = 0;

		for(cont = 1; cont <= 6; cont++) {
			 System.out.println("Digite sua primeira nota: ");
			 n1=sc.nextFloat();
			 System.out.println("Digite sua segunda nota: ");
			 n2=sc.nextFloat();
			 media = (n1 + n2) / 2;
			 System.out.println("média: " + media);
			 
			 if(media <= 3) {
				 tr = tr + 1;
				 System.out.println("reprovado");
			 }
			 else if(media > 3 && media < 7) {
				 te = te + 1;
				 System.out.println("Exame");
			 }
			 else if(media >= 7) {
				 ta = ta + 1 ;
				 System.out.println("aprovado");
			 }
			 Total_classe = Total_classe + media;
			 
		}
		
		 System.out.println("total de alunos que estão reprovados: "+tr);
		 System.out.println("total de alunos para o exame: "+ te);
		 System.out.println("total de alunos aprovados: "+ ta);
		 media_classe = Total_classe / 6;
		 System.out.println("média da classe: " + media_classe);
		
	}
	
}