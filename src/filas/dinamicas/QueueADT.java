package filas.dinamicas;

public interface QueueADT<T> {
    boolean enqueue(T item);  // insere no fim
    T dequeue();              // remove e retorna o início (null se vazia)
    T front();                // retorna o início sem remover (null se vazia)
    T rear();                 // retorna o fim sem remover (null se vazia)
    boolean isEmpty();        // true se não há elementos
    int size();               // quantidade de elementos
    void clear();             // remove todos os elementos
    int search(T item);
    String toString();        // representação do início para o fim
}
