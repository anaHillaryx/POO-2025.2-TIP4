package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hora_i, min_i, hora_f, min_f, minutos;
		
		System.out.println("Digite a hora de inicio: ");
		hora_i = sc.nextInt();
		System.out.println("Digite os minutos  de inicio: ");
		min_i = sc.nextInt();
		System.out.println("Digite a hora final: ");
		hora_f = sc.nextInt();
		System.out.println("Digite os minutos finais: ");
		min_f = sc.nextInt();
		
		minutos = calculo(hora_i, min_i, hora_f, min_f);
		System.out.println("a duração do tempo em minutos: " + minutos);
		
	}
   public static int calculo(int hi, int mi, int hf, int mf) {
	   int total_h, total_m, total;
	   
	   if (mf < mi) {
		   mf = mf + 60;
		   hf = hf - 1;
	   }
       else if (hf < hi) {
		   hf = hf + 24;
	   }
	   
	   total_m = mf - mi;
	   total_h = hf - hi;
	   total = total_h * 60 + total_m;
	   
	   return total;
   }
   
   
}