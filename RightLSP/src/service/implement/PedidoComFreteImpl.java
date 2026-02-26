package service.implement;

import domain.model.Pedido;
import service.PedidoService;

public class PedidoComFreteImpl implements PedidoService {

    @Override
    public void aplicarFrete(double valorFrete) {

        if (valorFrete < 0 ){
            throw new RuntimeException("Não foi possível aplicar o frete");
        }

        pedido.setValorFrete(0);
        pedido.setValorFinal(pedido.getValorBruto());

    }
}
