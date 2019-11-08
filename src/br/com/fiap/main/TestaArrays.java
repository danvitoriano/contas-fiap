package br.com.fiap.main;

import br.com.fiap.modelo.Conta;
import br.com.fiap.modelo.ContaCorrente;

public class TestaArrays {
	
	public static void main(String[] args) {
		
		 Conta[] contas = new Conta[10];

		 for (int i = 1; i < contas.length; i++) {
		   Conta conta = new ContaCorrente();
		   conta.setTitular("Bia");
		   conta.setNumero(123);
		   conta.setAgencia("Itaim");
		   conta.deposita(i * 100.0);
		   contas[i] = conta;
		   System.out.println(contas[i].getSaldo());
		 }
		 
		 System.out.println("conta 2 :" + contas[2].getSaldo());
	}

}
