public class TestarAnimais {

	public static void main(String[] args) {

		Mamifero camelo = new Mamifero("Camelo", 150, 4, "Amarelo", "Terra", 2.0, "Verduras");		
		camelo.dados();
		System.out.println("");
		Peixe tubarao = new Peixe("Tubarão", 300, 0, "Cinzento", "Mar", 1.5, "Barbatanas e cauda");
		tubarao.dadosPeixe();
		System.out.println("");
		Mamifero ursocanada = new Mamifero("Urso-do-canadá", 180, 4, "Vermelho", "Terra", 0.5, "Mel");
		System.out.println("");
		ursocanada.dadosMamifero();		
	}
}