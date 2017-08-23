package practica;
import java.util.Scanner;
import java.io.*;

public class taller {

    public static void main(String[] args)throws IOException {
    
    int llantas=0, precio=0;
    float  total=0;
    Scanner teclado=new Scanner(System.in);
    System.out.println("Ingrese numero de llantas a comprar");
    llantas=teclado.nextInt();  
    if (llantas < 5){
    precio=200;
    total=llantas*precio;
    } 
    if ((llantas >= 5)&& (llantas <= 10)){
    precio=150;
    total=llantas*precio;
    }
    else if ( llantas > 10){
    precio=100;
    total=llantas*precio;
    }
    System.out.println("El valor de cada llanta es: "+precio);
    System.out.println("El total a pagar es: "+total);
    }    
}
