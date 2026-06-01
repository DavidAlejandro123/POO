public class App {
    public static void main(String[] args) throws Exception {
        //Persona persona1 = new Persona("Julio", "Diaz", 80, "Ingenieria en Informartica",6,true);
        Persona persona1 = new Persona("Julio", "Diaz", 80, "Ingenieria en Informatica",6,true);

        System.out.println(persona1.darNombreCompleto()+" tiene "+persona1.edad+" años y estudia "+persona1.carrera.nombre);


    }
        
}
