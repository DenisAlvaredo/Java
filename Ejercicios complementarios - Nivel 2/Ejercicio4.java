import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
    

    public static void main(String[] args) {
        List<String> alumnos = new ArrayList<>();

        cargarLista(alumnos);

        List<String> curso1 = alumnos.subList(0, 4);
        List<String> curso2 = alumnos.subList(4, 8);
        List<String> curso3 = alumnos.subList(8, 12);

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(curso3);
    }

    public static void cargarLista(List<String> alumnos) {
        alumnos.add("Flavia");
        alumnos.add("Beatriz");
        alumnos.add("Carla");
        alumnos.add("Laura");
        alumnos.add("Mariela");
        alumnos.add("Gerónimo");
        alumnos.add("Juan");
        alumnos.add("Pablo");
        alumnos.add("Lorenzo");
        alumnos.add("Patricia");
        alumnos.add("Horacio");
        alumnos.add("That Man");
    }
}
