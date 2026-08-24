package filaLista;

public class main {
    public static void main(String[] args) {
        Fila fila = new FilaLista();
        fila.push(1);
        fila.push(2);
        fila.push(3);
        fila.push(4);
        fila.push(5);
        fila.push(6);

        System.out.println(fila.size());
        System.out.println(fila.inicio());
        fila.pop();
        System.out.println(fila.size());
        System.out.println(fila.inicio());
    }
}
