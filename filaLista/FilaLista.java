package filaLista;

public class FilaLista implements Fila {
    private No no;
    private No f;
    public FilaLista() {
        this.no = null;
        this.f = null;
    }

    public void push(Object o){
        No novo = new No();
        novo.setElemento(o);
        if (size() == 0){
            this.no = novo;
            this.f = novo;
        }
        else {
            f.setProximo(novo);
            this.f = novo;
        }
    }
    public boolean isEmpty() {
        return no == null;
    }
    public Object inicio() throws FilaVaziaExcessao{
        if (isEmpty()) {
            throw new FilaVaziaExcessao("A fila esta vazia");
        }
        return this.no.getElemento();
    }
    public Object pop() throws FilaVaziaExcessao {
        if (isEmpty()) {
            throw new FilaVaziaExcessao("A pilha esta vazia");
        }
        Object i = this.no.getElemento();
        No novoNo = this.no.getProximo();
        this.no.setProximo(null);
        this.no = novoNo;
        return i;
    }
    public int size(){
        int qtd = 0;
        No atual = this.no;
        while (atual != null) {
            qtd = qtd + 1;
            atual = atual.getProximo();
        } 
        return qtd;
    }
}
