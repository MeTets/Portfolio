
package lab05;

import java.util.*;

public class Alunos {
  String nome;
  int idade;
  int cod_matricula;
  
  public Alunos(int idade, int cod, String nome){
      this.nome = nome;
      this.idade = idade;
      cod_matricula = cod;
  }
  
  public int getIdade(){
      return idade;
  }
  
  public float MediaIdade(ArrayList<Alunos> a1){
      float media = 0;
      float soma = 0;
      float div = 0;
      for(Alunos alu: a1){
          soma += (float)alu.getIdade();
          div ++;
      }
      media = soma/div;
      return media;
  }
  
  @Override
  public String toString(){
    return ("\nNome do aluno: " + nome + "\nIdade: " + idade + "\nCódio de Matrícula: " + cod_matricula + "\n===================");
  }
}

