package Ficha5;

import java.util.List;

public class Pilha<T> {
    private List<T> lista;

    // O construtor recebe a lista (pode ser ArrayList ou LinkedList)
    public Pilha(List<T> lista) {
        this.lista = lista;
    }

    public boolean empty() {
        // [TEU CÓDIGO AQUI] Devolve se a lista está vazia
        return lista.isEmpty();
    }

    public void push(T valor) {
        // [TEU CÓDIGO AQUI] Adiciona o elemento na posição 0 da lista
        lista.add(valor);
    }

    public T pop() {
        // [TEU CÓDIGO AQUI] Remove e devolve o elemento da posição 0
        T remove = lista.remove(lista.size() - 1);
        return remove;
        //return lista.removeLast();
    }

    public T peek() {
        // [TEU CÓDIGO AQUI] Apenas devolve o elemento da posição 0 sem remover

        return lista.getLast();
    }
}