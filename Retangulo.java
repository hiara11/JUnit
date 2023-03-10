package br.com.Produto;

public class Retangulo {
	public int base;
	public int altura;
	
	public int calcArea(int base,int altura) {
		return base*altura;
	}
	public int calcPerimetro(int base,int altura) {
		return (2*base)*(2*altura);
	}
}
