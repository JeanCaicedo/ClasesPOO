package juegointerfacepoo;
import java.util.Scanner;
public class JuegoInterfacePOO {
    public static void main(String[] args) {
        int opc=0;
        Scanner teclado = new Scanner(System.in);
        while(opc!=3){
            System.out.println("1. Juego Dados\n2. Adivina Numero\n"+
                    "3. Salir");
            opc=teclado.nextInt();
            switch (opc) {
                case 1:
                    JuegoDeDados juego1 = new JuegoDeDados();
                    juego1.Iniciar();
                    juego1.Jugar();
                    juego1.Finalizar();
                    break;
                case 2:
                    JuegoAdivinaNumero juego2 = new JuegoAdivinaNumero();
                    juego2.Iniciar();
                    juego2.Jugar();
                    juego2.Finalizar();
                    break;
                case 3:
                    System.out.println("Fin del programa");
                    break;
                default:
                    System.out.println("Opcion Invalida");
                    break;
            }
        }
    }
    
}
