package br.com.Produto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RetanguloTest {
	@Test
	void test() {
		Retangulo ret = new Retangulo();
		assertEquals(4, ret.calcArea(2, 2));
		assertEquals(4, ret.calcPerimetro(1, 1));
	}
	
	
}
