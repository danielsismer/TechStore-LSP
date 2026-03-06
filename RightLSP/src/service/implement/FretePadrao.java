package service.implement;

import domain.model.Pedido;
import service.PedidoService;

public class FretePadrao implements PedidoService {

    @Override
    public double aplicarFrete(Pedido pedido, double valorFrete) {
        return valorFrete + pedido.getValorBruto();
    }
}