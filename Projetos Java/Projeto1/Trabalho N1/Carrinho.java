import java.util.*;

public class Carrinho {
    //Autor Mateus Hannonen Vieira - TIA:32132638 - Turma: 03H11
    ArrayList<itemCompra> listaItens;
    double totalCompra;
    double porcDesconto;
    double valorPagar;

    public Carrinho(ArrayList<itemCompra> lista, double desconto){
        listaItens = lista;
        porcDesconto = desconto;
        valorPagar = 0;
        totalCompra = 0; 
    }

    public void mostraCarrinho(double subtotal){
        String leftAlignFormat = " %-2s  %-30s  R$ %-12s  %-12s  R$ %-5s %n";
        System.out.format("                Item               Preço!     Quantidade        Subtotal %n");
        for(int i = 0; i < listaItens.size(); i++){
            //System.out.println("Produto " + (i+1) + ":");
            //listaItens.get(i).mostraItem();
            String var1 = listaItens.get(i).descricao;
            double var2 = listaItens.get(i).preco;
            int var3 = listaItens.get(i).qtde;
            double var4 = listaItens.get(i).subtotal();
            System.out.format(leftAlignFormat, (i+1), var1, var2, var3, var4);
        }
        System.out.println("\nSubtotal: " + totalCompra);
        System.out.println("\nValor do desconto: " + this.calcDesconto(subtotal));
        System.out.println("\nValor total da compra: " + valorPagar);
    }

    public double calcDesconto(double subtotal){
        double x = (subtotal * porcDesconto);
        valorPagar = totalCompra - x;
        return x;
    }

    public double somaValores(){
        double soma = 0;
        for(int i = 0; i < listaItens.size(); i++){
            soma += listaItens.get(i).subtotal();
        }
        totalCompra = soma;
        return soma;
    }


}
