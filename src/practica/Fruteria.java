package practica;
import java.util.Scanner;
import java.io.*;

public class Fruteria {
    
public static void main(String[] args)throws IOException {    
Scanner teclado=new Scanner (System.in);
double kilo=0, subtotal=0, precio=2.50, total=0, tdescuento=0;
int descuento=0;

for (int i=0;i<=30;i++){
System.out.println("Ingrese el numero de kilos a comprar: ");
System.out.println("Compra numero: "+i);
kilo=teclado.nextFloat();
if(kilo <= 2){
subtotal=kilo*precio;
total=subtotal;
}
if ((kilo >= 2.01) && (kilo <= 5)){
descuento=10;
subtotal=kilo*precio;
tdescuento=subtotal*descuento/100;
total=subtotal-tdescuento;
}
if ((kilo >= 5.01) && (kilo <= 10)){
descuento=15;
subtotal=kilo*precio;
tdescuento=subtotal*descuento/100;
total=subtotal-tdescuento;
}
else {
descuento=20;
subtotal=kilo*precio;
tdescuento=subtotal*descuento/100;
total=subtotal-tdescuento;
}
System.out.println("El numero de kilos de manzana es: "+kilo);
System.out.println("El descuento del: " +descuento+ "% es:"+tdescuento);
System.out.println("El total a pagar de las manzanas es: "+total);
}
}
}