package heranca;

public class TesteHeranca {
	
	public static void main(String[] args) {
		Animal animal = new Animal();
		
		animal.setAlimenta("Todo animal se alimenta");
		animal.setLocomove("Todo animal se locomove");
		
		Cachorro cachorro = new Cachorro();
		cachorro.setAlimenta("Cachorro se alimenta");
		cachorro.setLatido("Cachorro faz Au Au");
		cachorro.setLocomove("Cachorro se locomove com 4 patas");
		
		Animal cachorro2 = new Cachorro();
		cachorro2.setAlimenta("Esse cachorro 2 e do tipo animal e pode se alimentar");
		cachorro2.setLocomove("Esse cachorro 2 e do tipo animal e pode se locomover com 4 patas");
	}
}
