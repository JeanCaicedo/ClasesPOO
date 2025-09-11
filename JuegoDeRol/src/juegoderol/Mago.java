package juegoderol;

public class Mago extends Personaje{
    public Mago(String nombre) {
        super(nombre);
    }
    @Override
    public void Atacar() {
        System.out.println(nombre+" ataca con Magia");
    }
}
