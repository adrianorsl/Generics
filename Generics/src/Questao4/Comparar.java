package Questao4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Comparar {

	public static <T extends Comparable<T>> int countGreaterThan (T[] anArray, T elem) {
		for (T e : anArray) {
			if(e.compareTo(elem) == 0) {
				return 1;
			}
		}
		return 2;
	}
	

	List<Id> lId = new ArrayList<Id>();
	
	
	
	public boolean addId(Id id) {
		String[] aux = {"",""};
		if(lId.isEmpty()) {
			return lId.add(id);
			
		}else {
			for (int i = 0; i < lId.size(); i++) {
				aux[i] = lId.get(i).getChave();
			}
			int aux2 = Comparar.<String>countGreaterThan(aux, lId.get(0).getChave());
			if (aux2 == 1) {
				return lId.add(id);
			}
		}
		return false;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Comparar [lId=");
		for (Id id : lId) {
			builder.append(id.toString());
		}
		builder.append("]");
		return builder.toString();
	}


	
}
