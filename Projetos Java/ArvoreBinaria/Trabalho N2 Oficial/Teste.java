import java.util.*;
import java.nio.file.*;
import java.io.*;

import javax.lang.model.util.ElementScanner6;
import javax.swing.JOptionPane;

public class Teste {
    // Mateus Hannonen Vieira - 32132638
    // Gabriel Hannonen Vieira - 32132646
    // Carol Muniz Piche - 32143621
    // Joõa Lucas de Calorio - 32108818
    static ArvoreBinaria<Palavra> musica;
    public static void main(String [] args) throws Exception{

        Path arquivo = Paths.get("letra musica.txt");
        Scanner ent = new Scanner(System.in);
        int op = 0;
        do{
            try{
                System.out.println("\n\n###### MENU #####");
                System.out.println("# 1 - Carregar texto #");
                System.out.println("# 2 - Contador de palavras #");
                System.out.println("# 3 - Busca por palavra #");
                System.out.println("# 4 - Exibição de texto #");
                System.out.println("# 5 - Sair #");
                System.out.println("\nDigite a opção escolhida abaixo: ");
                op = ent.nextInt();
                switch(op){
                    case 1: musica = new ArvoreBinaria<>();
                            carregarTxt(arquivo);
                            System.out.println("\nTexto Carregado");
                            break;

                    case 2: int res = contadorPalavras(arquivo);
                            System.out.println("\nPalavras Totais na música (contando repetições): " + res);
                            break;

                    case 3: String op2 = null;
                            System.out.println("Digite a palavra que vc deseja pesquisar: ");
                            op2 = ent.next();
                            Node<Palavra> auxPesquisa = buscaPalavra(op2);
                            if(auxPesquisa == null){
                                System.out.println("\nA palavra que você pesquisou não existe");
                                break;
                            }
                            System.out.println("\n\nOcorrências: " + auxPesquisa.getConteudo().ocorrencias);
                            break;

                    case 4: exibirArvore();
                            break;

                    case 5: break;
                }
            }catch(NumberFormatException ex){
                System.out.println("\n\n###### MENU #####");
                System.out.println("# 1 - Carregar texto #");
                System.out.println("# 2 - Contador de palavras #");
                System.out.println("# 3 - Busca por palavra #");
                System.out.println("# 4 - Exibição de texto #");
                System.out.println("# 5 - Sair #");
                System.out.println("\nPor favor digite apenas números");
                System.out.println("\nDigite a opção escolhida abaixo: ");
                op = ent.nextInt();
                switch(op){
                    case 1: musica = new ArvoreBinaria<>();
                            carregarTxt(arquivo);
                            System.out.println("\nTexto Carregado");
                            break;

                    case 2: int res = contadorPalavras(arquivo);
                            System.out.println("\nPalavras Totais na música (contando repetições): " + res);
                            break;

                    case 3: String op2 = null;
                            System.out.println("Digite a palavra que vc deseja pesquisar: ");
                            op2 = ent.next();
                            Node<Palavra> auxPesquisa = buscaPalavra(op2);
                            if(auxPesquisa == null){
                                System.out.println("A palavra que você pesquisou não existe");
                                break;
                            }
                            System.out.println(auxPesquisa.getConteudo().ocorrencias);
                            break;


                    case 4: exibirArvore();
                            break;

                    case 5: break;
                }
            }
            
        }while(op != 5);
    }

    public static void carregarTxt(Path arquivo) throws Exception{
        String [] listaAux1 = Files.readAllLines(arquivo).toArray(new String [0]);
        ArrayList<Palavra> listaAux2 = new ArrayList<>();
        ArrayList<Palavra> listaAux3 = new ArrayList<>();
        LinkedHashSet<String> set = new LinkedHashSet<>();
        for(String s: listaAux1){
            int contador = 0;
            for(String n: listaAux1){
                if(s.equals(n)){
                    contador ++;
                }
            }
            set.add(s);
            Palavra word = new Palavra(s, contador);
            listaAux2.add(word);
        }
        String [] sDuplicata = set.toArray(new String[0]);
        for(String s: sDuplicata){
            int contador1 = 0;
            for(int i = 0; i < listaAux2.size(); i++){
                if(s.equals(listaAux2.get(i).palavra)){
                    contador1 = listaAux2.get(i).ocorrencias;
                    break;
                }
            }
            Palavra wordAux = new Palavra(s, contador1);
            listaAux3.add(wordAux);
        }
        for(int i = 0; i < listaAux3.size(); i++){
            Node<Palavra> nodeAux = new Node<>(listaAux3.get(i));
            Teste.addBinary(nodeAux);
        }
    }

    public static int contadorPalavras(Path arquivo) throws Exception{
        String [] listaAux1 = Files.readAllLines(arquivo).toArray(new String [0]);
        return (listaAux1.length);
    }

    public static Node<Palavra> buscaPalavra(String word){
        Node<Palavra> y = musica.root();
        while(y != null){
            if(y.getConteudo().palavra.equals(word))
                return y;
            else if(y.getConteudo().palavra.compareTo(word) < 0)
                y = y.getFilhoDireita();
            else{
                y = y.getFilhoEsquerda();
            }
        }
        return null;
    }

    public static void addBinary(Node<Palavra> z) throws Exception{
        Node<Palavra> y = null;
        Node<Palavra> x = musica.root();
        while(x != null){
            y = x;
            if(z.getConteudo().palavra.compareTo(x.getConteudo().palavra) < 0){
                x = x.getFilhoEsquerda();
            } else{
                x = x.getFilhoDireita();
            }
        }
        z.setPai(y);
        if(y == null){
            musica.root = z;
        }
        else if (z.getConteudo().palavra.compareTo(y.getConteudo().palavra) < 0){
            y.setFIlhoEsquerda(z);
        }else{
            y.setFilhoDireita(z);
        }
    }

    public static void exibirArvore(){
        musica.ERD(musica.root());
    }
}
