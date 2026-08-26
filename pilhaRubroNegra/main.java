public class main {
    public static void main(String[] args) throws PilhaVaziaExcessao {
        PilhaRubroNegra pilha = new PilhaRubroNegra(2, 2, 0);

        System.out.println("--- TESTANDO PILHA PRETA ---");
        pilha.pushPreta(10);
        pilha.pushPreta(20);
        pilha.pushPreta(30);

        System.out.println("Tamanho Preta: " + pilha.sizePreta());
        System.out.println("Topo Preta: " + pilha.topPreta());
        
        pilha.popPreta();
        System.out.println("Tamanho Preta após pop: " + pilha.sizePreta());
        System.out.println("Novo Topo Preta: " + pilha.topPreta());

        System.out.println("\n--- TESTANDO PILHA VERMELHA ---");
        pilha.pushVermelha(99);
        pilha.pushVermelha(88);
        pilha.pushVermelha(77);

        System.out.println("Tamanho Vermelha: " + pilha.sizeVermelha());
        System.out.println("Topo Vermelha: " + pilha.topVermelha());
        
        pilha.popVermelha();
        System.out.println("Tamanho Vermelha após pop: " + pilha.sizeVermelha());
        System.out.println("Novo Topo Vermelha: " + pilha.topVermelha());
    }
}