public class itemCompra {
    //Autor Mateus Hannonen Vieira - TIA:32132638 - Turma: 03H11
    String descricao;
    int qtde;
    double preco;

    public itemCompra(String desc, int qtde, double preco){
        descricao = desc;
        this.qtde = qtde;
        this.preco = preco;
    }

    public void mostraItem(){
        System.out.println("Descrição: " + descricao + "Quantidade: " + qtde + "Preço Unitário: " + preco + "Subtotal: " + this.subtotal());
    }

    public double subtotal(){
        return qtde * preco;
    }


}
