import java.util.Scanner;

public class Ejercicio5 {
    
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int suma = 0;
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();

        for (int i=0; i < b; i++) {
            suma = suma + a;
        }
        System.out.print(a + " + " + b + " = " + suma);
    }
}
