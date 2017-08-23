
package practica;
import java.util.Scanner;
import java.io.*;
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
       int numero_computadora = 0, precio = 300;
        int numero =10;
        float descuento =0;
        float subtotal=0;
        float total = 0;
       Scanner ingreso = new Scanner(System.in); 
        System.out.println("Compra de computadoras");
        System.out.println("Ingrese el número de computadora que de sea comprar");
        numero_computadora = ingreso.nextInt();
        subtotal= numero_computadora*precio;
    
        if(numero_computadora < 5)
        {     
        descuento = subtotal * 10 /100;
        }else if((numero_computadora>=5)&&(numero_computadora<10))
                {
                numero=numero+10;
                descuento= subtotal *20 / 100;
        }else if(numero_computadora>=10)
        {
         numero=numero+30;
         descuento=subtotal * 40/100;
        }
        total= subtotal-descuento;
        System.out.println("El numero de computadora es :"+numero_computadora);
        System.out.println("El subtotal es:"+subtotal);
        System.out.println("el descuento del :"+numero+"% es :"+descuento);
        System.out.println("El total es:"+total);
        
    }
    
}
