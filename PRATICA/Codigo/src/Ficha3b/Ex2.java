package Ficha3b;

public class Ex2 {
    public static <T extends Comparable<T>> boolean existeMaisDeUmaVez(T[] array, T elemento) {
        int contagem = 0;
            for (int i = 0; i<array.length; i++) {
                if (array[i].compareTo(elemento) == 0) {
                    contagem++;
                }
                if (contagem>1) return true;
            }
        return false;
    }
    // Código de teste (podes usar este main para testar)
    public static void main(String[] args) {
        Integer[] numeros = {1, 5, 3, 5, 9};
        System.out.println(existeMaisDeUmaVez(numeros, 5)); // Deve dar true
        System.out.println(existeMaisDeUmaVez(numeros, 3)); // Deve dar false

        String[] nomes = {"Ana", "João", "Ana"};
        System.out.println(existeMaisDeUmaVez(nomes, "Ana")); // Deve dar true
    }
}

