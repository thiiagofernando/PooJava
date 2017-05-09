package univag.db;

import univag.negocio.Produto;


public class ProdutoDB {

    public static Produto getProduto(String codigoProduto) {
        // Em uma aplicação mais realista, este código
    	// buscaria as dados de um produto em um arquivo
    	// ou banco de dados.

        // criar o objeto Produto
        Produto produto = new Produto();

        // preencher o Produto com dados
        produto.setCodigo(codigoProduto);
        if (codigoProduto.equalsIgnoreCase("java")) {
            produto.setDescricao("Murach's Java Programming");
            produto.setPreco(57.50);
        } else if (codigoProduto.equalsIgnoreCase("jsp")) {
            produto.setDescricao("Murach's Java Servlets and JSP");
            produto.setPreco(57.50);
        } else if (codigoProduto.equalsIgnoreCase("mysql")) {
            produto.setDescricao("Murach's MySQL");
            produto.setPreco(54.50);
        } else {
            produto.setDescricao("Desconhecido");
        }
        return produto;
    }
}