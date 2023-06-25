package funcionario;

import java.time.LocalDate;

import interfaces.SalarioFinal;
import pessoa.Endereco;
import pessoa.fisica.EstadoCivil;
import pessoa.fisica.Fisica;
import pessoa.fisica.Genero;
import util.Util;

public abstract class Funcionario extends Fisica implements SalarioFinal{
	
	protected String rg;
	protected String cpf;
	protected Setor setor;
	protected int matricula;
	protected Bonificacao bonificacao;
	protected double salarioBase;

	public Funcionario(String id, String nome, String telefone, String email, EstadoCivil estadoCivil, Genero genero,
			Endereco endereco, LocalDate dataNascimento, String rg, String cpf, Setor setor, int matricula,
			 double salarioBase) {
		super(id, nome, telefone, email, endereco, genero, estadoCivil, dataNascimento);
		this.rg = rg;
		this.cpf = cpf;
		this.setor = setor;
		this.matricula = matricula;
		this.salarioBase = salarioBase;
	}
	
	

	public double getSalarioBase() {
		return salarioBase;
	}



	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}



	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public Bonificacao getBonificacao() {
		return bonificacao;
	}

	public void setBonificacao(Bonificacao bonificacao) {
		this.bonificacao = bonificacao;
	}



	@Override
	public String toString() {
		return "" +
                super.toString()				
				+ "\n rg=" + rg +
				"\n cpf=" + cpf +
				"\n setor=" + setor.texto +
				"\n matricula=" + matricula +
				"\n Salario Base= " + Util.formatarDinheiro(salarioBase) +
				"\n Salario Final: " + Util.formatarDinheiro(getSalarioFinal());
	}
	
	
	
	

}
