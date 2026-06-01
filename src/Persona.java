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
    
    public int getEdad(){
        return this.edad;
    }
    public String getNombre(){
        return this.nombre.toUpperCase();
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getApellido(){
        return this.apellido.toUpperCase();
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
}
