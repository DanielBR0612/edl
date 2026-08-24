public class PilhaLista implements Pilha {
    private No no;
    public PilhaLista() {
        this.no = null;
    }
    public boolean isEmpty() {
        return no == null;
    }
    public int size() {
        int qtd = 0;
        No atual = this.no;
            while (atual != null) {
                qtd = qtd + 1;
                atual = atual.getProximo();
            } 
            return qtd;
        }
    public Object top() throws PilhaVaziaExcessao{
        if (isEmpty()) {
            throw new PilhaVaziaExcessao("A pilha esta vazia");
        }
        return no.getElemento();
    }
    public Object pop() throws PilhaVaziaExcessao {
        if (isEmpty()) {
            throw new PilhaVaziaExcessao("A pilha esta vazia");
        }
        Object r = no;
        this.no = this.no.getProximo();
        return r;
    }
    public void push(Object o) {
        No novo = new No();
        novo.setElemento(o);
        novo.setProximo(this.no);
        this.no = novo;
    }
}
