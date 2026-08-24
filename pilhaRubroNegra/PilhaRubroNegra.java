public class PilhaRubroNegra implements PilhaRubroNegraInterface {
    private int capacidade;
    private Object a[];
    private int tP;
    private int tV;
    public int FC;
    public PilhaRubroNegra(int capacidadePreta, int capacidadeVermelha, int crescimento) {
        this.capacidade = capacidadePreta + capacidadeVermelha;
        tP = -1;
        tV = capacidade - 1;
        FC = crescimento;
        a = new Object[capacidade];
    }

    public void pushPreta(Object o) {
        if (tP + tV == capacidade/3) {
            capacidade = capacidade/2;            
            Object b[] = new Object[capacidade];
            for (int f=0; f<tP; f++){
                b[f] = a[f];
            }
            for (int f = capacidade - 1; f>tV; f++){
                b[f] = a[f/2];
            }
            a=b;
        }
        if (tP >= tV) {
            capacidade = capacidade * 2;
            Object b[] = new Object[capacidade];
            for (int i = 0; i < tP; i++) {
                b[i] = a[i]; 
            }
            for (int i = capacidade - 1; i > tV; i--) {
                b[i] = a[i/2];
            }
            a = b;
        }
        a[++tP]=o;
    }

    public Object popPreta() throws PilhaVaziaExcessao {
        if (isEmptyPreta()) {
            throw new PilhaVaziaExcessao("A Pilha está vazia");
        }
        Object r=a[tP--];
        return r;
    }

    public Object topPreta() throws PilhaVaziaExcessao {
        if (isEmptyPreta()) {
            throw new PilhaVaziaExcessao("A Pilha está vazia");
        }
        return a[tP];
    }

    public boolean isEmptyPreta() {
        return tP==-1;
    }

    public int sizePreta() {
        return tP+1;
    }
}
