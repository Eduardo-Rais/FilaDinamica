package filas.dinamicas;

public class Teste {
    public static void main(String[] args) {
        FilaDinamica<String> filaDin = new FilaDinamica<String>();
        System.out.println(filaDin.isEmpty());
        System.out.println(filaDin);
        filaDin.dequeue();

        filaDin.enqueue("Fernando");
        filaDin.enqueue("Gustavo");
        filaDin.enqueue("Maria");
        System.out.println(filaDin.isEmpty());
        System.out.println(filaDin);
        System.out.println(filaDin.front());
        System.out.println(filaDin.rear());

        System.out.println(filaDin.size());
        System.out.println(filaDin.search("Gustavo"));

        filaDin.dequeue();
        System.out.println(filaDin);

    }
}
