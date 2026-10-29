package Ficha6;

import java.util.PriorityQueue;

// Classe auxiliar simples para representar a Impressora
class Impressora {
    private String nome;
    private String porto, marca, modelo, driver, versao;

    public Impressora(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    // Dentro da classe Impressora:
    private PriorityQueue<Trabalho> filaTrabalhos = new PriorityQueue<>();

    public void enviaTrabalho(Trabalho t) {
        // [TEU CÓDIGO AQUI] Adiciona à filaTrabalhos
        filaTrabalhos.add(t);

    }

    public boolean temProximoTrabalho() {
        // [TEU CÓDIGO AQUI] Devolve se a fila NÃO está vazia

        return !filaTrabalhos.isEmpty();
    }

    public Trabalho proximoTrabalho() {
        // [TEU CÓDIGO AQUI] Remove e devolve o topo da fila (poll)
        return filaTrabalhos.poll();
    }

    public int getNumTrabalhos() {
        return filaTrabalhos.size();
    }

    public int getFolhasProximoTrabalho() {
        // Se tiver trabalho, espreita com peek() e devolve getNumPaginas(), senão devolve 0
        if (temProximoTrabalho()) {
            return filaTrabalhos.peek().getNumPaginas();
        }
        return 0;
    }
}

