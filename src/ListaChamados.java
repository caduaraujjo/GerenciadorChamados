
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

    public void ExibirChamados(){}

    public void buscar(){}

    public void remover(){}

    @Override
    public String toString() {
        return "ListaChamados{" +
                "head=" + head +
                '}';
    }
}
