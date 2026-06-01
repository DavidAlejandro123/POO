public class Carrera {
   String nombre;
   int duracion;
   boolean estaEnCurso;

   public Carrera(String nombre, int duracion, boolean estaEnCurso){
    this.nombre = nombre;
    this.duracion = duracion;
    this.estaEnCurso = estaEnCurso;
   }

   //Sobrecarga de constructor
   public Carrera(String nombre){
    this.nombre = nombre;
   }
}
