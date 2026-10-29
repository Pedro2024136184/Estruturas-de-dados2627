package Ficha6;
//Ex2
public class Trabalho implements Comparable<Trabalho> {
    private String nomeFicheiro;
    private int paginaInicial;
    private int paginaFinal;

    public Trabalho(String nomeFicheiro, int paginaInicial, int paginaFinal) {
        this.nomeFicheiro = nomeFicheiro;
        this.paginaInicial = paginaInicial;
        this.paginaFinal = paginaFinal;
    }

    public int getNumPaginas() {
        return (paginaFinal - paginaInicial + 1);
    }

    @Override
    public int compareTo(Trabalho outro) {
        // [TEU CÓDIGO AQUI]
        // Menos páginas = maior prioridade (deve vir primeiro!).
        // Dica: Integer.compare(this.getNumPaginas(), outro.getNumPaginas())
        return this.getNumPaginas() - outro.getNumPaginas();

    }
}