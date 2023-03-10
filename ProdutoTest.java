package br.com.Produto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ProdutoTest {

	@Test
	void test() {
		Produto produto = new Produto();
		assertEquals(1, produto.teste());
	}
}
