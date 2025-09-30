package br.edu.principal;

public class Principal {

	    public static void main(String[] args) {
	    
	        double media = 85.5; 
	        int conceitoInt = (int) media / 10;
	        String conceito;

	        switch (conceitoInt) {
	            case 10:
	            case 9:
	                conceito = "A"; 
	                break;
	            case 8:
	                conceito = "B";
	                break;
	            case 7:
	                conceito = "C"; 
	                break;
	            case 6:
	                conceito = "D"; 
	                break;
	            default:
	                conceito = "F";
	        }

	        System.out.println("A média é: " + media);
	        System.out.println("O conceito é: " + conceito);
	    }
	}

