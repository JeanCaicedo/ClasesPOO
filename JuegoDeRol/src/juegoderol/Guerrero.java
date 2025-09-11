package juegoderol;

public class Guerrero extends Personaje {
    public Guerrero(String nombre) {
        super(nombre);
    }
    @Override
    public void Atacar() {
        System.out.println(nombre+" ataca con Espada");
    }
}
