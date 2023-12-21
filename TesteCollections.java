package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TesteCollections {

	public static void main(String[] args) {

		/*
		ArrayList carrinho = new ArrayList();
		Double valor = 100.4;
		int valor2 = 23;
		int valor3 = 45;
		
		carrinho.add(valor);
		carrinho.add("Mango");
		carrinho.add(valor2);
		carrinho.add(valor3);
		carrinho.set(2, 80);
		carrinho.remove(1);
		
		valor3 = (int) carrinho.get(2); //sem esse cast o programa não compila
		
		
		System.out.println(carrinho.get(1));
		System.out.println(carrinho.get(0));
		System.out.println(carrinho.get(2));
		System.out.println(carrinho.get(1));
		System.out.println(carrinho.size());
		System.out.println(carrinho);

		List<Double> carrinhoo = new ArrayList<Double>();
		carrinhoo.add(2.5);
		carrinhoo.add(7.90);
		carrinhoo.add(5.75);
		carrinhoo.add(7.90);
		

		System.out.println(carrinhoo);
		System.out.println(carrinhoo.isEmpty());
		System.out.println(carrinhoo.size());
		
		System.out.println(carrinhoo.contains(7.90));
		System.out.println(carrinhoo.indexOf(7.90));
		
		System.out.println(carrinhoo.get(2));
		System.out.println(carrinhoo.lastIndexOf(7.90));
		System.out.println(carrinhoo.remove(carrinhoo.indexOf(5.75)));
		System.out.println(carrinhoo.get(0));
		System.out.println(carrinhoo);
		carrinhoo.clear();
		System.out.println(carrinhoo.isEmpty());
		System.out.println(carrinhoo);
		
		
		Set<String> cesta = new HashSet<String>(); // set não aceita repetição => mais performance de busca
		
		cesta.add("Mango");
		cesta.add("Feijão");
		cesta.add("Trigo");
		cesta.add("Feijão");
		
		System.out.println(cesta.isEmpty());
		System.out.println(cesta.size());
		System.out.println(cesta);
		*/
		
		Map<String, String> caixa = new HashMap<String, String>();
		caixa.put("nome", "Ana");
		caixa.put("sobrenome", "Wama");
		caixa.put("telefone", "41988924285");
		caixa.put("email", "Ana@gmail.com");
		caixa.putIfAbsent("apelido", "Polaka");
		caixa.putIfAbsent("sobrenome", "Aline"); // não vai adicionar pois já tem a chave sobrenome
		caixa.replace("telefone", "111111111"); // replace permite alterar
		
		System.out.println(caixa.isEmpty()); //false
		System.out.println(caixa.size()); //5
		System.out.println(caixa.containsKey("telefone")); //true
		System.out.println(caixa.containsValue("Wama")); //true
		System.out.println(caixa.isEmpty()); //false
		System.out.println(caixa); //{telefone=111111111, apelido=Polaka, nome=Ana, sobrenome=Wama, email=Ana@gmail.com}
		caixa.remove("email");
		System.out.println(caixa); //{telefone=111111111, apelido=Polaka, nome=Ana, sobrenome=Wama}
		caixa.remove("nome", "Ana");
		System.out.println(caixa); //{telefone=111111111, apelido=Polaka, sobrenome=Wama}
		caixa.remove("telefone", "2222"); // não vai remover pois não existe 
		System.out.println(caixa); //{telefone=111111111, apelido=Polaka, sobrenome=Wama}
		System.out.println(caixa.values()); // retorna  os valres
		System.out.println(caixa.keySet()); // retorna as chaves
		
	}
}
