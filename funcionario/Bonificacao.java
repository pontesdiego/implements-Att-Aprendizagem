package funcionario;

public enum Bonificacao {
	
	CAIXA(0.2),
	MOTOBOY(0.1),
	REPOSITOR(0.15);
	
	protected final double bonus;

	private Bonificacao(double bonus) {
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}
	
	

}
