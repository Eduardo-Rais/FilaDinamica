public class No<T> {
    private T elemento;
    private No<T> proximo;
    private No<T> anterior;

    //construtor
    public No(T elemento) {
        this.elemento = elemento;
    }

    //getters & setters
    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public No<T> getProximo() {
        return proximo;
    }

    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }

    public No<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(No<T> anterior) {
        this.anterior = anterior;
    }
}
