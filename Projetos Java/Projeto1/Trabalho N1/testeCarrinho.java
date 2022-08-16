import java.util.*;
import java.io.*;
//Autor Mateus Hannonen Vieira - TIA:32132638 - Turma: 03H11
public class testeCarrinho {
    public static void main(String [] args) throws Exception{
        Scanner pergunta = new Scanner(System.in);
        ArrayList<Produto> listaProd = new ArrayList<>();
        ArrayList<itemCompra> lista = new ArrayList<>();

        FileReader data = new FileReader("Produtos.txt");
        BufferedReader linhas = new BufferedReader(data);
        String info = linhas.readLine();

        while(info != null){
            String[] dados = info.split(";");
            Produto p = new Produto(Integer.parseInt(dados[0]), dados[1], Double.parseDouble(dados[2]));
            listaProd.add(p);

            info = linhas.readLine();
        }

        //Object listaProduto = listaProd.toArray();

        System.out.println("### MENU ###");
        System.out.println("1 - Mostrar Lista de Produtos");
        System.out.println("2 - Realizar Compra");
        System.out.println("9 - Finalizar compra!");

        int op = pergunta.nextInt();

        do{
            switch(op){
                case 1:
                System.out.println(listaProd);
                break;

                case 2:
                int op1;
                int op2;
                double precoVar = 0;
                String descVar =  "";
                System.out.println("\n### MENU DE COMPRA ###\n"); 
                System.out.println("\nQual o código do produto você deseja comprar?");
                op1 = pergunta.nextInt();
                for(int i = 0; i < listaProd.size(); i++){
                    if(listaProd.get(i).codigo == op1){
                        precoVar = listaProd.get(i).preco;
                        descVar = listaProd.get(i).descricao;
                        System.out.println("\nQual a quantidade que você deseja desse produto?");
                        op2 = pergunta.nextInt();
                        itemCompra n = new itemCompra(descVar, op2, precoVar);
                        lista.add(n); 
                    }
                }
                break;
                
                default:
                break;
            }

            System.out.println("\n### MENU ###\n");
            System.out.println("1 - Mostrar Lista de Produtos");
            System.out.println("2 - Realizar Compra");
            System.out.println("9 - Finalizar compra!");

            op = pergunta.nextInt();

        }while(op != 9);

        Carrinho c1 = new Carrinho(lista, 0.10);
        double subtotalVar = c1.somaValores();
        double subtotal = c1.calcDesconto(subtotalVar);
        c1.mostraCarrinho(subtotal);

        System.out.println("\n\nMuito obrigado por comprar no Mercado de Dados!");

    }

}
