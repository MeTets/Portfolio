package labalgeprog;

public class Queue extends Vetor {
    public Queue(int capacity) {
    // Cria uma fila com uma capacidade inicial
        super(capacity);
    }

    public int size() {
    // Devolve o número de elementos da fila
        return super.size();
    }

    public void enqueue(int n) throws Exception {
    // Enfileira, caso a fila não esteja cheia, o elemento n
       int pos = super.size();
       add(pos, n); 
    }

    public void dequeue() throws Exception{
// Desenfileira, caso a fila não esteja vazia, o primeiro elemento
        remove(0);
    }

    public int front() throws Exception{
// Devolve, sem desenfileirar, o primeiro elemento da fila
        return get(0);

    }

}
