
package arvorebinaria;

import java.util.*;
import java.nio.*;
import java.nio.file.Files;

import javax.swing.JOptionPane;

public class TesteArvore {
    ArvoreBinaria<Palavra> musica = new ArvoreBinaria<>();

    Scanner ent = new Scanner(System.in);
    Path arquivo = new Paths.get("musica.txt");
    public static void main(String [] args) throws Exception{

        Scanner ent = new Scanner(System.in);
        int op = 0;

        System.out.println("###### MENU #####");
        System.out.println("# 1 - Carregar texto #");
        System.out.println("# 2 - Contador de palavras #");
        System.out.println("# 3 - Busca por palavra #");
        System.out.println("# 4 - Exibição de texto #");
        System.out.println("# 5 - Sair #");

        do{
            try{
                System.out.println("Digite a opção escolhida abaixo: ");
                op = ent.nextInt();
                switch(op){
                    case 1: TesteArvore.carregarTxt();

                    case 2: TesteArvore.contadorPalavras();

                    case 3: TesteArvore.buscaPalavra();

                    case 4: TesteArvore.exibirArvore();

                    case 5: break;
                }
            }catch(NumberFormatException ex){
                System.out.println("Por favor digite apenas números");
                System.out.println("Digite a opção escolhida abaixo: ");
                op = ent.nextInt();
                switch(op){
                    case 1: TesteArvore.carregarTxt();

                    case 2: TesteArvore.contadorPalavras();

                    case 3: TesteArvore.buscaPalavra();

                    case 4: TesteArvore.exibirArvore();

                    case 5: break;
                }
            }
            
        }while(op != 5);
        /*ArvoreBinaria<String> diretorio = new ArvoreBinaria();
        
        
        diretorio.addRoot(n1);
        
        diretorio.addLeft(n2, n1);
        diretorio.addRight(n3, n1);
        
        diretorio.addLeft(n4, n2);
        diretorio.addRight(n5, n2);
        
        diretorio.addLeft(n6, n5);
        diretorio.addRight(n7, n5);*/
    }

    public String [] carregarTxt(){
        String [] listaAux1 = Files.readAllLines(arquivo).toArray(new String [0]);
        ArrayList<Palavra> listaAux2 = new ArrayList<>();
        for(String s: listaAux1){
            Palavra word = new Palavra(s, 1);
            int contador = 0;
            for(String n: listaAux1){
                if(s.equals(n)){
                    contador ++;
                }
            }
            word.ocorrencias += contador;
            listaAux2.add(word);
        }
        for(Palavra p: listaAux2){
            for(Palavra p2: listaAux2){
                if(p.palavra.equals(p2.palavra)){
                    int aux = listaAux2.indexOf(p2);
                    listaAux2.remove(aux);
                }
            }
        }

    }
}
