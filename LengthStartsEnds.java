package strings;

import java.util.Arrays;

public class LengthStartsEnds {

	public static void main(String[] args) {
		
		String descricao = new String("Maçã Gala, a maçã mais doce do mercado!");
		String nome = new String("Wenega é bom");
		
//		System.out.println(descricao.length());
//		System.out.println(descricao.startsWith("T")); //false
//		System.out.println(descricao.endsWith("!")); //true
		
//		System.out.println(descricao.charAt(13)); // m
//		System.out.println(descricao.indexOf("G")); //5
//		System.out.println(descricao.indexOf("Gala")); //5 pois o inicio da palavra Gala
//		System.out.println(descricao.indexOf("a")); // primeira ocorencia do "a"
//		System.out.println(descricao.lastIndexOf("a")); // ultima ocorencia do "a"*

//		
//		System.out.println(descricao.replace("a", "u"));
//		System.out.println(descricao.replace("maçã", "banana"));
//		System.out.println(descricao.replace("mais", "plus"));
//		System.out.println(Arrays.toString(descricao.split("' '")));
//		System.out.println(Arrays.toString(descricao.split("' '")).concat("wenega"));
//		System.out.println(Arrays.toString(nome.split("-")));
		
		System.out.println(descricao.toLowerCase());
		System.out.println(descricao.toUpperCase());                                               
		
		System.out.println(descricao.substring(0,4));
		System.out.println(descricao.substring(4));
		                                                                                                                                                                                                                                                                          
	}

}
