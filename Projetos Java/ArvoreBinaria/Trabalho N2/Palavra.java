
public class Palavra {
    String palavra;
    int  ocorrencias;

    public Palavra(String palavra, int oco){
        this.palavra = palavra;
        ocorrencias = oco;
    }

    public Palavra(){}

    @Override
    public String toString(){
        return (palavra + " (" + ocorrencias + ")");
    }
}
