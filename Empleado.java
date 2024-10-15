import java.util.Vector;

public class Empleado {
	private Object _nombre;
	private Object _identificación;
	private Object _cargo;
	public Vector<Biblioteca> _unnamed_Biblioteca_ = new Vector<Biblioteca>();

	public void getNombre() {
		return this._nombre;
	}

	public void setNombre(Object aNombre) {
		this._nombre = aNombre;
	}

	public void getIdentificación() {
		return this._identificación;
	}

	public void setIdentificación(Object aIdentificación) {
		this._identificación = aIdentificación;
	}

	public void getCargo() {
		return this._cargo;
	}

	public void setCargo(Object aCargo) {
		this._cargo = aCargo;
	}
}