// Exercício 7
public class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario felipe = new Funcionario("Gerente", 3000.0);
		System.out.println("Cargo: " + felipe.getCargo());
		System.out.println("Salário: R$" + felipe.getSalario());
	}
}