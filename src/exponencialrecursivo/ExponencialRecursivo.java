// Programa para elevar un número a una potencia, utilizando recursión
package exponencialrecursivo;

import java.util.Scanner;


public class ExponencialRecursivo {

    
    public static void main(String[] args) {
        
        // Crreación de objeto para entrada de datos
        Scanner input = new Scanner(System.in);
        // Declaración de variables
        int base = 0;
        int exponente = 0;
        int resultado = 0;
        
        // Entrada de datos
        System.out.println("Base: ");
        base = input.nextInt();
        
        System.out.println("Exponente: ");
        exponente = input.nextInt();

        // Se invoca al método elevar
        resultado = elevar(base, exponente);

        System.out.println("Resultado= " + resultado);

    }
    
    
    // Método recursivo
    public static int elevar(int n, int e){
        
        
        if(e == 0){
            return 1;
        }else if(e == 1){
            return n;
        } else {
            return n * elevar(n, e - 1);
        }
        
    }
    
    
    
}
