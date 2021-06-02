
public class Questao1<T> {
	private T type;

	
	public Questao1(T type) {
		this.type = type;
	}

	public T getType() {
		return type;
	}

	public void setType(T type) {
		this.type = type;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Questão1 [type=");
		builder.append(type);
		builder.append("]");
		return builder.toString();
	}
	
	
}
