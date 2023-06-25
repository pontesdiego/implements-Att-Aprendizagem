package pessoa.juridica;

import pessoa.Endereco;
import pessoa.Pessoa;

public abstract class Juridica extends Pessoa{
	
	protected String cnpj;
	protected String protocoloDeAtendimento;
	
	public Juridica(String id, String nome, String telefone, String email, Endereco endereco, String cnpj,
			String protocoloDeAtendimento) {
		super(id, nome, telefone, email, endereco);
		this.cnpj = cnpj;
		this.protocoloDeAtendimento = protocoloDeAtendimento;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getProtocoloDeAtendimento() {
		return protocoloDeAtendimento;
	}

	public void setProtocoloDeAtendimento(String protocoloDeAtendimento) {
		this.protocoloDeAtendimento = protocoloDeAtendimento;
	}

	@Override
	public String toString() {
		return ""+
	          super.toString() 
				+ "\n cnpj=" + cnpj +
				"\n protocoloDeAtendimento=" + protocoloDeAtendimento;
	}
	
	

}
