import java.util.*;

public class Turma {
    ArrayList<Aluno> alunos;
    String cod_sala;

    public Turma(String cod){
        alunos = new ArrayList<>();
        cod_sala = cod;
    }

    public double mediaIdade(){
        double media = 0;
        int soma = 0;
        for(Aluno a1: alunos){
            soma += a1.idade;
        }
        media = (double)soma / (double)alunos.size();
        return media;
    }

    public void addAluno(String nome, int idade){
        alunos.add(new Aluno(nome, idade));
    }

    public String MostrarTurma(){
        String txt = "";
        for(Aluno a: alunos){
            txt += a.toString();
        }
        return "\n\nTurma " +  cod_sala + txt;
    }
}
