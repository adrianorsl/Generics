

public class main {

	public static void main(String[] args) {
		Carro car = new Carro("Gol", "VW");
		
		Questao1<Integer> p1 = new Questao1<>(10); 
		Questao1<String> p2 = new Questao1<>("Adriano"); 
		Questao1<Carro> p3 = new Questao1<>(car);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

	
		
	}

}
