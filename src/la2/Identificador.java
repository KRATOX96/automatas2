package la2;
public class Identificador {

	String nombre;
	String valor;
	String tipoDato;
	String tipo;
	String uso;
	String modificador;
	int posicion;
	
	public int getPosicion() {
		return posicion;
	}
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getTipoDato() {
		return tipoDato;
	}
	public void setTipoDato(String tipo) {
		this.tipoDato = tipo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getModificador() {
		return modificador;
	}
	public void setModificador(String image) {
		this.modificador = (image == null)?"":image;
	}
	public String getUso() {
		return uso;
	}
	public void setUso(String uso) {
		this.uso = uso;
	}
	
}
