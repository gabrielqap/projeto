package controlador;

import java.util.LinkedList;

import classes.chefe;
import classes.departamento;
import classes.funcionario;

public class classeControladora {
	private LinkedList<chefe> chefes;
	private LinkedList<departamento> deps;
	private LinkedList<funcionario> funcionarios;
	
	
	public void AdicionaFuncionario(String nomeFunc, String nomeDep, String salario) {
		for(departamento a : deps) {
			if(a.getNomeDepartamento().equals(nomeDep)) {
				funcionario novo = new funcionario(nomeFunc, salario);
				novo.setDepFuncionario(a);
				a.getFuncsDep().add(novo);
				funcionarios.add(novo);
			}
		}
	}
	
	public void AdicionaChefe(String NomeFunc, String depart) {
		for(departamento a : deps) {
			if(a.getNomeDepartamento().equals(depart)) {
				chefe novochef = new chefe();
				novochef.setDepDoChefe(a);
				chefes.add(novochef);
			}
		}
	}
	
	public void AdicionaDep(String nomeChef, String nomeDep) {
		departamento a = new departamento();
		for(chefe aa : chefes) {
			if(aa.getNomeFuncionario().equals(nomeChef)) {
				a.setChefDepartamento(aa);
				a.setNomeDepartamento(nomeDep);
				deps.add(a);
			}
		}
	}
}
