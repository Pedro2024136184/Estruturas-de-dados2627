package Ficha2;

public class Ex1 {

    // Método público (a "porta de entrada" que recebe apenas o array e o valor)
    public static boolean pesquisaBinariaRecursiva(int[] array, int chave) {
        return pesquisaRecursivaAux(array, chave, 0, array.length - 1);
    }

    // Método privado recursivo com os apontadores 'inicio' e 'fim'
    private static boolean pesquisaRecursivaAux(int[] array, int chave, int inicio, int fim) {
        // 1. Caso base: não encontrou!
        if (inicio > fim) {
            return false;
        }

        int meio = (inicio + fim) / 2;

        if (array[meio] == chave) {
            // [TEU CÓDIGO AQUI] Encontrou! O que devolves?
            return true;
        } else if (chave > array[meio]) {
            // [TEU CÓDIGO AQUI] A chave é maior, procura na direita: inicio passa a ser meio + 1
            inicio = meio+1;
            return pesquisaRecursivaAux(array, chave, inicio, fim);
        } else {
            // [TEU CÓDIGO AQUI] A chave é menor, procura na esquerda: fim passa a ser meio - 1
            fim = meio-1;
            return pesquisaRecursivaAux(array, chave, inicio, fim);
        }
    }

    public static void main(String[] args) {
        int[] m = {3, 7, 12, 15, 20};
        System.out.println("Existe 12? " + pesquisaBinariaRecursiva(m, 12)); // true
        System.out.println("Existe 99? " + pesquisaBinariaRecursiva(m, 99)); // false
    }
}