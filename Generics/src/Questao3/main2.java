package Questao3;

public class main2 {

	public static void main(String[] args) {
		
		Pedido p = new Pedido(1);
		ProdutoX prod1 = new ProdutoX("Arroz", 21);
		ProdutoX prod2 = new ProdutoX("Feijão", 10);
		ProdutoX prod3 = new ProdutoX("Açucar", 15);
		
		p.addProdutoX(prod1);
		p.addProdutoX(prod2);
		p.addProdutoX(prod3);
		
		p.mostrar();
		

	}

}
