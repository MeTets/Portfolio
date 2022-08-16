
package vetor;
// Autor: Mateus Hannonen Vieira, Turma: 03H11, TIA: 32132638
public class TestaVetor {
    
    public static void main (String[]  args) throws Exception{
        System.out.println("Jogo");
        Vetor gamers = new Vetor(10);
        System.out.println("Jogo2");

        gamers.addGame(new Gamer("João", 100));
        System.out.println("Jogo3");
        System.out.println("Tamanho da lista: " + gamers.size());
        gamers.addGame(new Gamer("Cacique", 950));
        System.out.println("Jogo4");
        System.out.println("Tamanho da lista: " + gamers.size());
        gamers.addGame(new Gamer("Pedro", 1100));
        System.out.println("Jogo5");
        System.out.println("Tamanho da lista: " + gamers.size());
        gamers.addGame(new Gamer("Marcia", 500));
        System.out.println("Jogo6");
        System.out.println("Tamanho da lista: " + gamers.size());
        gamers.addGame(new Gamer("Gabriel", 1200));
        System.out.println("Jogo7");
        System.out.println("Tamanho da lista: " + gamers.size());
        
        Gamer [] jogadores = new Gamer [10];
        jogadores =  gamers.getArray();

        for(int i = 0; i < gamers.size(); i++)
            System.out.println("\nPosição " + (i+1) + " " + jogadores[i].toString());
        

        System.out.println("Jogo");

        System.out.println(jogadores[0].toString());

        gamers.remove(2);
        jogadores =  gamers.getArray();

        for(int i = 0; i < gamers.size(); i++)
            System.out.println("\nPosição " + (i+1) + " " + jogadores[i].toString());


        
       
    }
}
