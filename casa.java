

package com.mycompany.ejercicio1semana3;


public class casa {

     private String Numero_casa="1000c", Nombre_calle="Calle San Sebastian Abajo";
    int Numero_Pasaje=1920;

    public String getNumero_casa() {
        return Numero_casa;
    }

    public void setNumero_casa(String Numero_casa) {
        this.Numero_casa = Numero_casa;
    }

    public String getNombre_calle() {
        return Nombre_calle;
    }

    public void setNombre_calle(String Nombre_calle) {
        this.Nombre_calle = Nombre_calle;
    }

    public double getNumero_Pasaje() {
        return Numero_Pasaje;
    }

    public void setNumero_Pasaje(int Numero_Pasaje) {
        this.Numero_Pasaje = Numero_Pasaje;
    }
    
    public String Imprimir_Casa()
    {
        String info = "";
        info += "Este es el numero de la casa : " + this.Numero_casa + "\n";
        info += "Este es numero de pasaje de la casa : " + this.Numero_Pasaje + "\n";
        info += "Este es el nombre de la calle : " + this.Nombre_calle + "\n";
    return info;
    }
    
    public casa(){
    
    }
    
    public static void main(String[] args) {
        casa casa1 = new casa();
        
        System.out.println("Imprimir los valores ingresados" + "\n");
        System.out.println("" + casa1.Imprimir_Casa());
    }
}
