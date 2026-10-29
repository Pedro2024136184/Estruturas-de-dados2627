package Ficha2;

public class Ex4 {
    public static int pesquisaBinaria(int[] array, int valorProcurado) {
        int inicio = 0;
        int fim = array.length-1;
        int meio;
        while (inicio<=fim) {
            meio = (inicio+fim)/2;
            if (array[meio] == valorProcurado) {
                return(meio);
            } else if (array[meio] < (valorProcurado)) {
                inicio = meio +1;

            } else {
                fim = meio-1;
            }

        }

        return -(inicio+1);
    }
}
