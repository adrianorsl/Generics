package Questao3;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
		
	private int numero;
	
	List<ProdutoX> produto = new ArrayList<ProdutoX>();
	
	public List<ProdutoX> getProduto() {
		return produto;
	}

	public void setProduto(List<ProdutoX> produto) {
		this.produto = produto;
	}
	
	public boolean addProdutoX(ProdutoX produtoX) {
		return produto.add(produtoX);
	}
	
	
	public void mostrar() {
		for (int i = 0; i < produto.size(); i++) {
			produto.toString();
		}
	}

	public Pedido(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pedido [numero=");
		builder.append(numero);
		
		builder.append("]");
		return builder.toString();
	}
	
	
}
