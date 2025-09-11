package juegointerfacepoo;
import java.util.Scanner;
public class JuegoAdivinaNumero implements Juego{
    private int numAdivinar,intentos;
    private Scanner teclado;

    public JuegoAdivinaNumero() {
        teclado = new Scanner(System.in);
    }
    
    public void Iniciar() {
        numAdivinar = 1 + (int)(Math.random()*100);
    }

    public void Jugar() {
        int numero;
        do{
            System.out.println("Digite numero(1-100):");
            numero=teclado.nextInt();
            if (numAdivinar<numero){
                System.out.println("El numero a Adivinar es menor");
            }else if(numAdivinar>numero){
                System.out.println("El numero a Adivinar es mayor");
            }
            intentos++; // intentos=intentos+1  intentos+=1
        }while(numAdivinar!=numero);
    }

    public void Finalizar() {
        System.out.println("Adivinaste el numero "+numAdivinar+" en "+
                intentos+" intentos");
    }
    
}
