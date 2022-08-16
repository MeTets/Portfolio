public class Produto {
    //Autor Mateus Hannonen Vieira - TIA:32132638 - Turma: 03H11
    int codigo;
    String descricao;
    double preco;

    public Produto(int codigo, String desc, double preco){
        this.codigo = codigo;
        descricao = desc;
        this.preco = preco;
    }
    
    @Override
    public String toString(){
        return ("\n\nCódigo do produto: " +  codigo + "\nDescrição: " + descricao + "\n Preço: " + preco);
    }
}
