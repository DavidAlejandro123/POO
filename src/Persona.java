public class Persona {
    
    //Atributos
    String nombre;
    String apellido;
    int edad;
    Carrera carrera;
    
    //Constructor
    public Persona(String nombre, String apellido, int edad, String nombreCarrera, int duracion, boolean estaCursando){
        carrera = new Carrera(nombreCarrera,duracion,estaCursando);
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

     
    
}
