package funcionario;

public enum Setor {
	
	OPERACOES("Operações"),
	FINANCEIRO("Financeiro"),
	JURIDICO("Juridico");
	
	protected final String texto;

	private Setor(String texto) {
		this.texto = texto;
	}

	public String getTexto() {
		return texto;
	}
	
	
	

}
