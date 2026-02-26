package domain.model;

public class Pedido {

    protected double valorBruto;
    protected double valorFinal;
    protected double valorFrete;

    public Pedido(double valorBruto) {
        this.valorBruto = valorBruto;
        this.valorFinal = valorBruto;
    }

    public double getValorFinal() { return valorFinal; }

    public double getValorBruto() {
        return valorBruto;
    }

    public double getValorFrete() {
        return valorFrete;
    }

    public void setValorBruto(double valorBruto) {
        this.valorBruto = valorBruto;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }

    public void setValorFrete(double valorFrete) {
        this.valorFrete = valorFrete;
    }
}