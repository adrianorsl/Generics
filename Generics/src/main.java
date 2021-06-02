
public class main {

	public static void main(String[] args) {
		Carro car = new Carro("Gol", "VW");
		
		Questao1<Integer> p1 = new Questao1<>(10); 
		Questao1<String> p2 = new Questao1<>("Adriano"); 
		Questao1<Carro> p3 = new Questao1<>(car);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

		Questao2<String> prod1 = new Questao2<>("Arroz", "25", 21, "24/02/2020" ,"24/02/2021");
		Questao2<Integer> prod2 = new Questao2<>("Feijão", 40, 10, "05/06/2020","05/06/2021");
		
		System.out.println(prod1);
		System.out.println(prod2);
		
	}

}
