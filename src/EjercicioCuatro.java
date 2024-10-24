import java.util.ArrayList;

public class EjercicioCuatro {
    public static void main(String[] args) {
        // Se crea la lista 1 con sus datos
        ArrayList<String> Lista1 = new ArrayList<>();
        Lista1.add("Apple");
        Lista1.add("Banana");
        Lista1.add("Cherry");
        Lista1.add("Date");

        //// Se crea la lista 2 con sus datos
        ArrayList<String> Lista2 = new ArrayList<>();
        Lista2.add("Banana");
        Lista2.add("Date");
        Lista2.add("Elderberry");
        Lista2.add("Fig");

        // Se crea  una lista para guardar los elementos comunes
        //Se inicializa commonElements como una nueva lista vacía. Luego, se recorre cada elemento de list1 y
        // se verifica si está presente en list2.
        ArrayList<String> commonElements = new ArrayList<>();

        // Encontrar elementos comunes
        for (String element : Lista1) {
            if (Lista2.contains(element)) {
                commonElements.add(element);
            }
        }

        // Imprimir elementos comunes
        System.out.println("\nLos elementos comunes de las listas 1 y 2 son: " + commonElements);
    }
}