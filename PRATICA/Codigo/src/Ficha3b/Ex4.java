package Ficha3b;

public class Ex4 {

    // Método estático genérico
    public static <T extends Comparable<? super T>> boolean search(T[] array, T valor) {

        // [TEU CÓDIGO AQUI]
        // 1. Percorre o array com um for ou for-each
        for (int i = 0; i<array.length; i++ ){
            if (array[i].compareTo(valor) > 0) {
                    return true;
            }
        }
        // 2. Se elemento.compareTo(valor) > 0: devolve logo true!

        return false;
    }

    public static void main(String[] args) {
        Integer[] m = {3, 2, 6, 3};
        String[] n = {"Ada", "Albino"};

        System.out.println("m tem > 2? " + search(m, 2));                     // Deve dar true (3 e 6 são maiores)
        System.out.println("n tem > Francisco? " + search(n, "Francisco")); // Deve dar false
    }
}