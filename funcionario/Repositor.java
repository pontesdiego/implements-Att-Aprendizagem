package funcionario;

import java.time.LocalDate;

import pessoa.Endereco;
import pessoa.fisica.EstadoCivil;
import pessoa.fisica.Genero;

public class Repositor extends Funcionario{

	
	

	public Repositor(String id, String nome, String telefone, String email, EstadoCivil estadoCivil, Genero genero,
			Endereco endereco, LocalDate dataNascimento, String rg, String cpf, Setor setor, int matricula,
			double salarioBase) {
		super(id, nome, telefone, email, estadoCivil, genero, endereco, dataNascimento, rg, cpf, setor, matricula, salarioBase);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "\n Repositor" + 
	            super.toString() ;
	}

	@Override
	public double getSalarioFinal() {
		return salarioBase + (salarioBase * Bonificacao.REPOSITOR.bonus);
	}
	
	

}
