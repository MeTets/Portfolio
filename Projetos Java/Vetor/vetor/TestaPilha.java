package vetor;
import java.util.*;

public class TestaPilha {
    public static void main(String [] args) throws Exception{
        Scanner ent = new Scanner(System.in);
        int valor = 0;
        do{
            System.out.println("Digite o número na base 10: ");
            valor = ent.nextInt();
        }while (valor <= 0);

        Pilha restos = new Pilha(10);
        int quociente = 0;
        int resto = 0;

        do{
            quociente = valor/16;
            resto = valor%16;
            restos.push(resto);
            valor = quociente;
        }while(quociente != 0);

        do{
            if(restos.top < 10)
                System.out.print(restos.top());
            else
                System.out.print(converte(restos.top()));
            restos.pop();
        }while(restos.size() != 0);
    }

    public static String converte(int resto){
        switch(resto){
            case 10:
                return "A";
            case 11:
                return "B";
            case 12: 
                return "C";
            case 13:
                return "D";
            case 14: 
                return "E";
            case 15:
                return "F";
            default:
                return "Z";
        }
    }
}
