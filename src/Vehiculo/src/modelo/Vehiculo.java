/**
 *
 * @author Gabriela MP
 */
package modelo;


public class Vehiculo {

   private String marca;
   private String matricula;
   private int caballosVapor;
   private String color;

    public Vehiculo(){
    }
   
    public Vehiculo(String marca, String matricula, int caballosVapor, String color) {
        this.marca = marca;
        this.matricula = matricula;
        this.caballosVapor = caballosVapor;
        this.color = color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCaballosVapor(int caballosVapor) {
        this.caballosVapor = caballosVapor;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getCaballosVapor() {
        return caballosVapor;
    }

    public String getColor() {
        return color;
    }
    
   @Override
    public String toString(){
        return "- Coche "+this.color+", "+this.marca+", con matr\u00edcula "
                +this.matricula+" y "+this.caballosVapor+"cv. ";
    }
   
   
    
    
}
