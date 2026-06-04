public class App {
    public static void main(String[] args) throws Exception {
        Animal animal = new Animal("bestia", 200);
        Perro perro = new Perro("Tobi", 5);
        Gato gato = new Gato("Michi",5);

        System.out.println("Soy "+animal.nombre+" y tengo "+animal.edad+" años. Este animal hace el sonido: "+animal.hacerSonido());
        System.out.println("Soy "+perro.nombre+" y tengo "+perro.edad+" años. Este animal hace el sonido: "+perro.hacerSonido());
        System.out.println("Soy "+gato.nombre+" y tengo "+gato.edad+" años. Este animal hace el sonido: "+gato.hacerSonido());

        System.out.println("La cantidad de animales es: "+Animal.getCantAnimales());

        System.out.println("Yo llevo a mis animalitos en: "+Veterinaria.nombre); //es Veterinaria porque queremos acceder a un atributo de clase y no de objeto
        
        
    }
        
}
