public class Aluno {
    String nome;
    int idade;

    public Aluno(String nome, int idade){
        this.idade = idade;
        this.nome = nome;
    }

    @Override
    public String toString(){
        return("\nNome Aluno: " + nome + " \nIdade: " + idade + "\n");
    }
}
