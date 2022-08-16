public class Teste {
    public static void main(String [] args){
        Escola e1 = new Escola("Mackenzie");
        e1.AddTurma("03H11");
        e1.AddTurma("03H12");

        e1.salas.get(0).addAluno("Mateus", 20);
        e1.salas.get(0).addAluno("Manuela", 24);
        e1.salas.get(0).addAluno("Daphne", 19);
        e1.salas.get(0).addAluno("João", 21);

        e1.salas.get(1).addAluno("Gabriel", 20);
        e1.salas.get(1).addAluno("Viktor", 22);
        e1.salas.get(1).addAluno("Jayce", 25);

        double medias = e1.MediaEscola();
        System.out.println("Media de Idade da Escola: " + medias);

        double media1 = e1.salas.get(0).mediaIdade();
        double media2 = e1.salas.get(1).mediaIdade();

        System.out.println("Media de Idade da Turma 03H11: " + media1);
        System.out.println("Media de Idade da Turma 03H12: " + media2);

        String info = e1.MostrarAlunos();
        System.out.println(info);

    }
}
