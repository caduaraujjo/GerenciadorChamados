public class NoChamado {

    private int codigo;
    private String Solicitante;
    private String problema;

    // next armazena a referência para o próximo nó da lista, permitindo encadear os chamados; quando é null, indica que esse é o último nó da lista.
    private NoChamado next;

    public NoChamado(int codigo, String solicitante, String problema) {
        this.codigo = codigo;
        Solicitante = solicitante;
        this.problema = problema;
        this.next = null;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getSolicitante() {
        return Solicitante;
    }

    public void setSolicitante(String solicitante) {
        Solicitante = solicitante;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public NoChamado getNext() {
        return next;
    }

    public void setNext(NoChamado next) {
        this.next = next;
    }
}
