package juegoadivinanumeromultinivel;
import java.util.Scanner;
public class NivelIntermedio extends NivelesAdivinaNumero{

    public NivelIntermedio() {
        super(50, 7);
    }

    @Override
    void jugar() {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Nivel Intermedio(1-50) 7 intentos");
        for (int i = 0; i < intentos; i++) {
            System.out.println("Intento["+(i+1)+"]");
            int numero=teclado.nextInt();
            if(numero==numAdivinar){
                System.out.println("Bien! Adivinaste el numero "+
                    numAdivinar+" en "+(i+1)+" intentos");
                return;
            }else if(numero<numAdivinar){
                System.out.println("El numero adivinar es Mayor");
            }else if(numero>numAdivinar){
                System.out.println("El numero adivinar es Menor");
            }
        }
        System.out.println("Perdiste, el numero era "+numAdivinar);
    }
}
