import java.util.List;
import java.util.ArrayList;

public class EjercicioUno {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        // Agregar elementos
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Imprimir tamaño de la lista de frutas
        System.out.println("El tamaño de la lista de Fruits es: \n" + fruits.size());
        System.out.println("\nLa lista está compuesta por los siguientes elementos: \n" + fruits);

        // Eliminar "Banana" de la lista
        fruits.remove("Banana");

        // Cambiar "Cherry" por "Orange"
        int index = fruits.indexOf("Cherry");
        if (index != -1) {
            fruits.set(index, "Orange");
        }

        // Imprimir la lista resultante
        System.out.println("\nDespues de la eliminación, la lista resultante es: \n" + fruits);
    }
}

