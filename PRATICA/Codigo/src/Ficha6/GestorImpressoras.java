package Ficha6;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
//Ex1
public class GestorImpressoras {
    // 1. O Mapa que associa o Nome (String) ao Objeto Impressora
    private Map<String, Ficha6.Impressora> mapaimpressoras = new HashMap<>();
    // a) Devolve a impressora dado o nome
    public Ficha6.Impressora getImpressora(String nome) {
        // [TEU CÓDIGO AQUI]
        Impressora imp = mapaimpressoras.get(nome);
        return imp;
    }

    // b) Devolve o conjunto com os nomes de todas as impressoras
    public Set<String> getNomesImpressoras() {
        Set<String> nomes = mapaimpressoras.keySet();
        return nomes;
    }

    // c) Acrescenta uma nova impressora
    public void acrescentaImpressora(Ficha6.Impressora imp) {
        // [TEU CÓDIGO AQUI]
        mapaimpressoras.put(imp.getNome(), imp);
    }

    // d) Remove a impressora indicada pelo nome
    public void removeImpressora(String nome) {
        mapaimpressoras.remove(nome);
    }

    // e) Devolve se a impressora existe
    public boolean existeImpressora(String nome) {
            // [TEU CÓDIGO AQUI]
        Ficha6.Impressora imp = mapaimpressoras.get(nome);
        return imp!=null;
        //return mapaimpressoras.containsKey(nome); devolve true ou false
    }

    // Ex2
    public void imprime(Trabalho t) {
        Impressora melhor = null;

        // Percorremos todas as impressoras registadas no Map
        for (Impressora imp : mapaimpressoras.values()) {
            if (melhor == null) {
                melhor = imp;
            } else {
                // [TEU CÓDIGO AQUI]
                // Critério 1: imp tem menos trabalhos que a melhor?
                if (imp.getNumTrabalhos() < melhor.getNumTrabalhos()){
                    melhor = imp;
                } else if (imp.getNumTrabalhos() == melhor.getNumTrabalhos()) {
                    if (imp.getFolhasProximoTrabalho() < melhor.getFolhasProximoTrabalho()) {
                        melhor = imp;
                    }
                }
                // Critério 2: se têm o mesmo número de trabalhos, imp tem próximo trabalho com menos folhas?
                // Se algum critério bater certo: melhor = imp;
            }
        }

        if (melhor != null) {
            melhor.enviaTrabalho(t);
        }
    }
}
