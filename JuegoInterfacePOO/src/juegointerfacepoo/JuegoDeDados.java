package juegointerfacepoo;
import java.util.Scanner;
public class JuegoDeDados implements Juego{
    private String jugador1, jugador2;
    private int dado1, dado2;
    private Scanner teclado;

    public JuegoDeDados() {
        teclado = new Scanner(System.in);
    }

    public void Iniciar() {
        System.out.println("Digite nombre Jugador 1: ");
        jugador1 = teclado.nextLine();
        System.out.println("Digite nombre Jugador 2: ");
        jugador2 = teclado.nextLine();
    }

    public void Jugar() {
        dado1 = 1 +(int)(Math.random()*6);
        dado2 = 1 +(int)(Math.random()*6);
        System.out.println("El jugador 1 saco "+dado1);
        System.out.println("El jugador 2 saco "+dado2);
    }

    public void Finalizar() {
        if (dado1>dado2)
            System.out.println("Gano "+jugador1+" con el numero "+dado1);
        else if(dado2>dado1)
            System.out.println("Gano "+jugador2+" con el numero "+dado2);
        else
            System.out.println("Empate con el numero "+dado1);
    }
    
    
    
}
