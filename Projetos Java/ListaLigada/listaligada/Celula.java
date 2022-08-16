
package listaligada;

public class Celula <T> {
    T info;
    Celula proximo;
    
    public Celula(T informacao){
        this.info = informacao;
        proximo = null;
    }
    
    public void mostraInfo(){
        System.out.println("INFO: " + info);
    }
    
    
}
