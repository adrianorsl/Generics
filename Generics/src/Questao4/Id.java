package Questao4;

import java.util.ArrayList;
import java.util.List;

public class Id<E> {

	private String chave;
	private E valor;
	
	public static <T extends Comparable<T>> int countGreaterThan (T[] anArray, T elem) {
		for (T e : anArray) {
			if(e.compareTo(elem) == 0) {
				return 1;
			}
		}
		return 2;
	}
	

	List<Id> lId = new ArrayList<Id>();
	

	public Id(String chave, E valor) {
		this.chave = chave;
		this.valor = valor;
	}

	public String getChave() {
		return chave;
	}

	public void setChave(String chave) {
		this.chave = chave;
	}

	public E getValor() {
		return valor;
	}

	public void setValor(E valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Id [chave=");
		builder.append(chave);
		builder.append(", valor=");
		builder.append(valor);
		builder.append("]");
		return builder.toString();
	}
	
	
}
