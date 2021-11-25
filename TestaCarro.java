// Exercício 9
public class TestaCarro {
	public static void main(String[] args) {
	Carro corsa = new Carro();
	corsa.setMarca("chevrolet");
	corsa.setModelo("Corsa 4 portas cromado fds");
	corsa.setAno(2009);
	corsa.setPlaca("ABC-1234");
	
	System.out.println(corsa.getMarca());
	System.out.println(corsa.getAno());
	System.out.println(corsa.getPlaca());
	System.out.println(corsa.getModelo());
	}
}