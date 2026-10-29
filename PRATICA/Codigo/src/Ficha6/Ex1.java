package Ficha6;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
}

