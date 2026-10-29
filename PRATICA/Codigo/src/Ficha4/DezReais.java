package Ficha4;

import java.util.Iterator;

public class DezReais implements Iterable<Double> {
    private Double[] numeros = new Double[10];
    private int contador = 0; // Quantos números já lá metemos

    // Parte 1: Adicionar números
    public void add(Double valor) {
        if (contador >= 10) {
            throw new RuntimeException("A lista já está cheia (limite 10)!");
        }
        numeros[contador] = valor;
        contador++;
    }

    // Parte 2: O Iterador (O "guia turístico")
    @Override
    public Iterator<Double> iterator() {

        // Criamos e devolvemos um objeto Iterator "on the fly" (classe anónima)
        return new Iterator<Double>() {

            // O iterador precisa da sua própria variável para saber onde vai no passeio
            private int posicaoNoPasseio = 0;

            @Override
            public boolean hasNext() {
                if (posicaoNoPasseio < contador) {
                    return true;
                }
                return false;
            }

            @Override
            public Double next() {
                if (hasNext()) {
                    // 1. Guardar o número atual
                    Double numeroAtual = numeros[posicaoNoPasseio];

                    // 2. Avançar o passo para estar pronto para a próxima vez
                    posicaoNoPasseio++;

                    // 3. Devolver o número que guardámos
                    return numeroAtual;
                } else {
                    return null;
                }
            }
        };
    }
}
