package actividad20_;

public class Direccion {
	private TipoVia tipoVia;
	private String nombreVia;
	private String localidad;
	private String cp;
	
	public Direccion() {
		super();
	}

	public TipoVia getTipoVia() {
		return tipoVia;
	}

	public void setTipoVia(TipoVia tipoVia) {
		this.tipoVia = tipoVia;
	}

	public String getNombreVia() {
		return nombreVia;
	}

	public void setNombreVia(String nombreVia) {
		this.nombreVia = nombreVia;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	@Override
	public String toString() {
		return "Direccion [tipoVia=" + tipoVia + ", nombreVia=" + nombreVia + ", localidad=" + localidad + ", cp=" + cp
				+ "]";
	}
	
	
	
}
