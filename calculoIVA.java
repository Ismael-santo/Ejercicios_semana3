
package com.mycompany.ejercicio1semana3;

import java.util.Scanner;


public class calculoIVA {
    public static double TenerIva( double Precio1){
        double IVA;
        IVA = Precio1 * 0.19;
    return IVA;
    }
    
    public static double ArticuloSinIVA( double PrecioArticulo_Iva){
        double Precio;
        Precio = PrecioArticulo_Iva * 0.19;
    return Precio;
    }
    public static void main(String[] args) {
        double Precio_Articulo, IVA, Precio;
        double PrecioArticulo_Iva = 0;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el precio total del articulo: ");
        Precio_Articulo = leer.nextDouble();
        
        IVA = TenerIva(Precio_Articulo);
        
        Precio = ArticuloSinIVA(PrecioArticulo_Iva);
        
        System.out.println("Este es el precio del articulo con Iva : " + (Precio_Articulo + IVA));
        
        System.out.println("Escriba el precio del articulo  con IVA: ");
        PrecioArticulo_Iva = leer.nextDouble();
        
        System.out.println("Este es el precio del articulo sin Iva : " + (PrecioArticulo_Iva + Precio));
    }
}
