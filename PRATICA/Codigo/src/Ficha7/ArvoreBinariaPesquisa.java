package Ficha7;

public class ArvoreBinariaPesquisa<T extends Comparable<? super T>> {

    // 1. Classe interna do Nó
    private static class No<T> {
        T valor;
        No<T> esq, dir;

        No(T valor) {
            this.valor = valor;
        }
    }

    private No<T> raiz = null;

    // a) INSERE
    public void insere(T valor) {
        raiz = insereRecursivo(raiz, valor);
    }

    private No<T> insereRecursivo(No<T> atual, T valor) {
        if (atual == null) {
            return new No<>(valor); // Encontrou o buraco livre, cria o nó!
        }

        int comp = valor.compareTo(atual.valor);
        if (comp < 0) {
            atual.esq = insereRecursivo(atual.esq, valor);
        } else if (comp > 0) {
            atual.dir = insereRecursivo(atual.dir, valor);
        }
        return atual;
    }

    // b) CONTÉM
    public boolean contem(T valor) {
        return contemRecursivo(raiz, valor);
    }

    private boolean contemRecursivo(No<T> atual, T valor) {
        if (atual == null) return false;

        int comp = valor.compareTo(atual.valor);
        if (comp == 0) return true;
        // [TEU CÓDIGO AQUI]
        // Se comp < 0 pesquisa na esquerda, senão pesquisa na direita
        if (comp < 0) {
            return contemRecursivo(atual.esq, valor);
        } else {
            return contemRecursivo(atual.dir, valor);
        }

    }

    // c) IMPRIME EM ORDEM (Esquerda -> Visita -> Direita)
    public void imprimeOrdem() {
        imprimeOrdemRecursivo(raiz);
        System.out.println();
    }

    private void imprimeOrdemRecursivo(No<T> atual) {
        if (atual != null) {
            imprimeOrdemRecursivo(atual.esq);
            System.out.print(atual.valor + " ");
            imprimeOrdemRecursivo(atual.dir);
        }
    }

    // d) PROFUNDIDADE / ALTURA
    public int profundidade() {
        return profundidadeRecursivo(raiz);
    }

    private int profundidadeRecursivo(No<T> atual) {
        if (atual == null) return 0;
        return 1 + Math.max(profundidadeRecursivo(atual.esq), profundidadeRecursivo(atual.dir));
    }

    // 7
    // 7. REMOVE
    public void remove(T valor) {
        raiz = removeRecursivo(raiz, valor);
    }

    private No<T> removeRecursivo(No<T> atual, T valor) {
        if (atual == null) return null; // Não encontrou

        int comp = valor.compareTo(atual.valor);

        if (comp < 0) {
            atual.esq = removeRecursivo(atual.esq, valor);
        } else if (comp > 0) {
            atual.dir = removeRecursivo(atual.dir, valor);
        } else {
            // ENCONTRÁMOS O NÓ A REMOVER!

            // Caso 1 e 2: Zero filhos ou Apenas 1 filho
            if (atual.esq == null) return atual.dir;
            if (atual.dir == null) return atual.esq;

            // Caso 3: Tem 2 FILHOS
            // [TEU CÓDIGO AQUI]
            // 1. Encontra o menor valor da subárvore direita: T menor = encontraMinimo(atual.dir);
            T menor = encontraMinimo(atual.dir);

            // 2. atual.valor = menor;
            atual.valor = menor;
            // 3. atual.dir = removeRecursivo(atual.dir, menor);
            atual.dir = removeRecursivo(atual.dir, menor);
        }
        return atual;
    }

    // Método auxiliar para encontrar o menor valor (andar sempre para a esquerda!)
    private T encontraMinimo(No<T> no) {
        while (no.esq != null) {
            no = no.esq;
        }
        return no.valor;
    }
}