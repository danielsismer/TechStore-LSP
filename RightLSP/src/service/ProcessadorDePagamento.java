package service;

import domain.model.Pedido;
import service.implement.FreteGratis;
import service.implement.FretePadrao;

public class ProcessadorDePagamento {

    public void processar(Pedido pedido, double valorFreteBase, PedidoService estrategia) {

        double valorFinal = estrategia.aplicarFrete(pedido, valorFreteBase);

        System.out.println("Valor Bruto: R$ " + pedido.getValorBruto());
        System.out.println("Valor Final Processado: R$ " + valorFinal);

        if (valorFinal < pedido.getValorBruto()) {
            throw new IllegalStateException("Erro crítico: Valor final menor que o bruto.");
        }
    }
}