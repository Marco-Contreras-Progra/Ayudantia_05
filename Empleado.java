import java.util.Vector;

public class Empleado {
	private Object _nombre;
	private Object _identificaci�n;
	private Object _cargo;
	public Vector<Biblioteca> _unnamed_Biblioteca_ = new Vector<Biblioteca>();

	public void getNombre() {
		return this._nombre;
	}

	public void setNombre(Object aNombre) {
		this._nombre = aNombre;
	}

	public void getIdentificaci�n() {
		return this._identificaci�n;
	}

	public void setIdentificaci�n(Object aIdentificaci�n) {
		this._identificaci�n = aIdentificaci�n;
	}

	public void getCargo() {
		return this._cargo;
	}

	public void setCargo(Object aCargo) {
		this._cargo = aCargo;
	}
}