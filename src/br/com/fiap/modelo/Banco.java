package br.com.fiap.modelo;

public class Banco {
	   private String nome;
	   private int numero;
	   private Conta[] contas;

	public void adiciona(Conta c) {
		for (int i = 0; i < this.contas.length; i++) {
			this.contas[i] = c;
		}
	}
	
	public void mostraContas() {
		   for (int i = 0; i < this.contas.length; i++) {
		       System.out.println("Conta na posição " + i + ": " + this.contas[i].getTitular());
		   }
		}

	public Banco(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
		this.contas = new ContaCorrente[10];
	}

	public String getNome() {
		return nome;
	}

	public int getNumero() {
		return numero;
	}


	}