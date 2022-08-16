
package lab05;
import java.util.*;

public class Curso {
    String nome;
    int cod_curso;
    ArrayList<Disciplina> classes;
    
    public Curso(String nome, int cod){
        this.nome = nome;
        cod_curso = cod;
        classes = new ArrayList<>();     
    }
    
    public double mediaCurso(int qtde, double media){
        double res = media/qtde;
        return res;
    }
    
    public double media2Curso(){
        double media = 0;
        for(Disciplina d: classes){
            media += d.MediaIdade();
        }
        return media;
    }

    public void addDisciplina(String nome){
        classes.add(new Disciplina(nome));
    }
    
    
}
