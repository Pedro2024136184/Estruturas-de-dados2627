package Ficha2;

public class Ex10 {
    public static int pesquisaPrimeiroMaior(int[] array) {
    int inicio = 0;
    int fim = array.length-1;
    int melhor =-1;
    while(inicio<=fim) {
        int meio = (inicio+fim)/2;

        if (array[meio]>meio){
            melhor=meio;
            fim=(meio-1);
        } else if (array[meio]<=meio){
            inicio=(meio+1);
        }
    }
        return melhor;
    }

}
