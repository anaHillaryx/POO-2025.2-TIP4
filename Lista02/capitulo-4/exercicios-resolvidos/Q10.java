package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int d1, m1, a1, d2, m2, a2;
        System.out.println("Digite a primeira data:");
        System.out.println("dia: ");
        d1 = sc.nextInt();
        System.out.println("mes: ");
        m1 = sc.nextInt();   
        System.out.println("ano: ");
        a1 = sc.nextInt();

        System.out.println("Digite a segunda data:");
        System.out.println("dia: ");
        d2 = sc.nextInt();
        System.out.println("mes: ");
        m2 = sc.nextInt();   
        System.out.println("ano: ");
        a2 = sc.nextInt();
        
        if (a1 > a2) {
        System.out.printf("A maior data é: " + d1 + "-" + m1 + "-" + a1);
        }
        else if  (a2 > a1) {
            System.out.printf("A maior data é: " + d2 + "-" + m2 + "-" + a2);
        }
            else if (m1 > m2) {
            System.out.printf("A maior data é: " + d1 + "-" + m1 + "-" + a1);
        }
            else if  (m2 > m1) {
            System.out.printf("A maior data é: " + d2 + "-" + m2 + "-" + a2);
        }
            else if (d1 > d2) {
                System.out.printf("A maior data é: " + d1 + "-" + m1 + "-" + a1);
        }
                else if  (d2 > d1) {
                    System.out.printf("A maior data é: " + d2 + "-" + m2 + "-" + a2);
        }
                    else {
                        System.out.println("As datas são iguais!");
                    }
        sc.close();
        }
        }