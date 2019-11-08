package br.com.fiap.main;

import br.com.fiap.modelo.ContaCorrente;

public class TestaConta {
	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente();
		conta.deposita(100);
		System.out.println(conta.getSaldo());
	}
}
