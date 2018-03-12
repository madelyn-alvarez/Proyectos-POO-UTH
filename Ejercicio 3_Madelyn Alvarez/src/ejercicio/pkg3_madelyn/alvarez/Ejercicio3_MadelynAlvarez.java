
//Madelyn Scarleth Andino Alvarez  #2014-300-600-98
//Dadas las variables de tipo int M = 6, T = 1, K = -10 indicar si la evaluación de estas
//expresiones daría como resultado verdadero o falso:

//  M > T
//  T / K == -5
//  (M+T == 7) || (M-T == 5)
//
package ejercicio.pkg3_madelyn.alvarez;

public class Ejercicio3_MadelynAlvarez {

    public static void main(String[] args) {
        
        int M=6;
        int T=1;
        int K=-10;
        
        //Valores Imprimir Pantalla
         System.out.println("M = 6");  
         System.out.println("T = 1"); 
         System.out.println("K = -10"); 
         
         System.out.println("_______________________________________"); 
         
         
        // M>T
        if(M>T)
        {
        System.out.println("M > T: La Evaluacion Es Correcta");  
        }
        else
        {
        System.out.println(" M > T: La Evaluacion Es Incorrecta");
                }
        
        // T/K==-5
        if(T/K==-5)
        {
        System.out.println("T / K == -5: La Evaluacion Es Correcta");
        }
        else
        {
        System.out.println("T / K == -5: La Evaluacion Es Incorrecta");
                }
        
        // (M+T == 7) || (M-T == 5)       
        if(M+T == 7 || M-T == 5)
        {
        System.out.println("M + T == 7) || ( M - T == 5): La Evaluacion Es Correcta");
        }
        else
        {
        System.out.println("M + T == 7) || (M - T == 5): La Evaluacion Es Incorrecta");
        
        }
    }
    
}
