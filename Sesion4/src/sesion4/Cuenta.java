package sesion4;
import java.util.ArrayList;
import java.util.List;
import sesion4.Movimiento.signo;
public class Cuenta {
	
	public Cuenta(String numero, String titular, Double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		mMovimientos=new ArrayList<Movimiento>();
	}
	
	List<Movimiento> mMovimientos;

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
		
		Movimiento aux=new Movimiento(cantidad,"Ingreso de dinerito",signo.D);
		mMovimientos.add(aux);
		this.saldo+=cantidad;
		
		
	}
	
	public void reintegro(Double cantidad) {
		if(this.saldo>=-500 && (this.saldo-cantidad)>=-500) {
			Movimiento aux=new Movimiento(cantidad,"Retiro de dinero "+cantidad,signo.H);
			mMovimientos.add(aux);
			this.saldo-=cantidad;
		}
		
	}
}
