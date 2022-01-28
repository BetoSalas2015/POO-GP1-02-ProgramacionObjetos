
/**
 * Write a description of class Hora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hora
{
    //  Zona de atributos
   private int horas;
   private int minutos;
   private int segundos;
   
   // Zona de las operaciones
   // Modificadores  (setters)
   public void setHoras(int h) {
       horas = (h >= 0 && h <= 23) ?  h :  0;
   }
   
   public void setMinutos(int m) {
       minutos = (m >= 0 && m <= 59) ?  m :  0;
   }
   
   public void setSegundos(int s) {
       segundos = (s >= 0 && s <= 59) ?  s :  0;
   }
   
   // Selectores (getters)
   public int getHoras() {
       return horas;
   }
   
   public int getMinutos() {
       return minutos;
   }
   
   public int getSegundos() {
       return segundos;
   }
   
}





