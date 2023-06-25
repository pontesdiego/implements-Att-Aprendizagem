package pessoa.fisica;

public enum Genero {

	MASCULINO("Masculino"),
	FEMININO("Feminino"),
	CONSTANTE("Constante"),
	UFBA("Ufba");
	
	protected String texto;

	private Genero(String texto) {
		this.texto = texto;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	
	
}
