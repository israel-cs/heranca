public class Animal {
	private String nome;
	private double comprimento;
	private int npatas;
	private String cor;
	private String ambiente;
	private double velocidade;
	
	public Animal (String nome, double comprimento, int npatas, String cor, String ambiente, double velocidade) {
		this.nome = nome;
		this.comprimento = comprimento;
		this.npatas = npatas;
		this.cor = cor;
		this.ambiente = ambiente;
		this.velocidade = velocidade;
	}
	public void dados() {
		System.out.println("Animal: " + getNome());
		System.out.println("Comprimento: " + getComprimento());
		System.out.println("Número de patas: " + getNpatas());
		System.out.println("Cor do animal: " + getCor());
		System.out.println("Ambiente do animal: " + getAmbiente());
		System.out.println("Velocidade do animal: " + getVelocidade());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public int getNpatas() {
		return npatas;
	}

	public void setNpatas(int npatas) {
		this.npatas = npatas;
	}
		
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
}
