import java.util.Vector;

public class Empleado {
	private Object _nombre;
	private Object _identificacion;
	private Object _cargo;
	public Vector<Biblioteca> _unnamed_Biblioteca_ = new Vector<Biblioteca>();

	public void getNombre() {
		return this._nombre;
	}

	public void setNombre(Object aNombre) {
		this._nombre = aNombre;
	}

	public void getIdentificacion() {
		return this._identificacion;
	}

	public void setIdentificacion(Object aIdentificacion) {
		this._identificacion = aIdentificacion;
	}

	public void getCargo() {
		return this._cargo;
	}

	public void setCargo(Object aCargo) {
		this._cargo = aCargo;
	}
}