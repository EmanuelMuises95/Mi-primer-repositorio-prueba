package ExEjercicio001;

public class Perro {

    private String nombre;
    private Integer edad;
    
    public Perro(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public Perro() {
    }
    
    public Perro(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Nombre: [" + nombre + "], Edad: [" + edad + "]";
    }

}
