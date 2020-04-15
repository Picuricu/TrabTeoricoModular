
public class FuncionarioPorHora extends Funcionario {
	private double horas;
	private double taxaPagamento;
	
	public FuncionarioPorHora(String nome) {
		super(nome);
	}
	
	public double getHoras() {
		return this.horas;
	}
	public double getTaxaPagamento() {
		return this.taxaPagamento;
	}
	public void setHoras(double horas) {
		this.horas = horas;
	}
	public void setTaxaPagamento(double taxa) {
		this.taxaPagamento = taxa;
	}
}
