package Ficha2;

public class Ex8 {

    public static int maiorMenorQueZ(int[] array, int z) {
        int inicio = 0;
        int fim = array.length - 1;
        int melhor = z; // Por defeito, se não houver nenhum menor, devolve o próprio z

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (array[meio] < z) {
                // [TEU CÓDIGO AQUI]
                // 1. O número é menor que Z, logo é um candidato válido: melhor = array[meio]
                // 2. Continua a procurar números maiores à DIREITA: inicio = meio + 1
                melhor = array[meio];
                inicio = meio +1;
            } else {
                // [TEU CÓDIGO AQUI]
                // O número é maior ou igual a Z, temos de procurar menores à ESQUERDA: fim = meio - 1
                fim = meio-1;
            }
        }

        return melhor;
    }

    public static void main(String[] args) {
        int[] m = {3, 7, 12, 15};
        System.out.println("Z=15:  " + maiorMenorQueZ(m, 15));  // 12
        System.out.println("Z=14:  " + maiorMenorQueZ(m, 14));  // 12
        System.out.println("Z=3:   " + maiorMenorQueZ(m, 3));   // 3
        System.out.println("Z=1:   " + maiorMenorQueZ(m, 1));   // 1
        System.out.println("Z=100: " + maiorMenorQueZ(m, 100)); // 15
    }
}