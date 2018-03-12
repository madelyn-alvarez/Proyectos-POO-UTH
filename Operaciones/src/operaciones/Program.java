package operaciones;

public class Program {

    public static void main(String[] args) {
        Operaciones operaciones = new Operaciones();
        operaciones.Saludo();
        operaciones.Resultado(2);
        operaciones.Adicion(3);
        operaciones.Crear(4);
        operaciones.Aritmetica(5);
        
    }

//Metodo 1
    public static class Operaciones {
               public void Saludo(){
               System.out.println("Soy el mejor Programador");
               }
//Metodo 2           
    public void Resultado(int nota) {
        if (nota < 70){
           System.out.println("Aprobado");
        }else{
           System.out.println("Reprobado");
             }           
               
            }
//Metodo 3
    public void Adicion (int suma){
           int numero1 = 44;
           int numero2 = 50;
           
           String mensaje = "La Suma es: ";
           suma = numero1 + numero2;
           System.out.println(mensaje + suma);
            }
    
//Metodo 4
    public void Crear (int lista){
         for (int i=1;  i<=10;  i+=1)
             System.out.println(i);
        }
    
//Metodo 5
    public void Aritmetica (double calculo){
         double Val1 = 5.2;
         double Val2 = 2.8;
         double Val3 = 4.57;
         
         String mensaje = "El Resultado es: ";
           calculo = (Val1 - Val2)*Val3;
           System.out.println(mensaje + calculo);
        }
        }
    }

