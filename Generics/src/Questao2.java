import java.util.Date;

public class Questao2<V> {
	
	private String produto;
	private V id;
	private float valor;
	private String dataFabricacao;
	private String dataVencimento;
	
	
	public Questao2(String produto, V id, float valor, String dataFabricacao, String dataVencimento) {
		
		this.produto = produto;
		this.id = id;
		this.valor = valor;
		this.dataFabricacao = dataFabricacao;
		this.dataVencimento = dataVencimento;
	}


	public String getProduto() {
		return produto;
	}


	public void setProduto(String produto) {
		this.produto = produto;
	}


	public V getId() {
		return id;
	}


	public void setId(V id) {
		this.id = id;
	}


	public float getValor() {
		return valor;
	}


	public void setValor(float valor) {
		this.valor = valor;
	}


	public String getDataFabricacao() {
		return dataFabricacao;
	}


	public void setDataFabricacao(String dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}


	public String getDataVencimento() {
		return dataVencimento;
	}


	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Questao2 [produto=");
		builder.append(produto);
		builder.append(", id=");
		builder.append(id);
		builder.append(", valor=");
		builder.append(valor);
		builder.append(", dataFabricacao=");
		builder.append(dataFabricacao);
		builder.append(", dataVencimento=");
		builder.append(dataVencimento);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
