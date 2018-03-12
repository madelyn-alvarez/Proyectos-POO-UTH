
// Madelyn Scarleth Andino Alvarez # 2014-300-600-98
//rear un programa que imprima en consola un nombre de estudiante, 
//una nota y una etiqueta que diga Aprobado o Reprobado, dependiendo del valor de la nota que tenga.
package ejercicio.pkg6_madelyn.alvarez;

public class Ejercicio6_MadelynAlvarez {
    
    public static void main(String[] args) {
        
        int[] nota = new int[2];
        
        nota[0] = 65;
        nota[1] = 89;
        
        
        // Daniel   
        if (nota[0]> 70)
        {
          System.out.println("Daniel: Aprobado");
        }
        else
            if (nota[0] < 69)
        {
          System.out.println("Daniel: Reprobado");
        }
        
        //Monica
        if (nota[1]> 70)
        {
          System.out.println("Monica: Aprobado");
        }
        else
            if (nota[1] < 69)
        {
          System.out.println("Monica: Reprobado");
        }
        
        }
    }
