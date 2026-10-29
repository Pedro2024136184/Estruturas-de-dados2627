package Ficha4;

public class AlgoritmosIteraveis {
    public static int conta(Iterable<?> colecao) {
        int total = 0;
        for (Object col:colecao) {
            total++;
        }
        return total;
    }

    public static <T extends Comparable<? super T>> T maior(Iterable<T> Colecao) {
        T maiorElemento = null;
        for (T elemento : Colecao) {
            // 1. Se ainda não temos campeão (é o 1º) OU se o novo elemento for maior que o campeão:
            if (maiorElemento == null || elemento.compareTo(maiorElemento) > 0) {
                maiorElemento = elemento; // Temos novo campeão!
            }
        }
    }
}
