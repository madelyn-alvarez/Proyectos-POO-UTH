
package trabajando;

public class Main {
public static void main(String[] args) {
   
//Cantante
      Cantante cantante = new Cantante();
      
      cantante.setNombre("Joon Gi");
      cantante.setApellido("Lee");
      cantante.setEdad(35);
      cantante.setSexo("M");
      
      System.out.println("Nombre: " + cantante.getNombre());
      System.out.println("apellido: " + cantante.getApellido());
      System.out.println("Edad: " + cantante.getEdad());
      System.out.println("Sexo: " + cantante.getSexo());
   
      }
    
    public static class Cantante{
    private String nombre;
    private String apellido;
    private int edad;
    private String sexo;
    
    
 //METODOS
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public int getEdad(){
        return edad;
    }
    public String getSexo(){
        return sexo;
    }
 //METODOS 
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
  }
 }
   