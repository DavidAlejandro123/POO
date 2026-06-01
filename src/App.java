public class App {
    public static void main(String[] args) throws Exception {
        //Persona persona1 = new Persona("Julio", "Diaz", 80, "Ingenieria en Informartica",6,true);
        Persona persona1 = new Persona("Julio", "Diaz", 80);

        persona1.setNombre("Ricardo");
        persona1.setApellido("Godoy");

        System.out.println(persona1.darNombreCompleto()+" tiene "+persona1.getEdad()+" años");


    }
        
}
