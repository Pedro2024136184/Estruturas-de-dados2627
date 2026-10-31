package Ficha1;

public class Ex1 {

    // 1. Versão O(N^2)
    public static int maxSubArrayN2(int[] a) {
        int maxSoma = 0;

        for (int i = 0; i < a.length; i++) {
            int somaAtual = 0;
            for (int j = i; j < a.length; j++) {
                // [TEU CÓDIGO AQUI]
                somaAtual += a[j];
                if (somaAtual > maxSoma) {
                    maxSoma = somaAtual;
                }
            }
        }
        return maxSoma;
    }

    // 2. Versão O(N) - Algoritmo de Kadane
    public static int maxSubArrayLinear(int[] a) {
        int maxSoma = 0;
        int somaAtual = 0;

        for (int i = 0; i < a.length; i++) {
            // [TEU CÓDIGO AQUI]
            // 1. Adiciona a[i] à somaAtual
            somaAtual += a[i];
            // 2. Se somaAtual for maior que maxSoma, atualiza maxSoma
            if (somaAtual > maxSoma){
                maxSoma=somaAtual;
            }
            // 3. O Segredo: se somaAtual < 0, faz reset: somaAtual = 0;
            if (somaAtual < 0) somaAtual = 0;
        }
        return maxSoma;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 11, -4, 13, -5, 2};
        System.out.println("O(N^2): " + maxSubArrayN2(nums));     // Deve dar 20
        System.out.println("O(N):   " + maxSubArrayLinear(nums)); // Deve dar 20
    }
}