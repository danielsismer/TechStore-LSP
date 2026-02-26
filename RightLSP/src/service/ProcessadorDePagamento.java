package service;

import domain.model.Pedido;

public class ProcessadorDePagamento {

    public void processar(PedidoService pedido, double freteBase) {

        pedido.aplicarFrete(freteBase);

        if (pedido.getValorFinal() < pedido.valorBruto) {
            throw new IllegalStateException("Erro de contrato: O valor final não pode ser menor que o valor bruto após a aplicação do frete.");
        }
    }
}