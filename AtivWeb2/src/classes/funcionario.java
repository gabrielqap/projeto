package classes;

public class funcionario {
	private String NomeFuncionario;
	private String Salario;
	private departamento depFuncionario;
	public funcionario() {
		
	}
	
	public funcionario(String nomeFuncionario, String Salario) {
		this.NomeFuncionario = nomeFuncionario;
		this.Salario = Salario;
	}
	
	
	public String getNomeFuncionario() {
		return NomeFuncionario;
	}
	public void setNomeFuncionario(String nomeFuncionario) {
		NomeFuncionario = nomeFuncionario;
	}
	public String getSalario() {
		return Salario;
	}
	public void setSalario(String salario) {
		Salario = salario;
	}

	public departamento getDepFuncionario() {
		return depFuncionario;
	}

	public void setDepFuncionario(departamento depFuncionario) {
		this.depFuncionario = depFuncionario;
	}
	
}
