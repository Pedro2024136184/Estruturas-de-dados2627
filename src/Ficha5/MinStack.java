package Ficha5;

import java.util.ArrayList;

public class MinStack {
    // Usamos duas pilhas das que tu criaste!
    private Pilha<Integer> pilhaPrincipal = new Pilha<>(new ArrayList<>());
    private Pilha<Integer> pilhaMinimos = new Pilha<>(new ArrayList<>());

    public void push(int valor) {
        // 1. Mete sempre na pilha principal
        pilhaPrincipal.push(valor);

        // [TEU CÓDIGO AQUI]
        // 2. Se a pilhaMinimos estiver vazia OU se o 'valor' for <= ao topo da pilhaMinimos (peek()):
        //    então empilha também na pilhaMinimos!
        if (pilhaMinimos.empty()) {
            pilhaMinimos.push(valor);
        } else if (pilhaMinimos.peek() >= valor ) {
            pilhaMinimos.push(valor);
        }

    }

    public int pop() {
        // [TEU CÓDIGO AQUI]
        // 1. Tira o valor da pilhaPrincipal
        int valorRemovido = pilhaPrincipal.pop();
        // 2. Se esse valor for IGUAL ao topo da pilhaMinimos (peek()):
        //    tira-o também da pilhaMinimos!
        if (valorRemovido == pilhaMinimos.peek()) {
            pilhaMinimos.pop();
        }
        // 3. Devolve o valor retirado
        return valorRemovido;
    }

    public int findMin() {
        return pilhaMinimos.peek();
    }
}