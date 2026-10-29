package Ficha6;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
}
