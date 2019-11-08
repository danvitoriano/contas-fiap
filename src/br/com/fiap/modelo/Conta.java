package br.com.fiap.modelo;

public abstract class Conta implements Tributavel {
	protected double saldo;
	private String titular;
	private int numero;
	private String agencia;
	
	public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        Conta outraConta = (Conta) obj;

        return this.numero == outraConta.numero && 
            this.agencia.equals(outraConta.agencia);
    }
	
	public String toString() {
        return "[titular=" + titular + ", numero=" + numero
           + ", agencia=" + agencia + "]";
    }
	
	public double getValorImposto() {
        return this.getSaldo() * 0.01;
    }

	public abstract String getTipo();

	public void transfere(double valor, Conta conta) {
		this.saca(valor);
		conta.deposita(valor);
	}

	 public void deposita(double valor) {
	     if (valor < 0) {
	         throw new IllegalArgumentException("Você tentou depositar" + 
	                                             " um valor negativo");
	     } else {
	         this.saldo += valor;        
	     }        
	 }
	 
	public void saca(double valor) {
		this.saldo -= valor;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

}