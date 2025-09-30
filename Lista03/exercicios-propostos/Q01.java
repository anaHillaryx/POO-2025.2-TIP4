package br.edu.principal;
import java.util.Scanner;
public class principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = sc.nextInt();


        int resultado = somaNumeros(numero);

        System.out.println("A soma de 1 até " + numero + " é: " + resultado);

        sc.close();
    }


    public static int somaNumeros(int N) {
        int soma = 0;
        int i = 1;
        while (i <= N) {
            soma = soma + i;
            i++;
        }
        return soma;
    }
}



