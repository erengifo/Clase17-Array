import java.util.ArrayList;

public class EjercicioTres {
    public static void main(String[] args) {
        // Crear  ArrayList de números enteros del 1 al 10
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
        }

        // En una nueva lista, listar solo los números pares
        ArrayList<Integer> numerosPares = new ArrayList<>();
        for (int num : numeros) {
            if (num % 2 == 0) {
                numerosPares.add(num);
            }
        }

        // Imprimir la lista original
        System.out.println("\nLista de números sin filtrar: " + numeros);
        // Imprimir la lista de números pares
        System.out.println("\nLista de números pares: " + numerosPares);
    }
}