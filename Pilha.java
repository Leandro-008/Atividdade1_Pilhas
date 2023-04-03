public class Pilha {

    private int tamanho;
    private int topoPilha;
    private char[] pilha;

    public Pilha(int tamanho) {
        this.tamanho = tamanho;
        this.topoPilha = -1;
        this.pilha = new char[tamanho];
    }

    public boolean esvaziePilha() {
        return topoPilha == -1;
    }

    public boolean estaCheia() {
        return topoPilha == tamanho - 1;
    }

    public void push(char elemento) {
        if (estaCheia()) {
            throw new RuntimeException("Pilha cheia");
        }
        topoPilha++;
        pilha[topoPilha] = elemento;
    }

    public char pop() {
        if (esvaziePilha()) {
            throw new RuntimeException("Pilha vazia");
        }
        char elemento = pilha[topoPilha];
        topoPilha--;
        return elemento;
    }

    public char top() {
        if (esvaziePilha()) {
            throw new RuntimeException("Pilha vazia");
        }
        return pilha[topoPilha];
    }
}

