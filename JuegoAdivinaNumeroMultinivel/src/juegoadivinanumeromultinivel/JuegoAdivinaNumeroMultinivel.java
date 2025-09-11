package juegoadivinanumeromultinivel;
import java.util.Scanner;
public class JuegoAdivinaNumeroMultinivel {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int opc=1;
        NivelesAdivinaNumero nivel=null;
        while(opc!=4){
            System.out.println("Juego Adivina Numero Multinivel");
            System.out.println("1. Facil\n2. Intermedio\n3. Dificil\n4. Salir");
            opc=teclado.nextInt();
            switch (opc) {
                case 1:
                    nivel=new NivelFacil();
                    break;
                case 2:
                    nivel=new NivelIntermedio();
                    break;
                case 3:
                    nivel=new NivelDificil();
                    break;
                case 4:
                    System.out.println("Final");
                    break;
                default:
                    System.out.println("Opcion errada, Nivel Facil por defecto");
                    nivel=new NivelFacil();
                    break;
            }
            nivel.jugar();
        }
    }
    
}
