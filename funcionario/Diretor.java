package funcionario;

import java.time.LocalDate;

import interfaces.Contratacao;
import pessoa.Endereco;
import pessoa.fisica.EstadoCivil;
import pessoa.fisica.Genero;

public class Diretor extends Funcionario implements Contratacao{
	
	private double premio;

	public Diretor(String id, String nome, String telefone, String email, EstadoCivil estadoCivil, Genero genero,
			Endereco endereco, LocalDate dataNascimento, String rg, String cpf, Setor setor, int matricula,
			double salarioBase) {
		super(id, nome, telefone, email, estadoCivil, genero, endereco, dataNascimento, rg, cpf, setor, matricula,
				salarioBase);
		this.premio = 0.3;
	}

	public double getPremio() {
		return premio;
	}

	@Override
	public String toString() {
		return "\n Diretor" +
	           super.toString()
				+ "\n premio: 30%";
	}



	@Override
	public double getSalarioFinal() {
		return salarioBase + (salarioBase * this.premio);
	}



	@Override
	public void admitir(Funcionario funcionario) {
		System.out.println("Funcionario Contratato: " + funcionario);
		
	}



	@Override
	public void demitir(Funcionario funcionario) {
	    System.out.println("Funcionario demitido: " + funcionario);
		
	}
	
	

}
