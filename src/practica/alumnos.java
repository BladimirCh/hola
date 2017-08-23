package practica;
import java.util.Scanner;
import java.io.*;

public class alumnos {
    
    public static void main(String[] args)throws IOException {
    Scanner teclado=new Scanner (System.in);
    double peso=0;
    int peso1=0, peso2=0, peso3=0, peso4=0;
    for (int i=1; i<=20; i++){
    System.out.println("Ingreso numero: "+i);
    System.out.println("Ingree peso de los alumnos: ");
    peso=teclado.nextDouble();
    if (peso < 40) {
    peso1=peso1 + 1;
    }
    if ((peso >= 40) && (peso < 50)) {
    peso2=peso2 + 1;
    }
    if ((peso >= 50) && (peso < 60)){
    peso3=peso3 + 1;
    }
    else 
    peso4=peso4 + 1;
    }
    System.out.println("El numero de alumnos que pesan menos de 40 kilos son: "+peso1);
    System.out.println("El numero de alumnos que pesan 40 y menos de 50 kilos son: "+peso2);
    System.out.println("El numero de alumnos que estan de 50 y menos de 60 kilos son: "+peso3);
    System.out.println("El numero de alumnos que estan en 60 kilos o mas son: "+peso4);
}
}