package hola;

import java.util.Scanner;

public class multiplicacion {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);


        System.out.print("Ingrese un número entre 1 y 10: ");
        int numero = sc.nextInt();

    
        if (numero < 1 || numero > 10) {
            System.out.println("error.");
        } else {
          
            System.out.println("Tabla de multiplicar del " + numero + ":");

            for (int i = 1; i <= 10; i++) {
                int resultado = numero * i;
                System.out.println(numero + " x " + i + " = " + resultado);
            }
        }

      
  
    }
}
