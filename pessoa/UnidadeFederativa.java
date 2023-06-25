package pessoa;

public enum UnidadeFederativa {
	
	BAHIA("Bahia", "BA"),
	VISTA_ALEGRE("Vista Alegre", "VA"),
	CAJAZEIRAS("Cajazeiras", "CAJÁ");
	
	protected String texto;
	protected String sigla;
	
	private UnidadeFederativa(String texto, String sigla) {
		this.texto = texto;
		this.sigla = sigla;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
	
	
	

}
