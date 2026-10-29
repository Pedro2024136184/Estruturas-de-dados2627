package Ficha3b;

// A Classe Pai
class Figura implements Comparable<Figura> {
    int area;
    public Figura(int area) { this.area = area; }

    @Override
    public int compareTo(Figura outra) {
        // Devolve positivo se a minha área for maior, etc.
        return Integer.compare(this.area, outra.area);
    }
}

// A Classe Filha (Atenção: Ela é uma Figura, logo herda a capacidade de se comparar)
class Rectangulo extends Figura {
    public Rectangulo(int area) { super(area); }
}

public class Ex3 {

    // VERSÃO A (Estrita): Só aceita tipos que saibam comparar-se CONSIGO PRÓPRIOS
    // [TEU CÓDIGO AQUI] Completa a assinatura com: <T extends Comparable<T>>
    // Repara que o <T extends Comparable<T>> entra antes do 'T'
    public static <T extends Comparable<T>> T maiorEstrito(T a, T b) {
        if (a.compareTo(b) > 0) return a;
        return b;
    }

    // VERSÃO B (Flexível): Aceita tipos que se saibam comparar consigo, OU COM O SEU PAI
    // [TEU CÓDIGO AQUI] Completa a assinatura com: <T extends Comparable<? super T>>
    // Repara no '? super T'
    public static <T extends Comparable<? super T>> T maiorFlexivel(T a, T b) {
        if (a.compareTo(b) > 0) return a;
        return b;
    }

    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(10);
        Rectangulo r2 = new Rectangulo(20);

        // Descomenta as duas linhas abaixo e vê qual delas te dá um ERRO vermelho no IDE!

        Rectangulo m1 = maiorEstrito(r1, r2);
        Rectangulo m2 = maiorFlexivel(r1, r2);
    }
}
