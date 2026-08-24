public class main {
    public static void main(String[] args) {
        Pilha pilha = new PilhaLista();
        pilha.push(2);
        pilha.push(3);
        pilha.push(1);

        System.out.println(pilha.size());
        System.out.println(pilha.top());
        pilha.pop();
        System.out.println(pilha.size());
        System.out.println(pilha.top());
    }
}
