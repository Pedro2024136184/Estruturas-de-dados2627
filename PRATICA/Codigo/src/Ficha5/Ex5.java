package Ficha5;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Ex5 {

    public static <T> void inverte(List<T> lista) {
        ListIterator<T> itFrente = lista.listIterator();
        ListIterator<T> itTras = lista.listIterator(lista.size());

        // Enquanto os dois iteradores não se cruzarem no meio
        while (itFrente.nextIndex() < itTras.previousIndex()) {

            // [TEU CÓDIGO AQUI]
            // 1. Lê o elemento da frente com itFrente.next()
            T valor1 = itFrente.next();
            // 2. Lê o elemento de trás com itTras.previous()
            T valor2 = itTras.previous();
            // 3. Usa itFrente.set(...) para colocar o valor de trás na frente
            itFrente.set(valor2);
            // 4. Usa itTras.set(...) para colocar o valor da frente atrás
            itTras.set(valor1);
        }
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        inverte(nums);
        System.out.println(nums); // Deve imprimir: [5, 4, 3, 2, 1]
    }
}