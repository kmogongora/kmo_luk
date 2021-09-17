package logica;

/**
 * Clase base
 * @author Cielo Juliana
 */
public class Usuario {
    private int id;
    private String nombre;


    
    public Usuario() {
    }

    
    public Usuario(String nombre) {
        this.nombre = nombre;

    }
    
    
    public Usuario(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
       
    }
    
    
    public int getId() {
        return id;
    }

    
    public void setId(int id) {
        this.id = id;
    }
    

    public String getNombre() {
        return nombre;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   
}
