package juegoderol;

public class JuegoDeRol {

    public static void main(String[] args) {
        Personaje[] equipo={
            new Guerrero("Thor"),
            new Mago("Gandalf"),
            new Arquero("Legolas")
        };
        for (Personaje p : equipo) {
            p.Atacar();
        }
    }
}
