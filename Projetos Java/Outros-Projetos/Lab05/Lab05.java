
package lab05;

import java.util.*;

public class Lab05 {
    public static void main(String[] args) {
        ArrayList<Curso> cursos = new ArrayList<>();
        Curso c1 = new Curso("Sistemas de Informação", 321);
        Curso c2 = new Curso("Ciencia da Computação", 323);
        c2.addDisciplina("Banco de Dados");
        c2.addDisciplina("Algoritimos e Programação");
        c1.addDisciplina("Calculo 1");
        c1.addDisciplina("Estatistica");
        
        c1.classes.get(0).classe.add(new Alunos(20, 3228, "Mateus"));
        c1.classes.get(0).classe.add(new Alunos(19, 3345, "Gabriel"));
        c1.classes.get(0).classe.add(new Alunos(23, 3455, "Manuela"));
        c1.classes.get(0).classe.add(new Alunos(26, 3567, "Arthur"));
        c1.classes.get(1).classe.add(new Alunos(21, 3229, "Joaquim"));
        c1.classes.get(1).classe.add(new Alunos(17, 3344, "Felipe"));
        c1.classes.get(1).classe.add(new Alunos(25, 3298, "Marcia"));
        c1.classes.get(1).classe.add(new Alunos(28, 3455, "Zé"));
         
               
        System.out.println("Média da idade dos alunos de Sistemas de Informação: " + c1.classes.get(0).MediaIdade());
        System.out.println("Média da idade dos alunos de Banco de Dados: " + c1.classes.get(1).MediaIdade());
        System.out.println("Média da idade dos alunos de Estatistica: " + c2.classes.get(0).MediaIdade());
        System.out.println("Média da idade dos alunos de Sistemas de redes: " + c2.classes.get(1).MediaIdade());
        
        System.out.println("Média de idade dos alunos do curso Sistema de Informação: " +  c1.media2Curso());
        System.out.println("Média de idade dos alunos do curso Ciência da Computação: " +  c2.media2Curso());
        
        System.out.println("\n\n\nAgora vamos usar o STREAM!\n");

        c1.classes.stream().forEach(disciplina -> {
            Double media = disciplina.classe.stream().reduce(0.0, (somaIdades, aluno) -> {
                return somaIdades + alunos.getIdade();
            }, Double::sum) / disciplina.classe.size();
            System.out.println("Disciplina: " + disciplina.getNome() + ": " + media);
        });
        c2.classes.stream().forEach(disciplina -> {
            Double media = disciplina.classe.stream().reduce(0.0, (somaIdades, aluno) -> {
                return somaIdades + alunos.getIdade();
            }, Double::sum) / disciplina.classe.size();
            System.out.println("Disciplina: " + disciplina.getNome() + ": " + media);
        });
        
        
        
        
        
        
        
        
    }
    
}
