package Classes;

public class Retangulo extends Forma{
	
	public Retangulo() {
		super();
	}
	
	public Retangulo(double largura, double altura) {
		super(largura, altura);
	}
	@Override
	public double getArea() {
		return largura * altura;
	}
	
	
	
}

