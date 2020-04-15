
public class Funcionario {
	private String nome;
	private Data dataDeContratacao;
	
	Funcionario(String nome){
		this.nome = nome;
		this.dataDeContratacao = new Data();
	}
	public String getNome() {
		return this.nome;
	}
	public Data getDataDeContratacao() {
		return this.dataDeContratacao;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setDataDeContratacao(int ano, int mes, int dia) {
		this.dataDeContratacao.setData(ano, mes, dia);
	}
	
}
