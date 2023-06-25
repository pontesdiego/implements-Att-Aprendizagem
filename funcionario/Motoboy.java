package funcionario;

import java.time.LocalDate;

import pessoa.Endereco;
import pessoa.fisica.EstadoCivil;
import pessoa.fisica.Genero;

public class Motoboy extends Funcionario{
	
	private String placa;

	public Motoboy(String id, String nome, String telefone, String email, EstadoCivil estadoCivil, Genero genero,
			Endereco endereco, LocalDate dataNascimento, String rg, String cpf, Setor setor, int matricula,
			double salarioBase, String placa) {
		super(id, nome, telefone, email, estadoCivil, genero, endereco, dataNascimento, rg, cpf, setor, matricula,
				salarioBase);
		this.placa = placa;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	@Override
	public String toString() {
		return "\n Motoboy" +
	           super.toString()
				+ "\n placa=" + placa;
	}

	@Override
	public double getSalarioFinal() {
		return salarioBase + (salarioBase * Bonificacao.MOTOBOY.bonus);
	}
	
	

}
