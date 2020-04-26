package application;

import java.util.Random;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		
		Random rdm = new Random();
		Produto produtos = null;
		
		for(int i = 0; i < 40; i++) {
			Integer precoDeCusto = rdm.nextInt(20);
			Integer precoDeVenda = rdm.nextInt(20);
			
			System.out.printf("Preço de Custo: R$%d%nPreço de Venda: R$%d%n",precoDeCusto, precoDeVenda);
			produtos = new Produto(precoDeCusto, precoDeVenda);
			
			System.out.println(produtos.resultados());
			System.out.println();
			
			Produto.mediaPrecoDeCusto += precoDeCusto;
			Produto.mediaPrecoDeVenda += precoDeVenda;
			
		}
		
		System.out.printf("%nMédia de Custo: R$%d"
				+ "%nMédia de Venda: R$%d",
				Produto.mediaPrecoDeCusto/40, Produto.mediaPrecoDeVenda/40);

	}

}
