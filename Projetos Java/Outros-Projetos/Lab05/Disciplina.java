
package lab05;

import java.util.*;

public class Disciplina {
    String nome;
    ArrayList<Alunos> classe;
    
    public Disciplina(String nome){
        this.nome = nome;
        classe = new ArrayList<>();
    }

    public String getNome(){
        return nome;
    }
    
    public double MediaIdade(){
      double media = 0;
      double soma = 0;
      double div = 0;
      for(Alunos alu: classe){
          soma += alu.getIdade();
          div ++;
      }
      media = soma/div;
      return media;
    }
    
    public ArrayList<Alunos> getClase(){
        return classe;
    }
    
    @Override
    public String toString(){
        String stg = "";
        for(Alunos a: classe){
            stg += a.toString();
        }
        return("\nNome da disciplina: " + nome + "\n" + stg + "\n++++++++++++++++++");
    }
    
    
}
