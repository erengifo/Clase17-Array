import java.util.ArrayList;

public class EjercicioDos {
    public static void main(String[] args) {
        // Crear un ArrayList de números enteros
        //Integer es una clase que permite tratar enteros como objetos
        ArrayList<Integer> numeros = new ArrayList<>();

        // Agregar números a la lista
        for (int i = 1; i <= 5; i++) {
            numeros.add(i);
        }

        // Uso del "bucle for" para imprimir los números
        System.out.println("lista de números usando un bucle for:");
        for (int i = 0; i < numeros.size(); i++) { //Devuelve un entero: size() devuelve un valor de tipo int que representa el número de elementos actuales en la colección
            System.out.println(numeros.get(i));
        }

        // Uso del "bucle for-each" para imprimir los números
        System.out.println("\nlista de números usando for-each:");
        for (int num : numeros) {
            System.out.println(num);
        }

        // Uso de bucle while para imprimir los números en orden inverso
        System.out.println("\nlista de números usando bucle while en orden inverso:");
        int index = numeros.size() - 1;
        while (index >= 0) {
            System.out.println(numeros.get(index));
            index--;
        }
    }
}