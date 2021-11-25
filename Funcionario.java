// Exercício 7
public class Funcionario {
	private String cargo;
	private double salario;
	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public Funcionario(String cargo, double salario) {
		this.cargo = cargo;
		this.salario = salario;
	}
}