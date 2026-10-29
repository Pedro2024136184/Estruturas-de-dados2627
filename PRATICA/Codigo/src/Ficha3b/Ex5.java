package Ficha3b;



public class Ponto<T extends Number, U extends Number> {

    private T x;
    private U y;
    // Construtor
    public Ponto(T x, U y) {
        this.x = x;
        this.y = y;
    }

    // Método para imprimir bonitinho
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
    // 2. O Método COPY.
    // O "? extends T" significa: "Eu aceito receber o teu valor x, desde que
    // ele seja do mesmo tipo que o meu x, ou uma classe filha do meu x".
    public void copy(Ponto<? extends T, ? extends U> outro) {
        this.x = outro.x;
        this.y = outro.y;
    }

    // MAIN para testares o que pedia o enunciado
    public static void main(String[] args) {
        Ponto<Integer, Integer> p = new Ponto<Integer, Integer>(3, 4);
        Ponto<Number, Number> x = new Ponto<Number, Number>(0, 0);

        System.out.println(p); // imprime (3,4)
        System.out.println(x); // imprime (0,0)

        x.copy(p);
        System.out.println(x); // TEM de imprimir (3,4)
        // Descomenta a linha abaixo: o teu IDE tem de te dar ERRO vermelho imediato!
        Ponto<String, Integer> erro = new Ponto<String, Integer>("olá", 3);
    }
}

public class Ex5 {

}
