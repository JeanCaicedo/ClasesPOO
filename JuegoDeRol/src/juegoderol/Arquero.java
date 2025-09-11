package juegoderol;
public class Arquero extends Personaje{
    public Arquero(String nombre) {
        super(nombre);
    }
    @Override
    public void Atacar() {
        System.out.println(nombre+" ataca con Arco y Flecha");
    }
}
