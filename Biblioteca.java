import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombre;
    private String direccion;
    private List<Libro> libros;
    private List<Empleado> empleados;
    private List<Categoria> categorias;


    public Biblioteca(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.libros = new ArrayList<>();
        this.empleados = new ArrayList<>();
        this.categorias = new ArrayList<>();
    }

    public void agregarLibro(String titulo, String autor, String ISBN, int añoPublicacion, Categoria categoria) {
        Libro nuevoLibro = new Libro(titulo, autor, ISBN, añoPublicacion, categoria);
        libros.add(nuevoLibro);
    }

    public void modificarLibro(String ISBN, String nuevoTitulo, String nuevoAutor, int nuevoAño, Categoria nuevaCategoria) {
        for (Libro libro : libros) {
            if (libro.getISBN().equals(ISBN)) {
                libro.actualizarInformacion(nuevoTitulo,  nuevoAutor, nuevoAño, nuevaCategoria);
                return;
            }
        }
        System.out.println("Libro no encontrado.");
    }

    public void eliminarLibro(String ISBN) {
        libros.removeIf(libro -> libro.getISBN().equals(ISBN));
    }


    public void agregarEmpleado(String nombre, String identificacion, String cargo) {
        Empleado nuevoEmpleado = new Empleado(nombre, identificacion, cargo);
        empleados.add(nuevoEmpleado);
    }

    public void modificarEmpleado(String identificacion, String nuevoNombre, String nuevoCargo) {
        for (Empleado empleado : empleados) {
            if (empleado.getIdentificacion().equals(identificacion)) {
                empleado.setNombre(nuevoNombre);
                empleado.setCargo(nuevoCargo);
                return;
            }
        }
        System.out.println("Empleado no encontrado.");
    }

    public void eliminarEmpleado(String identificacion) {
        empleados.removeIf(empleado -> empleado.getIdentificacion().equals(identificacion));
    }

    public void crearCategoria(String nombre, String descripcion) {
        Categoria nuevaCategoria = new Categoria(nombre, descripcion);
        categorias.add(nuevaCategoria);
    }

    public void editarCategoria(String nombre, String nuevaDescripcion) {
        for (Categoria categoria : categorias) {
            if (categoria.getNombre().equals(nombre)) {
                categoria.setDescripcion(nuevaDescripcion);
                return;
            }
        }
        System.out.println("Categoría no encontrada.");
    }

    public void eliminarCategoria(String nombre) {

        categorias.removeIf(categoria -> categoria.getNombre().equals(nombre));
    }
}
