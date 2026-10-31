package Ficha1;

public class Ex5 {

    public static int encontraMaioritario(int[] a) {
        int candidato = 0;
        int votos = 0;

        // FASE 1: Encontrar o candidato mais provável em O(N)
        for (int i = 0; i < a.length; i++) {
            if (votos == 0) {
                candidato = a[i];
                votos = 1;
            } else if (a[i] == candidato) {
                // [TEU CÓDIGO AQUI] Voto no mesmo candidato: soma 1 aos votos!
                votos++;
            } else {
                // [TEU CÓDIGO AQUI] Voto noutro candidato: subtrai 1 aos votos!--;
                votos--;
            }
        }

        // FASE 2: Confirmar se o candidato aparece mais de N/2 vezes
        int contagemReal = 0;
        for (int i = 0; i < a.length; i++) {
            // [TEU CÓDIGO AQUI] Se a[i] == candidato, incrementa contagemReal
            if (a[i] == candidato) contagemReal++;
        }

        if (contagemReal > a.length / 2) {
            return candidato; // Temos vencedor!
        }

        return -1; // Não existe elemento maioritário
    }

    public static void main(String[] args) {
        int[] m1 = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        int[] m2 = {3, 3, 4, 2, 4, 4, 2, 4};

        System.out.println("M1: " + encontraMaioritario(m1)); // Deve dar 4
        System.out.println("M2: " + encontraMaioritario(m2)); // Deve dar -1
    }
}
