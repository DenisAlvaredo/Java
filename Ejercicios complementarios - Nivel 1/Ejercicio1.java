import java.util.Scanner;

public class Ejercicio1 {
    

    public static void main(String[] args){
        var scan = new Scanner(System.in);
        String saludo = scan.next();
        scan.close();
        System.out.println("HOLA " + saludo);
    }
}
