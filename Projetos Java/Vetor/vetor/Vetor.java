
package vetor;
// Autor: Mateus Hannonen Vieira, Turma: 03H11, TIA: 32132638

public class Vetor {
    private int A [];
    private int size;
    private int capacity;
    
    public Vetor(int capacity){
        A = new int [capacity];
        this.size = 0;
        this.capacity = capacity;      
    }
    
    public boolean isEmpty(){
        if(size == 0)
            return true;
        else
            return false;
    }
    
    public int size(){
        return size;
    }
    
    public int get(int i) throws Exception {
        if(isEmpty())
            throw new Exception ("Lista Vazia");
        if(i > size)
            throw new Exception ("Posição inexistente");
        return A[i];      
    }
    
    public void set(int i, int n) throws Exception{
        if(isEmpty())
            throw new Exception ("Lista Vazia");
        if( i > size)
            throw new Exception ("Posição inexistente");
        A[i] = n;
    }
    
    public int search(int n){
        for(int i = 0; i < size; i++){
            if(A[i] == n)
                return i;
        }
        return -1;
    }
    
    public void add(int i, int n) throws Exception{
        if(i > size+1 || i < 0)
            throw new Exception ("Posição inexistente");
        if(size == capacity)
            throw new Exception ("Lista cheia");
        for(int j = size-1; j >= i; j--){
            A[j+1] = A[j];
        }
        A[i] = n;
        size++;
        
    }
    
    /*public void addGame(Gamer n) throws Exception{
        int i = size;
        int pontosComparacao = 0;
        if(size == capacity)
            throw new Exception ("Lista cheia");
        for(int j = size-1; j >= 0; j--){
            if(size == 0)
                pontosComparacao = 0;
            else if(size > 0)
                pontosComparacao = A[j].getScore();
            if(n.getScore() > pontosComparacao){
                i = j;
                A[j+1] = A[j];
            }
        }
        A[i] = n;
        size ++;
    }*/
    
    public void remove(int i) throws Exception{
        if(i > size)
            throw new Exception ("Posição inexistente");
        if(isEmpty())
            throw new Exception ("Posição de remoção inválida");
        for(int j = i; j < size-2; j++)
            A[j] = A[j+1];
        size --;
    }
    
    public int [] getArray(){return A;}
       
    
}
