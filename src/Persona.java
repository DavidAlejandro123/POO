public class Persona {
    
    //Atributos (estado/caracteristicas de un objeto)
    private String nombre;
    private String apellido;
    private int edad;
    
    //Constructor
    public Persona(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        
    }
    
    //Metodos (comportamiento de un objeto)
    public String darNombreCompleto(){
        return getApellido()+", "+getNombre();
    }
    public String saludado(String personaASaludar){
        if (edad>40) return "Buenos dias, querido "+personaASaludar;
        return "Hola, como estas "+personaASaludar+"?";
    }

    //GETTERS y SETTERS
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
     
    
}
