package service;

import domain.model.Pedido;

public interface PedidoService {

    public double aplicarFrete(Pedido pedido, double valorFrete);

}
