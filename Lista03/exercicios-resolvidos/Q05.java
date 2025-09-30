package br.edu.principal;

public class Principal {
	class Conta {
	    private double saldo; // private
	    public String titular; // public

	    public Conta(String titular, double saldo) {
	        this.titular = titular;
	        this.saldo = saldo;
	    }

	    protected void depositar(double valor) {
	        saldo += valor;
	    }

	    public void mostrarSaldo() {
	        System.out.println("Titular: " + titular + ", Saldo: " + saldo);
	    }
	}

	public class TestaConta {
	    public static void main(String[] args) {
	        Conta c1 = new Conta("Maria", 1000);
	        c1.depositar(500);
	        c1.mostrarSaldo();
	    }
	}
}
