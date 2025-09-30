package br.edu.principal;

public class Principal {

	    public static void main(String[] args) {
	        String[][] entry = {
	            {"Florence", "735-1234", "Manila"}, 
	            {"Jake", "921-1234", "Singapore"}, 
	            {"Nino", "735-4321", "Manila"}
	        };

	        System.out.println("Nome\t\tTelefone\tCidade");
	        System.out.println("----------------------------------------");
	        

	        for (int i = 0; i < entry.length; i++) {

	            for (int j = 0; j < entry[i].length; j++) {
	                System.out.print(entry[i][j] + "\t\t");
	            }
	
	            System.out.println(); 
	        }
	    }
	}

