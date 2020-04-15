
public class Produto {
	private String descricao;
	private double preco;
	private Data dataVencimento;
	
	public String getDescricao() {
		return this.descricao;
	}
	public double getPreco() {
		return this.preco;
	}
	public String getDataVencimento() {
		return this.dataVencimento.toString();
	}
}
