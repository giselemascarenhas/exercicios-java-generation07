package br.com.generation.exercicio03;

import java.util.ArrayList;

// Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
// trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
// programa deverá atender as seguintes funcionalidades:
// Armazenar dados da List | Remover dados da list | Atualizar dados da list | Apresentar todos os dados da list.

public class TestaLoja {

		public static void main(String[] args) {
			
			Produto produto1 = new Produto("Televisão" , 2600.00);
			Produto produto2 = new Produto("Celular", 6000.00);
			Produto produto3 = new Produto("Máquina de Lavar", 3000.00);
			Produto produto4 = new Produto("Liquidificador", 250.00);

			ArrayList<Produto> produto = new ArrayList<>();
			produto.add(produto1);
			produto.add(produto2);
			produto.add(produto3);
			
			System.out.println("======== Produtos da Loja =======\n");
			for(int i = 0; i < produto.size(); i++) {
				System.out.println((i+1) + "º " + "Produto: " + produto.get(i));
			}
			
			produto.add(produto4);
			System.out.println("\nProduto adicionado: ");
			System.out.println(produto4);
			
			System.out.println("\nProduto removido: ");
			produto.remove(2);
			System.out.println(produto2);
			
			}
}