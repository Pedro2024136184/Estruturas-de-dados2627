package Ficha3b;

public class Ex1 {

    // Método genérico universal com comparação por referência (==)
    public static <T> boolean existeMaisDeUmaVez(T[] array, T elemento) {
        int contagem = 0;
        // [TEU CÓDIGO AQUI]
        // 1. Faz um for ou for-each para percorrer o array
        for (int i = 0;i<array.length; i++){
            if(array[i] == elemento){
                contagem++;
                if (contagem>=2) {
                    return true;
                }
            }
        }
        // 2. Se o elemento do array for == ao 'elemento': incrementa contagem

        // 3. Se contagem >= 2: devolve logo true!

        return false;
    }

    public static void main(String[] args) {
        String s1 = new String("Ola");
        String s2 = new String("Ola"); // Tem o mesmo texto, mas é outro objeto na memória!
        String s3 = s1;                 // Aponta para a MESMA referência que s1!

        String[] palavras = {s1, s2, s3};

        // s1 e s3 são a mesma referência (deve dar true, aparece 2 vezes)
        System.out.println("s1 aparece mais de uma vez? " + existeMaisDeUmaVez(palavras, s1)); // true

        // s2 só aparece 1 vez como referência (deve dar false)
        System.out.println("s2 aparece mais de uma vez? " + existeMaisDeUmaVez(palavras, s2)); // false
    }
}