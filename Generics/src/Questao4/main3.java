package Questao4;

public class main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Comparar comp = new Comparar();
		
		Id id1 = new Id("123", 15);
		Id id2 = new Id("135", 20);
		Id id3 = new Id("123", 38);
		
	
		
		comp.addId(id1);
		comp.addId(id2);
		comp.addId(id3);
		
		System.out.println(comp);
	}

}
