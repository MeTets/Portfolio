/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaligada;

// Mateus Hannonen Vieira - 32132638
public class ListaLigada <E> {

    Celula <E> primeiro = null;
    Celula <E> ultimo = null;
    int tamanho = 0;
    int c [] = {10, 15, 20};
    int soma = c;
    
    public static void main(String[] args) {
    }
    
    public int size(){
        return tamanho;
    }
    
    public boolean isEmpty(){
        if(tamanho == 0)
            return true;
        return false;
    }
    
    public Celula first(){
        return primeiro;
    }
    
    public Celula last(){
        return ultimo;
    }
    
    public Celula addFirst(E info){
        Celula <E> c = new Celula(info);
        if(isEmpty()){
            primeiro = c;
            ultimo = c;
            tamanho ++;
            return c;
        }
        c.proximo = primeiro;
        primeiro = c;
        tamanho ++;
        return c;
    }
    
    public Celula addLast(E info){
        Celula <E> c = new Celula(info);
        if(isEmpty()){
            primeiro = c;
            ultimo = c;
        }
        else{
            ultimo.proximo = c;
            ultimo = c;
        }
        tamanho ++;
        return c;
    }
    
    public boolean addBefore(E info, E A)throws Exception{
        Celula <E> c = new Celula(info);
        if(isEmpty())
            throw new Exception("Lista Vazia");
        else{
            if(primeiro.info.equals(A)){
                addFirst(info);
                tamanho ++;
                return true;
            }
            else{
                Celula aux = primeiro;
                while(aux.proximo != null){
                    if(aux.proximo.info.equals(A)){
                        Celula aux2 = aux.proximo;
                        c.proximo = aux2;
                        aux.proximo = c;
                        tamanho ++;
                        return true;
                    }
                    aux = aux.proximo;
                }
            }
        }
        return false;
    }
    
    public boolean addAfter(E info, E B) throws Exception{
        Celula <E> c = new Celula(info);
        if(isEmpty())
            throw new Exception("Lista Vazia");
        else{
            if(ultimo.info.equals(B)){
                addLast(info);
                tamanho ++;
                return true;
            }
            else{
                Celula aux = primeiro;
                while(aux.proximo != null){
                    if(aux.info.equals(B)){
                    c.proximo = aux.proximo;
                    aux.proximo = c;
                    tamanho ++;
                    return true;
                    }
                 aux = aux.proximo;
                }
            }
        }
        return false;
    }
    
    public boolean remove(E info) throws Exception{
        if(isEmpty())
            throw new Exception("Lista Vazia");
        else{
            if(primeiro.info.equals(info)){
                Celula aux = primeiro;
                primeiro.proximo = primeiro;
                aux.info = null;
                aux.proximo = null;
                tamanho --;
                return true;
            }
            else{
                Celula aux = primeiro;
                while(aux.proximo != null){
                    if(aux.proximo.info.equals(info)){
                        Celula aux2 = aux.proximo;
                        aux.proximo = aux2.proximo;
                        aux2.info = null;
                        aux.proximo = null;
                        tamanho --;
                        return true;
                    }
                    aux = aux.proximo;
                }
            }
        }
        return false;
    }
    
    public Celula search(E info){
        Celula a = primeiro;
        if(primeiro.info.equals(info)){
            return primeiro;
        }
        while(a.proximo != null){
            a = a.proximo;
            if(a.info.equals(info)){
                return a;
            }
        }
        return null;
    }
    
    public void mostraLista(){
        Celula aux = primeiro;
        aux.mostraInfo();;
        while(aux.proximo != null){
            aux = aux.proximo;
            aux.mostraInfo();
        }
    }
    
    public Celula middleCell()  throws Exception{
        if(isEmpty())
            throw new Exception("Lista Vazia");
        else{
            int tamamho = size();
            int central = (int) Math.ceil(tamamho/2);
            int contador = 0;
            Celula aux = primeiro;
            while(contador != central){
                aux = aux.proximo;
                contador ++;
            }
            return aux;
        }
    }
    
    public int Ex2(E info){
        Celula aux = primeiro;
        int cont = 0;
        while(aux.proximo != null){
            if(aux.info.equals(info))
                cont ++;
            aux = aux.proximo;
        }
        return cont;
    }
    
    public boolean Ex3(ListaLigada A, ListaLigada B){
       Celula aux1 = A.primeiro;
       Celula aux2 = B.primeiro;
       if(A.size() == B.size()){
           while(aux1.proximo != null){
               if(aux2.info != aux1.info)
                   return false;
               aux1 = aux1.proximo;
               aux2 = aux2.proximo;
           }
           return true;
       }
       return false;
    }

    public ListaLigada <E> Ex5(ListaLigada A, ListaLigada B){
        Celula aux1 = A.ultimo;
        Celula aux3 = A.primeiro;
        Celula aux2 = B.primeiro;
        ListaLigada <E> aux = new ListaLigada<>();
        aux1.proximo = aux2;
        while(aux3 != null){
            aux.addLast(aux3);
            aux3 = aux3.proximo;
        }
        return aux;
    }
    
}
