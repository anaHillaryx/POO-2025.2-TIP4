package br.edu.principal;

public class Principal {

	    public static void main(String[] args) {
	        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};


	        System.out.println("--- Usando WHILE ---");
	        int i = 0;
	        while (i < days.length) {
	            System.out.println(days[i]);
	            i++;
	        }


	        System.out.println("\n--- Usando DO-WHILE ---");
	        int j = 0;
	        if (days.length > 0) {
	            do {
	                System.out.println(days[j]);
	                j++;
	            } while (j < days.length);
	        }

	        System.out.println("\n--- Usando FOR ---");
	        for (int k = 0; k < days.length; k++) {
	            System.out.println(days[k]);
	        }
	    }
	}

