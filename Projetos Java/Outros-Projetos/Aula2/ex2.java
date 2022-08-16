package Aula2;

import java.nio.file.*;
import static javax.swing.JOptionPane.*;
import java.io.*;

public class ex2 {
    public static void main(String [] args){
        boolean repetir = false;
        do{
            String s = showInputDialog("Consultar filme da linha:");
            try{
                int linha = Integer.parseInt(s);
                String nome = Filmes.consultar(linha-1);
                showMessageDialog(null, nome);
                repetir = false;
            } catch (NumberFormatException ex){
                showMessageDialog(null, "Por favor, entre um número!");
                repetir = true;
            } catch (IOException ex){
                showMessageDialog(null, "Problema ao acessar os filmes!");
            } catch (ArrayIndexOutOfBoundsException ex){
                showMessageDialog(null, "Valor inválido!");
                repetir = true;
            }

        }while(repetir);
        showMessageDialog(null, "Fim!");
    }
}

class Filmes {
    public static String consultar(int indice) throws IOException {
        Path arquivo = Paths.get("Aula2/filmes.txt");
        String [] nomesFilmes = Files.readAllLines(arquivo).toArray(new String[0]);
        return nomesFilmes[indice];
    }
}
