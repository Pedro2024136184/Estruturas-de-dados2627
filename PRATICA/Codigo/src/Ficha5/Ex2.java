package Ficha5;
import java.util.List;
import java.util.ListIterator;

public class Ex2 {

    public static <T> void imprimeInverso(List<T> lista) {

        // [TEU CÓDIGO AQUI]
        // 1. Cria um ListIterator que comece logo no FIM da lista.
        ListIterator<T> it = lista.listIterator(lista.size());
        //    (Dica: podes passar o tamanho da lista como argumento: lista.listIterator(lista.size()))
        //
        // 2. Faz um ciclo while usando "hasPrevious()" para verificar se há elemento anterior.
        //

        while (it.hasPrevious()) {
            T elemento = it.previous();
            System.out.println(elemento);
        }
        // 3. Dentro do ciclo, usa "previous()" para ir buscar o elemento anterior e imprimi-lo.

    }

    public static void main(String[] args) {
        List<String> nomes = List.of("Primeiro", "Segundo", "Terceiro");
        imprimeInverso(nomes); // Deve imprimir: Terceiro, Segundo, Primeiro
    }
}