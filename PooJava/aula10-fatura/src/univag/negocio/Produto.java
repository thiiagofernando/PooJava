package univag.negocio;

import java.text.NumberFormat;

public class Produto {

    private String codigo;
    private String descricao;
    private double preco;

    public Produto() {
        codigo = "";
        descricao = "";
        preco = 0;
    }

    public Produto(String codigo, String descricao, double preco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public String getPrecoFormatado() {
        NumberFormat moeda = NumberFormat.getCurrencyInstance();
        return moeda.format(preco);
    }

}