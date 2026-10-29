import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class DezReaisMutavel implements Iterable<Double> {
    private Double[] numeros = new Double[10];
    private int contador = 0;

    // 1. O carimbo de alterações na classe
    private int modCount = 0;

    public void add(Double valor) {
        if (contador >= 10) throw new RuntimeException("Cheia!");
        numeros[contador] = valor;
        contador++;
        // [TEU CÓDIGO AQUI]
        modCount++;

    }

    @Override
    public Iterator<Double> iterator() {
        return new Iterator<Double>() {
            private int posicaoNoPasseio = 0;

            // 2. A "fotografia" do iterador ao carimbo
            private int expectedModCount = modCount;

            // 3. Flag de controlo: só podemos remover se acabámos de ver um número!
            private boolean podeRemover = false;

            @Override
            public boolean hasNext() {
                return posicaoNoPasseio < contador;
            }

            @Override
            public Double next() {
                // [TEU CÓDIGO AQUI]
                if (expectedModCount != modCount) {
                    throw new IllegalStateException();
                }
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                // 2. Se não houver próximo (!hasNext()), lança NoSuchElementException
                // 3. Guarda o número atual e avança a posicaoNoPasseio
                Double numeroAtual = numeros[posicaoNoPasseio];
                posicaoNoPasseio++;
                podeRemover = true;
                return numeroAtual;
                // 4. Ativa a permissão: podeRemover = true
                // 5. Devolve o número
            }

            @Override
            public void remove() {
                // [TEU CÓDIGO AQUI]
                if (expectedModCount != modCount) {
                    throw new ConcurrentModificationException();
                }
                if (!podeRemover) {
                    throw new IllegalStateException();
                }

                int indexARemover = posicaoNoPasseio - 1;
                for (int i = indexARemover; i < contador - 1; i++) {
                    numeros[i] = numeros[i + 1];
                }
                numeros[contador - 1] = null;
                podeRemover = false;
                contador--;
                modCount++;
                expectedModCount = modCount;
                // 1. Verifica se expectedModCount != modCount -> lança ConcurrentModificationException
                // 2. Verifica se a flag "podeRemover" é falsa -> lança IllegalStateException

                // 3. Desloca os elementos no array para tapar o buraco do elemento apagado
                // 4. Decrementa o contador e a posicaoNoPasseio
                // 5. Volta a bloquear: podeRemover = false

                // 6. Atualiza tanto o modCount como o expectedModCount para ficarem iguais
            }
        };
    }
}