package pessoa.juridica;

import pessoa.Endereco;

public class Fornecedor extends Juridica{
	
	private String produto;

	public Fornecedor(String id, String nome, String telefone, String email, Endereco endereco, String cnpj,
			String protocoloDeAtendimento, String produto) {
		super(id, nome, telefone, email, endereco, cnpj, protocoloDeAtendimento);
		this.produto = produto;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	@Override
	public String toString() {
		return "\n Fornecedor" +
	            super.toString()
				+ "produto=" + produto;
	}
	
	

}
