package pessoa.juridica;

import java.time.LocalDate;

import pessoa.Endereco;

public class PrestacaoDeServico extends Juridica{
	
	private LocalDate contratoInicio;
	private LocalDate contratoFim;
	
	public PrestacaoDeServico(String id, String nome, String telefone, String email, Endereco endereco, String cnpj,
			String protocoloDeAtendimento, LocalDate contratoInicio, LocalDate contratoFim) {
		super(id, nome, telefone, email, endereco, cnpj, protocoloDeAtendimento);
		this.contratoInicio = contratoInicio;
		this.contratoFim = contratoFim;
	}

	public LocalDate getContratoInicio() {
		return contratoInicio;
	}

	public void setContratoInicio(LocalDate contratoInicio) {
		this.contratoInicio = contratoInicio;
	}

	public LocalDate getContratoFim() {
		return contratoFim;
	}

	public void setContratoFim(LocalDate contratoFim) {
		this.contratoFim = contratoFim;
	}

	@Override
	public String toString() {
		return "\n Prestação De Serviço"
				+ super.toString()
				+ "\n contratoInicio=" + contratoInicio + 
				"\n contratoFim=" + contratoFim;
	}
	
	

}
