
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

    public void ExibirChamados(){
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

    public void remover(){}

    @Override
    public String toString() {
        return "ListaChamados{" +
                "head=" + head +
                '}';
    }
}
