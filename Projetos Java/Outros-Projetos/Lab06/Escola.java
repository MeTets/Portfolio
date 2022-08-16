import java.util.*;

public class Escola {
    ArrayList<Turma> salas;
    String nome;

    public Escola(String nome){
        salas = new ArrayList<>();
        this.nome = nome;
    }

    public void AddTurma(String cod){
        salas.add(new Turma(cod));
    }

    public double MediaEscola(){
        double media = 0;
        int soma = 0;
        for(Turma a: salas){
            soma += a.mediaIdade();
        }
        media  = (double)soma / (double)salas.size();
        return media;
    }

    public String MostrarAlunos(){
        String txt = "";
        for(Turma s: salas){
            txt += s.MostrarTurma();
        }
        return txt;
    }





}
