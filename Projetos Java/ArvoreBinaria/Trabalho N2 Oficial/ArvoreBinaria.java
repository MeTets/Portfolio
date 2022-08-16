public class ArvoreBinaria <T> {
    Node<T> root;
    
    public ArvoreBinaria(){
        root = null;
    }
    
    public void RED(Node<T> e){
        if(e == null)
            return;
        e.ExibeConteudo();
        RED(e.getFilhoEsquerda());
        RED(e.getFilhoDireita());
    }
    
    public void ERD(Node<T> e){
        if(e == null)
            return;
        ERD(e.getFilhoEsquerda());
        e.ExibeConteudo();
        ERD(e.getFilhoDireita());
    }
    
    public void EDR(Node<T>e){
        if(e == null)
            return;
        EDR(e.getFilhoEsquerda());
        EDR(e.getFilhoDireita());
        e.ExibeConteudo();
    }
    
    public void addRoot(Node<T> n) throws Exception{
        if(isEmpty()){
            root = n;
        }
        else
            throw new Exception("Já existe uma raiz!");
    }
    
    public Node<T> root(){
        return this.root;
    }
    
    public boolean isInternal(Node<T> n){
        if(n.getFilhoEsquerda() != null || n.getFilhoDireita() != null)
            return true;
        else
            return false;
            
    }
    
    public boolean isExternal(Node<T> n){
        if(n.getFilhoDireita() == null && n.getFilhoEsquerda() == null)
            return true;
        else
            return false;
    }
    
    public void addLeft(Node<T> l, Node<T>e) throws Exception{
        if(e.getFilhoEsquerda() == null){
            e.setFIlhoEsquerda(l);
            l.setPai(e);
        }
        else
            throw new Exception("Este nó já tem um filho esquerdo!");
        
    }
    
    public Node<T> left(Node<T> e){
        return e.getFilhoEsquerda();
    }
    
    public boolean hasLeft(Node<T>e){
        if(e.getFilhoEsquerda() != null)
            return true;
        else    
            return false;
    }
    
    public void addRight(Node<T> l, Node<T> e) throws Exception{
        if(e.getFilhoDireita() == null){
            e.setFilhoDireita(l);
            l.setPai(e);
        }
        else
            throw new Exception("Este nó já tem um filho direito!");
        
    }
    
    public Node<T> rigth(Node<T>e){
        return e.getFilhoDireita();
    }
    
    public boolean hasRigth(Node<T> e){
        if(e.getFilhoDireita() != null)
            return true;
        else
            return false;
    }
    
    public void remove(Node<T> e){
        if(e == root)
            root = null;
        else{
            Node<T> aux = e.getPai();
            if(aux.getFilhoDireita() == e){
                aux.setFilhoDireita(null);
            }
            else {
                aux.setFIlhoEsquerda(null);
            }
        }
    }
    
    public boolean isEmpty(){
        if(this.root == null)
            return true;
        else
            return false;
    }
}
