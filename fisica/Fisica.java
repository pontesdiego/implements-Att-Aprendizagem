package pessoa.fisica;

import java.time.LocalDate;
import java.time.Period;

import pessoa.Endereco;
import pessoa.Pessoa;
import util.Util;

public abstract class Fisica extends Pessoa{
	
	protected Genero genero;
	protected EstadoCivil estadoCivil;
	protected LocalDate dataNascimento;
	
	public Fisica(String id, String nome, String telefone, String email, Endereco endereco, Genero genero, EstadoCivil estadoCivil,
			LocalDate dataNascimento) {
		super(id, nome, telefone, email, endereco);
		this.genero = genero;
		this.estadoCivil = estadoCivil;
		this.dataNascimento = dataNascimento;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public int getIdade() {
     return	Period.between(dataNascimento, LocalDate.now()).getYears();	
	}

	@Override
	public String toString() {
		return "" +
	            super.toString()
				+ "\n genero=" + genero.texto +
				"\n estadoCivil=" + estadoCivil.texto +
				"\n dataNascimento=" + Util.formatarData(dataNascimento) +
				"\n Idade: " + getIdade();
	}
	
	
	

}
