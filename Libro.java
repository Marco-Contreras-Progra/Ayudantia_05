import java.util.Vector;

public class Libro {
	private Object _titulo;
	private Object _autor;
	private Object _iSBN;
	private Object _a�oPublicacion;
	public Vector<Biblioteca> _unnamed_Biblioteca_ = new Vector<Biblioteca>();
	public Vector<Prestamo> _unnamed_Prestamo_ = new Vector<Prestamo>();
	public Categoria _unnamed_Categoria_;

	/**
	 * t�tulo (String), autor (String), ISBN (String), a�oDePublicaci�n (int), categor�a (Categor�a)
	 */
	public void getTitulo() {
		return this._titulo;
	}

	public void setTitulo(Object aTitulo) {
		this._titulo = aTitulo;
	}

	public void getAutor() {
		return this._autor;
	}

	public void setAutor(Object aAutor) {
		this._autor = aAutor;
	}

	public void getA�oPublicacion() {
		return this._a�oPublicacion;
	}

	public void setA�oPublicacion(Object aA�oPublicacion) {
		this._a�oPublicacion = aA�oPublicacion;
	}
}