public class Node <T> {
    private Node <T> pai, filhoEsquerda, filhoDireita;
    private T conteudo;
    
    public Node(T conteudo){
        this.conteudo = conteudo;
        pai = null;
        filhoEsquerda = null;
        filhoDireita = null;
    }
    
    public Node (){}
    
    public void ExibeConteudo(){
        System.out.print(conteudo + "  - ");
    }
    
    public Node<T> getFilhoEsquerda(){
        return filhoEsquerda;
    }
    
    public Node<T> getFilhoDireita(){
        return filhoDireita;
    }
    
    public Node<T> getPai(){
        return pai;
    }

    public T getConteudo(){
        return conteudo;
    }
    
    public void setFIlhoEsquerda(Node<T> l){
        filhoEsquerda = l;
    }
    
    public void setFilhoDireita(Node<T> d){
        filhoDireita = d;
    }
    
    public void setPai(Node<T> p){
        pai = p;
    }
}
