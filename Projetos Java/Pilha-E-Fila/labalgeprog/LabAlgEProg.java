
package labalgeprog;

import java.util.*;

public class LabAlgEProg {

    public static void main(String[] args) throws Exception{
        Queue q1 = new Queue(60);
        ArrayList<Integer> tempoSaida = new ArrayList<>();
        ArrayList<Integer> tempoEntrada = new ArrayList<>();
        ArrayList<Integer> tempoEspera = new ArrayList<>();
        int tempoMax = 30;
        int clientes = 0;
        double soma = 0;
        double media = 0;
        int maxEspera = 0;
        
        for(int tempo = 0; tempo < tempoMax; tempo++){
            int ran = (int)(Math.random()*3);
            for(int i = 0; i < ran; i++){
                q1.enqueue(tempo);
                clientes ++;
                tempoEntrada.add(tempo);
            }
            if(tempo != 0){
                if(q1.isEmpty()){
                    continue;
                }
                q1.dequeue();
                tempoSaida.add(tempo);
            }
        }
        
        for(int i = 0; i < tempoSaida.size(); i++){
            int res = 0;
            res = tempoSaida.get(i) - tempoEntrada.get(i);
            tempoEspera.add(res);
            soma += res;
        }
        media = soma/(double)clientes;
        
        for(Integer a: tempoEspera){
            if(a > maxEspera)
                maxEspera = a;
        }
       for(Integer a: tempoEspera){
           System.out.println(a);
       }
        System.out.println("Numero total de clientes: " + clientes);
        System.out.println("Média de tempo de espera na fila: "+ media + "min");
        System.out.println("Tempo máximo de espera: " + maxEspera);
        
        
    }
    
}
