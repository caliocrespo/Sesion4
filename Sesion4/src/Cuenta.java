
public class Cuenta {
	
	
	public Cuenta(String numero, String titular, Double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}
	private String numero;
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	private String titular;
	private Double saldo;
	
	
	
	public void ingreso(Double cantidad) {
		this.setSaldo(50.0);
	}
	
	public void reintegro(Double cantidad) {
		this.setSaldo(50.0);
	}
}
