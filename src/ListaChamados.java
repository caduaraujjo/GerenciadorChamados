
public class ListaChamados {

    NoChamado head;

    public void inserirInicio(NoChamado chamado){
        chamado.setNext(head);
        this.head = chamado;
    }

    public void inserirFim(){}

    public void ExibirChamados(){}

    public void buscar(){}

    public void remover(){}
}
