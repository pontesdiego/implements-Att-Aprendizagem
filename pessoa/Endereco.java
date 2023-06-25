package pessoa;

public class Endereco {
	
	protected String logadouro;
	protected String numero;
	protected String complemento;
	protected String cidade;
	protected String cep;
	protected UnidadeFederativa uf;
	
	public Endereco(String logadouro, String numero, String complemento, String cidade, String cep,
			UnidadeFederativa uf) {
		super();
		this.logadouro = logadouro;
		this.numero = numero;
		this.complemento = complemento;
		this.cidade = cidade;
		this.cep = cep;
		this.uf = uf;
	}

	public String getLogadouro() {
		return logadouro;
	}

	public void setLogadouro(String logadouro) {
		this.logadouro = logadouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public UnidadeFederativa getUf() {
		return uf;
	}

	public void setUf(UnidadeFederativa uf) {
		this.uf = uf;
	}

	@Override
	public String toString() {
		return ""
				+ "\n logadouro: " + logadouro +
				"\n numero: " + numero +
				"\n complemento=" + complemento +
				"\n cidade=" + cidade +
				"\n cep=" + cep +
				"\n uf=" + uf.texto + "(" + uf.sigla + ")" ;
	}
	
	
	
	

}
