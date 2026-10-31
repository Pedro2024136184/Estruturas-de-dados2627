package Ficha2;

public class Ex5 {

    public static double percentagemMenores(int[] array, int valor) {
        // Chamamos a pesquisa do teu Ex4 (que corre em O(log N))
        int res = Ex4.pesquisaBinaria(array, valor);

        int menores;

        if (res >= 0) {
            // [TEU CÓDIGO AQUI]
            // O valor existe no índice 'res'. Quantos números menores existem antes dele?
            menores = res;
        } else {
            // [TEU CÓDIGO AQUI]
            // O valor não existe. Descodifica o ponto de inserção: -res - 1
            int pos = -res-1;
            menores = pos;
        }

        // [TEU CÓDIGO AQUI]
        // Devolve (double) menores / array.length
        return  (double) menores / array.length;
    }

    public static void main(String[] args) {
        int[] m = {3, 7, 12, 15};
        System.out.println("Valor 15:  " + percentagemMenores(m, 15));  // 0.75
        System.out.println("Valor 14:  " + percentagemMenores(m, 14));  // 0.75
        System.out.println("Valor 3:   " + percentagemMenores(m, 3));   // 0.0
        System.out.println("Valor 1:   " + percentagemMenores(m, 1));   // 0.0
        System.out.println("Valor 100: " + percentagemMenores(m, 100)); // 1.0
    }
}