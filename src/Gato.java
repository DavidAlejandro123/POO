public class Gato extends Animal {

    // Constructor de Gato
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    // Metodos
    @Override
    public String hacerSonido() {
        return "Miau";
    }
}