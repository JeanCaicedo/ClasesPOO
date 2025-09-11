package juegoadivinanumeromultinivel;

public abstract class NivelesAdivinaNumero {
    int numAdivinar, intentos;

    public NivelesAdivinaNumero(int maximo, int intentos) {
        this.numAdivinar = 1+(int)(Math.random()*maximo);
        this.intentos = intentos;
    }
    
    abstract void jugar();
}
