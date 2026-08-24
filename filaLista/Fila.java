package filaLista;

public interface Fila {
    public int size();
    public boolean isEmpty();
    public Object inicio() throws FilaVaziaExcessao;
    public void push(Object o);
    public Object pop() throws FilaVaziaExcessao;
}
