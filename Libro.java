import java.util.Vector;

public class Libro {
    private String titulo;
    private String autor;
    private String ISBN;
    private int añoPublicacion;
    private Categoria categoria;
	public Vector<Biblioteca> _unnamed_Biblioteca_ = new Vector<Biblioteca>();
	public Vector<Prestamo> _unnamed_Prestamo_ = new Vector<Prestamo>();
	public Categoria _unnamed_Categoria_;


    public Libro(String titulo, String autor, String ISBN, int añoPublicacion, Categoria categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.añoPublicacion = añoPublicacion;
        this.categoria = categoria;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return this.ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getAñoPublicacion() {
        return this.añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public Categoria getCategoria() {
        return this.categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
	public void actualizarInformacion(String nuevoTitulo, String nuevoAutor, Integer nuevoAño, Categoria nuevaCategoria) {
	
		if (nuevoTitulo != null && !nuevoTitulo.isEmpty()) {
			this.titulo = nuevoTitulo;
		}
		if (nuevoAutor != null && !nuevoAutor.isEmpty()) {
			this.autor = nuevoAutor;
		}
		
		if (nuevoAño != null && nuevoAño > 0) {
			this.añoPublicacion = nuevoAño;
		}
		if (nuevaCategoria != null) {
			this.categoria = nuevaCategoria;
		}
	}
	
}