public class Peixe extends Animal {
	private String caracteristica;
	
	public Peixe(String nome, double comprimento, int npatas, String cor, String ambiente, double velocidade, String caracteristica) {
		super(nome, comprimento, npatas, cor, ambiente, velocidade);
		this.caracteristica=caracteristica;
	}
	public String getCaracteristica() {
		return caracteristica;
	}
	public void setCaracteristica(String caractistica) {
		this.caracteristica = caractistica;
	}
	
	public void dadosPeixe() {
		super.dados();
		System.out.println("Características: " + getCaracteristica());		
	}	
}