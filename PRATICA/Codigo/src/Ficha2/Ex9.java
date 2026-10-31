package Ficha2;

public class Ex9 {

    public static int procura(int[] array, int chave) {
        int inicio = 0;
        int fim = array.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            // Encontrámos o elemento!
            if (array[meio] == chave) {
                return meio;
            }

            boolean meioPositivo = array[meio] >= 0;
            boolean chavePositiva = chave >= 0;

            // CENÁRIO 1: Ambos têm o mesmo sinal (estão no mesmo bloco ordenado)
            if (meioPositivo == chavePositiva) {
                if (chave > array[meio]) {
                    // [TEU CÓDIGO AQUI] Procura à direita
                    inicio = meio+1;
                } else {
                    // [TEU CÓDIGO AQUI] Procura à esquerda
                    fim = meio-1;
                }
            }
            // CENÁRIO 2: A chave é positiva (está à esquerda), mas o meio já é negativo (caiu à direita)
            else if (chavePositiva && !meioPositivo) {
                // [TEU CÓDIGO AQUI] Como puxas a busca para o lado esquerdo?
                fim = meio-1;
            }
            // CENÁRIO 3: A chave é negativa (está à direita), mas o meio é positivo (caiu à esquerda)
            else {
                // [TEU CÓDIGO AQUI] Como puxas a busca para o lado direito?
                inicio = meio+1;
            }
        }

        return -1; // Não existe no array
    }

    public static void main(String[] args) {
        int[] m = {3, 6, 8, -10, -3, -2, -1};
        System.out.println("Procura 6:   " + procura(m, 6));   // Deve dar 1
        System.out.println("Procura -3:  " + procura(m, -3));  // Deve dar 4
        System.out.println("Procura -10: " + procura(m, -10)); // Deve dar 3
        System.out.println("Procura 99:  " + procura(m, 99));  // Deve dar -1
    }
}