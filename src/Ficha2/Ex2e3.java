package Ficha2;

public class Ex2e3 {
    public static int pesquisaBinaria(int[] array, int valorProcurado) {
        int inicio = 0;
        int fim = array.length - 1;
        // Enquanto o nosso intervalo for viálido
        while (inicio <= fim) {

            // Calculamos a posição mesmo a meio do intervalo
            int meio = (inicio + fim) / 2;
            if (array[meio] == valorProcurado) {
                return (meio);
            }
            else if (valorProcurado > array[meio]) {
                // 2. O número é MAIOR. Temos de ignorar a metade esquerda.
                // Como atualizas a variável 'inicio'?
                inicio = meio + 1;
                meio = (inicio+fim)/2;
            }
            else {
                // 3. O número é MENOR. Temos de ignorar a metade direita.
                // Como atualizas a variável 'fim'?
                fim = meio -1;
                meio = (inicio+fim)/2;
            }
        }
        // Se o ciclo terminar e nunca entrou no primeiro "if", é porque não existe.
        return -1;
    }
}
