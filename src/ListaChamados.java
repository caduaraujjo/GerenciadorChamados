
public class ListaChamados {

    NoChamado head;

    public void inserirInicio(NoChamado chamado){
        chamado.setNext(head);
        this.head = chamado;
    }

    public void inserirFim(NoChamado chamado){
        chamado.setNext(null);

        if(head == null){
            head = chamado;
            return;
        }

        NoChamado atual = head;
        while (atual.getNext() != null){
            atual = atual.getNext();
        }
        atual.setNext(chamado);
    }

    public void exibirChamados(){
        if(head == null){
            System.out.println("Nenhum chamado foi encontrado.");
            return;
        }

        NoChamado atual = head;
        while(atual != null){
            System.out.println("Código: " + atual.getCodigo());
            System.out.println("Solicitante: " + atual.getSolicitante());
            System.out.println("Problema: " + atual.getProblema());
            System.out.println("------------------------------------------------");
            atual = atual.getNext();
        }

    }

    public void buscar(int codigo){
        NoChamado atual = head;
        while(atual != null){
            if(atual.getCodigo() == codigo){
                System.out.println("Chamado " + codigo + " encontrado.");
                return;
            }
            atual = atual.getNext();
        }
        System.out.println("Chamado " + codigo + " não encontrado.");
    }

    public void remover(int codigo){
        if (head == null) {
            System.out.println("Lista vazia.");
            return;
        }

        if (head.getCodigo() == codigo) {
            head = head.getNext();
            System.out.println("Chamado " + codigo + " removido.");
            return;
        }

        NoChamado anterior = head;
        NoChamado atual = head.getNext();
        while (atual != null) {
            if (atual.getCodigo() == codigo) {
                anterior.setNext(atual.getNext());
                System.out.println("Chamado " + codigo + " removido.");
                return;
            }
            anterior = atual;
            atual = atual.getNext();
        }

        System.out.println("Chamado " + codigo + " não encontrado.");
    }
    //A referência alterada foi o next do nó 103, o nó anterior ao 107.

    @Override
    public String toString() {
        return "ListaChamados{" +
                "head=" + head +
                '}';
    }
}
