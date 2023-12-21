package arrays;

public class Caixa {

	public static void main(String[] args) {
/*		
		float[] valores = new float[5];
		
		valores[0] = 10;
		valores[1] = 20;
		valores[2] = 30;
		valores[3] = 40;
		
		System.out.println(valores[4]);
		
		float[] valores = { 10, 20, 30, 40, 50};
		float[] valores2 = new float[] {10, 20, 30, 40, 50};
		
		System.out.println(valores[2]);
		System.out.println(valores2[3]);
		*/
		Produto[] produtos = new Produto[2];
		
		Produto prod1 = new Produto();
		prod1.setNome("Uva");
		prod1.setDescricao("Muito bom preço");
		prod1.setValor(1);
		
		Produto prod2 = new Produto();
		prod1.setNome("Abacaxi");
		prod1.setDescricao("Melhor preço");
		prod1.setValor(3);
		
		produtos[0] = prod1;
		produtos[1] = prod2;
		
		for (int i=0; i< produtos.length; i++) {
		System.out.println(produtos[i].toString());
		}
		
		for(Produto prod: produtos) { 	//foreach
			System.out.println(prod.toString());
		}
	
		
		//10 corredores com tres prateleiras cada
		
		Produto[][] localizacaoProduto = new Produto[10][3];
		
		localizacaoProduto[2][1] = prod1;
		localizacaoProduto[2][2] = prod2;
		
		System.out.println(localizacaoProduto[2][1].getNome());
	}	
		
		
}
