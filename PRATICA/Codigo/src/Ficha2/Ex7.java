package Ficha2;

public class Ex7 {

    public static boolean estaRepetido(int[] array, int valor) {
        int pos = Ex4.pesquisaBinaria(array, valor);

        // 1. Se não foi encontrado, é impossível estar repetido
        if (pos < 0) {
            return false;
        }

        // [TEU CÓDIGO AQUI]
        // 2. Verifica se o vizinho da esquerda OU o vizinho da direita é igual a 'valor'||
        if ((pos > 0 && array[pos - 1] == valor) || (pos < array.length - 1 && array[pos + 1] == valor)) {
            return true;
        }
        // Cuidado com os limites do array:
        // - Esquerda: (pos > 0 && array[pos - 1] == valor)
        // - Direita:  (pos < array.length - 1 && array[pos + 1] == valor)
        return false;
    }

    public static void main(String[] args) {
        int[] m = {3, 3, 7, 12, 12, 15};
        System.out.println("Valor 15: " + estaRepetido(m, 15)); // false
        System.out.println("Valor 14: " + estaRepetido(m, 14)); // false
        System.out.println("Valor 12: " + estaRepetido(m, 12)); // true
        System.out.println("Valor 3:  " + estaRepetido(m, 3));  // true
    }
}