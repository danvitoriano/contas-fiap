package main;

import contas.Conta;

public class TestaConta {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);
		System.out.println(conta.getSaldo());
	}
}
