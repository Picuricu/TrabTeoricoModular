import java.time.LocalDate;

public class Data {
	LocalDate data;
	
	Data(){
		this.data = data.now();
	}
	Data(int ano, int mes, int dia){
		this.data = this.data.of(ano, mes, dia);
	}
	
	public int getDia() {
		return this.data.getDayOfMonth();
	}
	public int getMes() {
		return this.data.getMonthValue();
	}
	public int getAno() {
		return this.data.getYear();
	}
	public void setData(int ano, int mes, int dia) {
		this.data = this.data.of(ano, mes, dia);
	}
	public String toString() {
		return this.data.toString();
	}
	public void setDia(int dia) {
		this.data = this.data.withDayOfMonth(dia);
	}
	public void setMes(int mes) {
		this.data = this.data.withMonth(mes);
	}
	public void setAno(int ano) {
		this.data = this.data.withYear(ano);
	}
}
