import java.util.Scanner;

public class Ejercicio4 {
    

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int iFactorial = 1;
        int iNumero = scan.nextInt();
        scan.close();

        for (int x=2; x <= iNumero; x++){
            iFactorial = iFactorial * x;
        }

        System.out.println("El factorial del numero " + iNumero + " es:" + iFactorial);
    }
}