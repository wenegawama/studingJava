package strings;

public class application {
	
	public static void main(String[] args) {
		
		String nome;
		nome = new String();
		nome = "Limão";
		System.out.println(nome);
		
		String nome2 = new String("Maçã");
		System.out.println(nome2);
		
		String nome3 = "Abacaxi";
		System.out.println(nome3);
		
		String nome4="Wenega";
		System.out.println(nome4.length());
		
		//scape
		
		String descricao = "Tipo Gala \nA maçã mais doce do mercado";
		System.out.println(descricao);
		
		String descricao2 = "Tipo Gala \tA maçã mais doce do mercado";
		System.out.println(descricao2);
		
		String descricao3 = "Tipo Gala \"A maçã mais doce do mercado\"";
		System.out.println(descricao3);
		
		//Concatenar strings
		System.out.println(descricao.concat(descricao2).concat(descricao3));
		
		String str = descricao + descricao2;
		System.out.println(str);
		
		String str2 = descricao2 += "!";
		System.out.println(str2);
		
	}
} 
