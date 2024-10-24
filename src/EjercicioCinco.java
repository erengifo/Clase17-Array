import java.util.ArrayList;

public class EjercicioCinco{
    public static void main(String[] args) {
        // Se crea el ArrayList con números del 1 al 5
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }
        // Se convierte el ArrayList en un array de tipo Integer[]
        Integer[] array = new Integer[list.size()];
        array = list.toArray(array);

          System.out.println("\nEl contenido del Array esta compuesto por los siguientes números:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}