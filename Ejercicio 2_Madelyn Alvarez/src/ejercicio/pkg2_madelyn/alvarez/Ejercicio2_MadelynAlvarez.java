
// Madelyn Scarleth Andino Alvarez #2014-300-600-98
//
// Crear un programa que imprima en consola todas las operaciones aritméticas de dos
//números enteros (suma, resta, multiplicación, divición, mod)
//
package ejercicio.pkg2_madelyn.alvarez;


public class Ejercicio2_MadelynAlvarez {

   
    public static void main(String[] args) {

        int n1=8,n2=2,suma,resta,multiplicacion,divicion,mod;
        
        
        //Suma
        
        suma=n1+n2;
        
        //Resta
        
        resta=n1-n2;
        
        //Multiplicacion
        
        multiplicacion=n1*n2;
        
        //Divicion
        
        divicion=n1/n2; 
        
        //Residuo
        
        mod=n1%n2;
        
        
        System.out.println(suma+"\n");
        System.out.println(resta+"\n");
        System.out.println(multiplicacion+"\n");
        System.out.println(divicion+"\n");
        System.out.println(mod+"\n");   
    }
    
}
