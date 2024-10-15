import java.util.Vector;

public class Biblioteca {
	private String _nombre;
	private String _dirección;
	private List<Libro> _libros;
	private List<Empleado> _empleados;
	private List<Categoria> _categorías;
	public Vector<Libro> _unnamed_Libro_ = new Vector<Libro>();
	public Empleado _unnamed_Empleado_;

	public void agregarLibro(String aTitulo, String aAutor, String aISBN, int aAñoPublicacion, Categoria aCategoria) {
		throw new UnsupportedOperationException();
	}

	public void modificarLibro(String aISBN, String aNuevoTitulo, String aNuevoAutor, int aNuevoAño, Categoria aNuevaCategoria) {
		throw new UnsupportedOperationException();
	}

	public void eliminarLibro(String aISBN) {
		throw new UnsupportedOperationException();
	}

	public void agregarEmpleado(String aNombre, String aIdentificación, String aCargo) {
		throw new UnsupportedOperationException();
	}

	public void modificarEmpleado(String aIdentificación, String aNuevoNombre, String aNuevoCargo) {
		throw new UnsupportedOperationException();
	}

	public void eliminarEmpleado(String aIdentificacion) {
		throw new UnsupportedOperationException();
	}

	public void crearCategoria(String aNombre, String aDescricion) {
		throw new UnsupportedOperationException();
	}

	public void editarCategoria(String aNombre, String aNuevoDescricion) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_Categoria(String aNombre) {
		throw new UnsupportedOperationException();
	}
}