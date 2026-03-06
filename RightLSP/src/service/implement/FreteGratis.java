package service.implement;

import domain.model.Pedido;
import service.PedidoService;

public class FreteGratis implements PedidoService {


    @Override
    public double aplicarFrete(Pedido pedido, double valorFrete) {
        return pedido.getValorBruto();
    }
}
