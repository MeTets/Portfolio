
package vetor;
// Autor: Mateus Hannonen Vieira, Turma: 03H11, TIA: 32132638
public class Gamer {
    private String nome;
    private int score = 0;
    
    public Gamer(String nome, int score){
        this.nome = nome;
        this.score = score;
    }
    
    public String getNome(){return nome;}
    public int getScore(){return score;}

    @Override
    public String toString(){
        return ("Nome: " + this.nome + "\nScore: " + this.score);
    }
}
