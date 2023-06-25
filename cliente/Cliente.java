package cliente;

import java.time.LocalDate;

import pessoa.Endereco;
import pessoa.fisica.EstadoCivil;
import pessoa.fisica.Fisica;
import pessoa.fisica.Genero;

public class Cliente extends Fisica{
	
	protected String protocoloDeAtendimento;

	public Cliente(String id, String nome, String telefone, String email, Endereco endereco, Genero genero,
			EstadoCivil estadoCivil, LocalDate dataNascimento, String protocoloDeAtendimento) {
		super(id, nome, telefone, email, endereco, genero, estadoCivil, dataNascimento);
		this.protocoloDeAtendimento = protocoloDeAtendimento;
	}

	public String getProtocoloDeAtendimento() {
		return protocoloDeAtendimento;
	}

	public void setProtocoloDeAtendimento(String protocoloDeAtendimento) {
		this.protocoloDeAtendimento = protocoloDeAtendimento;
	}

	@Override
	public String toString() {
		return "Cliente" +
	            super.toString()
				+ "\n protocoloDeAtendimento=" + protocoloDeAtendimento;
	}
	
	

}
