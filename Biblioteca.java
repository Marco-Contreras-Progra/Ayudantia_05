import java.util.Vector;

public class Biblioteca {
	private String _nombre;
	private String _direcci�n;
	private List<Libro> _libros;
	private List<Empleado> _empleados;
	private List<Categoria> _categor�as;
	public Vector<Libro> _unnamed_Libro_ = new Vector<Libro>();
	public Empleado _unnamed_Empleado_;

	public void agregarLibro(String aTitulo, String aAutor, String aISBN, int aA�oPublicacion, Categoria aCategoria) {
		throw new UnsupportedOperationException();
	}

	public void modificarLibro(String aISBN, String aNuevoTitulo, String aNuevoAutor, int aNuevoA�o, Categoria aNuevaCategoria) {
		throw new UnsupportedOperationException();
	}

	public void eliminarLibro(String aISBN) {
		throw new UnsupportedOperationException();
	}

	public void agregarEmpleado(String aNombre, String aIdentificaci�n, String aCargo) {
		throw new UnsupportedOperationException();
	}

	public void modificarEmpleado(String aIdentificaci�n, String aNuevoNombre, String aNuevoCargo) {
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