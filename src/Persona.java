public class Persona {
    
    //Atributos (estado/caracteristicas de un objeto)
    String nombre;
    String apellido;
    int edad;
    Carrera carrera;

    //Constructor
    public Persona(String nombre, String apellido, int edad, String nombreCarrera, int duracionCarrera, boolean estaCursando){
        carrera = new Carrera(nombreCarrera, duracionCarrera, estaCursando);
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    //Sobrecarga del constructor
    public Persona(String nombre, String apellido, int edad, String nombreCarrera){
        carrera = new Carrera(nombreCarrera);
        this.nombre = nombre;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        carrera.nombre = nombreCarrera;
    }
    

    //Metodos (comportamiento de un objeto)
    public String darNombreCompleto(){
        return apellido+", "+nombre;
    }
    public String saludado(String personaASaludar){
        if (edad>40) return "Buenos dias, querido "+personaASaludar;
        return "Hola, como estas "+personaASaludar+"?";
    }
    
    
    
}
