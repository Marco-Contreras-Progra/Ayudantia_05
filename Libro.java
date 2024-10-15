import java.util.Vector;

public class Libro {
	private Object _titulo;
	private Object _autor;
	private Object _iSBN;
	private Object _añoPublicacion;
	public Vector<Biblioteca> _unnamed_Biblioteca_ = new Vector<Biblioteca>();
	public Vector<Prestamo> _unnamed_Prestamo_ = new Vector<Prestamo>();
	public Categoria _unnamed_Categoria_;

	/**
	 * título (String), autor (String), ISBN (String), añoDePublicación (int), categoría (Categoría)
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

	public void getAñoPublicacion() {
		return this._añoPublicacion;
	}

	public void setAñoPublicacion(Object aAñoPublicacion) {
		this._añoPublicacion = aAñoPublicacion;
	}
}