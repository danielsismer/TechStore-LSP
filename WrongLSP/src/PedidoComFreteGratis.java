public class PedidoComFreteGratis extends Pedido {

    public PedidoComFreteGratis(double valorBruto) {
        // Assume-se que o construtor da base é chamado
        super(valorBruto);
    }

    @Override
    public void aplicarFrete(double valorFrete) {
        this.valorFrete = 0.0;
        this.valorFinal = this.valorBruto; // Quebra a expectativa de um aumento
        System.out.println("Frete grátis aplicado. Valor final mantido.");
    }
}