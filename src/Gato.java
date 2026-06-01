// Con esto especificamos que Gato hereda de Animal
public class Gato extends Animal{
    //hay que crear el constructor Gato en donde reciba los datos minimos ya que es herencia de Animal
    //debe inicializar si o si los datos de Animal
    //con super asignamos la informacion a la clase Animal que es de la que hereda
    public Gato(String nombre, int edad){
        //con la palabra super estamos asignando la informacion heredada ya que nombre y edad no son propias de Gato
        super(nombre, edad);
    }

    //vamos a utilizar un decorador para sobreescribir un comportamiento
    //con el decorador override podemos sobreescribir un metodo
    @Override
    public String hacerSonido() {
        return "Miau";
    }
}
