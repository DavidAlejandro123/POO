public class Carrera {
    String nombre;
    int duracion;
    boolean estaCursando;

    public Carrera(String nombre,int duracion, boolean estaCursando){
        this.nombre = nombre;
        this.duracion = duracion;
        this.estaCursando = estaCursando;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public boolean isEstaCursando() {
        return estaCursando;
    }

    public void setEstaCursando(boolean estaCursando) {
        this.estaCursando = estaCursando;
    }

    
}
