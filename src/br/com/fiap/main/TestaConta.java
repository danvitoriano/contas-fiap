package br.com.fiap.main;

import br.com.fiap.modelo.Conta;

public class TestaConta {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);
		System.out.println(conta.getSaldo());
	}
}
