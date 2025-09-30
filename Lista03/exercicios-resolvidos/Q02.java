package br.edu.principal;

public class Principal {

	    public static void main(String[] args) {
	        // 1. Criação do objeto StudentRecord
	        StudentRecord student1 = new StudentRecord("João da Silva");
	        
	        // 2. Chamada do método modificador para 'age'
	        student1.setAge(25); 
	        
	        // 3. Impressão do valor de 'age' usando o método acessor
	        System.out.println("Nome: " + student1.getName());
	        System.out.println("Idade (age): " + student1.getAge());
	    }
	}

