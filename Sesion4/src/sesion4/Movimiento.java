package sesion4;

public class Movimiento {
	public Movimiento(Double importe, String detalle, signo tipo) {
		this.importe = importe;
		this.detalle = detalle;
		this.sig=tipo;
	}
	enum signo{D,H};
	private Double importe;
	private String detalle;
	private signo sig;
	
	public Double getImporte() {
		return importe;
	}
	public void setImporte(Double importe) {
		this.importe = importe;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	
}
