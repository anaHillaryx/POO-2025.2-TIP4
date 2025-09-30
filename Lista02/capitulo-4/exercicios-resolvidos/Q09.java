package br.edu.principal;

import java.util.Calendar;

public class Principal {

	public static void main(String[] args) {
		int  dia, mes, ano, hora, min;
        Calendar calendario = Calendar.getInstance();
        dia = calendario.get(Calendar.DAY_OF_MONTH);
        mes = calendario.get(Calendar.MONTH) + 1;
        ano = calendario.get(Calendar.YEAR);
         System.out.println("Data Atual: " + dia + "/" + mes + "/" + ano );
        
        if (mes == 1) {
            System.out.println("janeiro");
        } 
        if (mes == 2) {
            System.out.println("fevereiro");
        }
        if (mes == 3) {
            System.out.println("março");
        }
        if (mes == 4) {
            System.out.println("abril");
        }
        if (mes == 5) {
            System.out.println("maio");
        }
        if (mes == 6) {
            System.out.println("junho");
        }
        if (mes == 7) {
            System.out.println("julho");
        }
        if (mes == 8) {
            System.out.println("agosto");
        } 
        if (mes == 9) {
            System.out.println("setembro");
        } 
        if (mes == 10) {
            System.out.println("outubro");
        } 
        if (mes == 11) {
            System.out.println("novembro");
        } 
        if (mes == 12) {
            System.out.println("dezembro");
        }
    
           
            hora = calendario.get(Calendar.HOUR_OF_DAY);
            min = calendario.get(Calendar.MINUTE);

            
             System.out.println("Hora Atual: " + (hora < 10 ? "0" + hora : hora) + ":" + (min < 10 ? "0" + min : min));
            } 
    
}