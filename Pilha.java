public interface Pilha {
    public int size();
    public boolean isEmpty();
    public Object top() throws PilhaVaziaExcessao;
    public void push(Object o);
    public Object pop() throws PilhaVaziaExcessao;
}
