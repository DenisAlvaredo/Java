import java.util.Scanner;

public class Ejercicio2 {
    

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();
        int suma = a + b;
        int resta = a - b;

        System.out.println(a + " + " + b + " = " + suma);
        System.out.println(a + " - " + b + " = " + resta);
        System.out.println(a + " * " + b + " = " + a*b);
        System.out.println(a + " / " + b + " = " + a/b);
        System.out.println(a + " % " + b + " = " + a%b);
    }
}
