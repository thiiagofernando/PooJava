package univag.negocio;


import java.text.NumberFormat;

public class ItemFatura {

    private Produto produto;
    private int quantidade;
    private double total;

    public ItemFatura() {
        this.produto = new Produto();
        this.quantidade = 0;
        this.total = 0;
    }

    public ItemFatura(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.calcularTotal();
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setQuantidade(int getQuantidade) {
        this.quantidade = getQuantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getQuantidadeFormatada() {
        NumberFormat numero = NumberFormat.getNumberInstance();
        return numero.format(quantidade);
    }
    
    public void setTotal(double total) {
        this.total = total;
    }

    public double getTotal() {
        return total;
    }

    public void calcularTotal() {
        total = quantidade * produto.getPreco();
    }

    public String getTotalFormatado() {
        NumberFormat moeda = NumberFormat.getCurrencyInstance();
        return moeda.format(total);
    }
}
