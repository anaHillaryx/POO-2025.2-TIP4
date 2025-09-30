package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o raio da esfera:");
        double r = sc.nextDouble();

        double volume = volumeEsfera(r);
        System.out.println("Volume da esfera: " + volume);

 
    }

    public static double volumeEsfera(double raio) {
        return (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
    }
	}


