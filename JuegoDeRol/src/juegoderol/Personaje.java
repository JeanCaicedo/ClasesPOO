package juegoderol;

public abstract class Personaje {
    protected String nombre;

    public Personaje(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract void Atacar();
    
}
