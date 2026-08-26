public class PilhaRubroNegra implements PilhaRubroNegraInterface {
    private int capacidade;
    private Object a[];
    private int tP;
    private int tV;
    public int FC;
    public PilhaRubroNegra(int capacidadePreta, int capacidadeVermelha, int crescimento) {
        this.capacidade = capacidadePreta + capacidadeVermelha;
        tP = -1;
        tV = capacidade;
        FC = crescimento;
        a = new Object[capacidade];
    }

    public void pushPreta(Object o) {
        if (tP + 1 == tV) {
            int novaCapacidade = capacidade * 2;
            int novoTV=tV+capacidade;
            Object b[] = new Object[novaCapacidade];
            for (int i = 0; i <= tP; i++) {
                b[i] = a[i]; 
            }
            for (int i = novaCapacidade - 1; i >= novoTV; i--) {
                b[i] = a[i-capacidade];
            }
            a = b;
            this.tV=tV+this.capacidade;
            this.capacidade=novaCapacidade;
        }
        a[++tP]=o;
    }

    public Object popPreta() throws PilhaVaziaExcessao {
        if (isEmptyPreta()) {
            throw new PilhaVaziaExcessao("A Pilha está vazia");
        }
        if (sizePreta() + sizeVermelha() == capacidade/3) {
            int novaCapacidade = capacidade/2;
            int novoTV=tV-(capacidade-novaCapacidade); 
            Object b[] = new Object[novaCapacidade];
            for (int f=0; f<=tP; f++){
                b[f] = a[f];
            }
            for (int f = novaCapacidade - 1; f>=novoTV; f++){
                b[f] = a[f+(capacidade-novaCapacidade)];
            }
            a=b;
            this.tV=tV-(capacidade-novaCapacidade);
            this.capacidade=novaCapacidade;
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

    public void pushVermelha(Object o) {
        if (tV - 1 == tP) {
            int novaCapacidade = capacidade * 2;
            int novoTV=tV+capacidade;
            Object b[] = new Object[novaCapacidade];
            for (int i = 0; i <= tP; i++) {
                b[i] = a[i]; 
            }
            for (int i = novaCapacidade - 1; i >= novoTV; i--) {
                b[i] = a[i-capacidade];
            }
            a = b;
            this.tV=tV+this.capacidade;
            this.capacidade=novaCapacidade;
        }
        a[--tV]=o;
    }

    public Object popVermelha() throws PilhaVaziaExcessao {
        if (isEmptyVermelha()) {
            throw new PilhaVaziaExcessao("A Pilha está vazia");
        }
        if (sizePreta() + sizeVermelha() == capacidade/3) {
            int novaCapacidade = capacidade/2;
            int novoTV=tV-(capacidade-novaCapacidade);       
            Object b[] = new Object[novaCapacidade];
            for (int f=0; f<=tP; f++){
                b[f] = a[f];
            }
            for (int f = novaCapacidade - 1; f >= novoTV; f--){
                b[f] = a[f+(capacidade-novaCapacidade)];
            }
            this.tV=tV-(capacidade-novaCapacidade);
            a=b;
            this.capacidade=novaCapacidade;
        }
        Object r=a[tV++];
        return r;
    }

    public Object topVermelha() throws PilhaVaziaExcessao {
        if (isEmptyVermelha()) {
            throw new PilhaVaziaExcessao("A Pilha está vazia");
        }
        return a[tV];
    }

    public boolean isEmptyVermelha() {
        return tV == capacidade;
    }

    public int sizeVermelha() {
        return capacidade - tV - 1;
    }
}
