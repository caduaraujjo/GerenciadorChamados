//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ListaChamados lista = new ListaChamados();
        NoChamado chamado1 = new NoChamado(103, "Mariana", "Sistema não abre");
        NoChamado chamado2 = new NoChamado(107, "Carlos", "Impressora desconectada");
        NoChamado chamado3 = new NoChamado(112, "Beatriz", "Internet lenta");
        NoChamado chamado4 = new NoChamado(118, "Lucas", "Erro ao acessar o sistema");

        NoChamado chamado5 = new NoChamado(100, "Joao", "Ar condicionado estragado");

        lista.inserirFim(chamado1);
        lista.inserirFim(chamado2);
        lista.inserirFim(chamado3);
        lista.inserirFim(chamado4);
        lista.inserirInicio(chamado5);

        System.out.println("Lista de Chamados: " + lista);
    }
}