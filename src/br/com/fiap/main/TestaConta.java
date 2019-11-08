package br.com.fiap.main;

import br.com.fiap.modelo.ContaCorrente;
import br.com.fiap.modelo.Tributavel;

public class TestaConta {
	public static void main(String[] args) {
		ContaCorrente c1 = new ContaCorrente();
		c1.deposita(100);
		
		ContaCorrente c2 = new ContaCorrente();
		c2.deposita(200);
		
		c2.transfere(100, c1);
		c2.saca(1);
		c2.saca(400);
		
		
		System.out.println(c1.getSaldo());
		System.out.println(c2.getSaldo());
		
		System.out.println(c1.getValorImposto());

        // testando polimorfismo:
        Tributavel t = c1;
        System.out.println(t.getValorImposto());
	}
}
