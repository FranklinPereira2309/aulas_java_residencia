package Classes;

public class Forma {
	protected double largura;
	protected double altura;
	
	public Forma() {
		this.largura = 0;
		this.altura = 0;
	}
	
	public Forma(double largura, double altura) {
		this.largura = largura;
		this.altura = altura;
	}
	
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getArea() {
		return 0;
		
	}
	
	public static void main(String[] args) {
		Forma f1 = new Forma();
	}
	
	
}


