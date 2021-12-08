public class Mamifero extends Animal{
	
	private String alimento;	
	public Mamifero(String nome, double comprimento, int npatas, String cor, String ambiente, double velocidade, String alimento) {
		super(nome, comprimento, npatas, cor, ambiente, velocidade);
		this.alimento=alimento;		
	}
	public String getAlimento() {
		return alimento;
	}
	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	public void dadosMamifero() {
		super.dados();
		System.out.println("Alimento: " + getAlimento());		
	}	
}