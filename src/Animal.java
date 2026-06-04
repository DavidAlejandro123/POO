public class Animal {
    // Atributos
    String nombre;
    int edad;
    static int cantidadAnimales = 0;  //atributo estatico

    // Constructor
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        cantidadAnimales++;  //aumenta con cada instanciacion que se hace
    }

    // Metodos
    public String hacerSonido() {
        return "hacer sonido generico";
    }
    public static int getCantAnimales(){   //Metodo de clase  
        return cantidadAnimales; 
    }

}