import java.util.Scanner;

public class Ejercicio6 {
    
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int resultado = 1;
        scan.close();

        for (int i=0; i < b; i++) {
            resultado = resultado * a;
        }
        System.out.print(a + " elevado a " + b + " = " + resultado);
    }
}
