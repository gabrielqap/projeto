package classes;

import java.util.LinkedList;

public class departamento {
	private LinkedList<funcionario> funcsDep;
	private String nomeDepartamento;
	private chefe chefDepartamento;
	
	public String getNomeDepartamento() {
		return nomeDepartamento;
	}

	public void setNomeDepartamento(String nomeDepartamento) {
		this.nomeDepartamento = nomeDepartamento;
	}

	public chefe getChefDepartamento() {
		return chefDepartamento;
	}

	public void setChefDepartamento(chefe chefDepartamento) {
		this.chefDepartamento = chefDepartamento;
	}

	public LinkedList<funcionario> getFuncsDep() {
		return funcsDep;
	}

	public void setFuncsDep(LinkedList<funcionario> funcsDep) {
		this.funcsDep = funcsDep;
	}
	
}
