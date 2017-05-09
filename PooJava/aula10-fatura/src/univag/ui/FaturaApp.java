package univag.ui;

import univag.db.ProdutoDB;
import univag.negocio.Fatura;
import univag.negocio.ItemFatura;
import univag.negocio.Produto;

public class FaturaApp {

    public static Fatura fatura = new Fatura();

    public static void main(String args[]) {
        System.out.println("Bem vindo  aplicação de faturas\n");
        getItensDaFatura();
        mostrarFatura();
    }

    public static void getItensDaFatura() {
        String escolha = "s";
        while (escolha.equalsIgnoreCase("s")) {
            String codigoDoProduto = Console.getString("Digite o código do produto: ");
            int quantidade = Console.getInt("Digite a quantidade:     ");

            Produto produto = ProdutoDB.getProduto(codigoDoProduto);
            fatura.adicionarItem(new ItemFatura(produto, quantidade));

            escolha = Console.getString("Adicinar outro item na fatura? (s/n): ");
            System.out.println();
        }
    }

    public static void mostrarFatura() {
        StringBuilder sb = new StringBuilder();
        sb.append("Data da fatura: ");
        sb.append(fatura.getDataFaturaFormatada());
        sb.append("\n\n");
        sb.append("Data da Vencimento: ");
        sb.append(fatura.getDataDeVencimentoFormatada());  
        sb.append("\n\n");
        
        sb.append(StringUtil.pad("Descrição", 34));
        sb.append(StringUtil.pad("Preço", 10));        
        sb.append(StringUtil.pad("Qtd", 5));        
        sb.append(StringUtil.pad("Total", 10));
        sb.append("\n");

        for (ItemFatura itemFatura : fatura.getItensFatura()) {
            Produto produto = itemFatura.getProduto();
            sb.append(StringUtil.pad(produto.getDescricao(), 34));
            sb.append(StringUtil.pad(produto.getPrecoFormatado(), 10));
            sb.append(StringUtil.pad(itemFatura.getQuantidadeFormatada(), 5));
            sb.append(StringUtil.pad(itemFatura.getTotalFormatado(), 10));
            sb.append("\n");
        }
        sb.append("\nFatura total: ");
        sb.append(fatura.getTotalFormatado());
        sb.append("\n");
        System.out.println(sb);
    }
}