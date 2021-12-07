
package producto;

import java.util.Scanner;

public class Producto {

    
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       int num1, num2, suma, producto;
       System.out.print("Ingrese el primer digito: ");
       num1=teclado.nextInt();
       System.out.print("Ingrese el segundo digito: ");
       num2=teclado.nextInt();
       suma=num1+num2;
       producto=num1*num2;
       System.out.print("La suma de los digitos es: ");
       System.out.print(suma);
       System.out.print("\nEl producto de los digitos es: ");
       System.out.print(producto);
       
    }
    
}
