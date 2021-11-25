// Exercício 8
public class TestaFigura implements Figura {
		
	private String nomeFigura;
	private int area;
	private int perimetro;
	private int lado1;
	private int lado2;

	@Override
	public String getNomeFigura() {
		return this.nomeFigura;
	}

	@Override
	public int getArea() {
		this.area = this.lado1 * this.lado2;
		return this.area;
	}

	@Override
	public int getPerimetro() {
		this.perimetro = (this.lado1 * 2) + (this.lado2 * 2);
		return this.perimetro;
	}

	@Override
	public int[] getLado() {
		int[] simSoQue2 = {this.lado1, this.lado2};
		return simSoQue2;
	}

	public void setLado1(int lado1) {
		this.lado1 = lado1;
	}

	public void setLado2(int lado2) {
		this.lado2 = lado2;
	}

	public void setNomeFigura(String nomeFigura) {
		this.nomeFigura = nomeFigura;
	}

}