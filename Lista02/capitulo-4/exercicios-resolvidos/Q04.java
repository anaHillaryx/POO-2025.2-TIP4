package br.edu.principal;

public class Principal {
	    public static void main(String[] args) {
	        int i = 0;
	        int resultado = 1;

	        do {
	            if (i == 0) {
	                resultado = 1; // 2^0 = 1
	            } else {
	                resultado *= 2; // Multiplica pelo anterior para obter 2^i
	            }
	            
	            System.out.println("2^" + i + " = " + resultado);
	            i++;
	        } while (i <= 10);
	    }
	}

