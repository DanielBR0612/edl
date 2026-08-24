public interface PilhaRubroNegraInterface {
    public int sizePreta();
    public int sizeVermelha();
    public boolean isEmptyPreta();
    public boolean isEmptyVermelha();
    public Object topPreta() throws PilhaVaziaExcessao;
    public void pushPreta(Object o);
    public Object popPreta() throws PilhaVaziaExcessao;
    public Object topVermelha() throws PilhaVaziaExcessao;
    public void pushVermelha(Object o);
    public Object popVermelha() throws PilhaVaziaExcessao;
}