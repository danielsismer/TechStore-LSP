import domain.model.Pedido;
import service.ProcessadorDePagamento;
import service.implement.FreteGratis;
import service.implement.FretePadrao;

public class Main {

    public static void main(String[] args) {
        ProcessadorDePagamento processador = new ProcessadorDePagamento();
        Pedido meuPedido = new Pedido(100.0);

        processador.processar(meuPedido, 20.0, new FretePadrao());
        processador.processar(meuPedido, 20.0, new FreteGratis());

    }
}