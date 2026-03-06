
public class Pedido {
    protected double valorBruto;
    protected double valorFinal;
    protected double valorFrete = 0.0;

    public Pedido(double valorBruto) {
        this.valorBruto = valorBruto;
        this.valorFinal = valorBruto;
    }


    public void aplicarFrete(double valorFrete) {

        if (valorFrete < 0) {
            throw new IllegalArgumentException("Frete não pode ser negativo.");
        }

        this.valorFrete = valorFrete;
        this.valorFinal = this.valorBruto + this.valorFrete;
    }

    public double getValorFinal() { return valorFinal; }

}