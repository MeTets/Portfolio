package Aula2;

import java.nio.file.*;
import static javax.swing.JOptionPane.*;
import java.io.*;

public class ex1 {
    public static void main(String [] args){
        boolean repetir = false;
        Path arquivo = Paths.get("Aula2/livros.txt");
        do{
            try{
                String[] livros = Files.readAllLines(arquivo).toArray(new String[0]);
                String s = showInputDialog("Consultar livro na linha: ");
                int i = Integer.parseInt(s);
                showMessageDialog(null, livros[i-1]);
                repetir = false;
            }catch(IOException ex){
                showMessageDialog(null, "Erro ao acessar o arquivo!");
            }catch(IndexOutOfBoundsException ex){
                showMessageDialog(null, "Valor inválido!");
                repetir = true;
            }catch(NumberFormatException ex){
                showMessageDialog(null, "Por favor, entre um número!");
                repetir = true; 
            }
        }while(repetir);
        showMessageDialog(null, "Fim!");
    }
}
