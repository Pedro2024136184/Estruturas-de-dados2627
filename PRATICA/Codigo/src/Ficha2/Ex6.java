package Ficha2;

public class Ex6 {

    // Método auxiliar que nos dá o índice do primeiro elemento >= valor
    private static int indicePrimeiro(int[] array, int valor) {
        int res = Ex4.pesquisaBinaria(array, valor);
        if (res >= 0) {
            return res; // Encontrou exatamente o número
        } else {
            return -res - 1; // Ponto de inserção (primeiro elemento maior que 'valor')
        }
    }

    public static int elementosNoIntervalo(int[] array, int min, int max) {
        // [TEU CÓDIGO AQUI]
        int posInicio = indicePrimeiro(array, min);
        int posFim    = indicePrimeiro(array, max + 1); // o primeiro estritamente maior que max
        return (posFim - posInicio);

    }

    public static void main(String[] args) {
        int[] m = {3, 7, 12, 15};
        System.out.println("[0, 15]:  " + elementosNoIntervalo(m, 0, 15));  // 4
        System.out.println("[3, 7]:   " + elementosNoIntervalo(m, 3, 7));   // 2
        System.out.println("[4, 14]:  " + elementosNoIntervalo(m, 4, 14));  // 2
        System.out.println("[4, 5]:   " + elementosNoIntervalo(m, 4, 5));   // 0
        System.out.println("[0, 100]: " + elementosNoIntervalo(m, 0, 100)); // 4
    }
}