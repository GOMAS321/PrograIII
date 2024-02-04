
package calculadoras;

import java.util.Scanner;

public class Consola {
    
    public static void main(String[] args) {
        int opc;
        
        do{
        
        Scanner ingreso= new Scanner(System.in);
        Calculadora calculadora1= new Calculadora();
        System.out.println("1 Suma");
        System.out.println("2 Resta");
        System.out.println("3 Multiplicacion");
        System.out.println("4 Division");
        System.out.println("5 Coseno");
        System.out.println("6 Seno");
        System.out.println("7 Tangente");
        System.out.println("8 raiz");
        System.out.println("9 Potencia");
        System.out.println("10 %Iva");
        System.out.println("11 Salir");
        System.out.println("Ingrese la opcion\n");
        opc=ingreso.nextInt();
        
        switch(opc)
        {
            case 1:
        System.out.println("Ingrese el número 1\t");
        float a=ingreso.nextFloat();
        System.out.println("Ingrese el número 2\t");
        float b=ingreso.nextFloat();
        
        calculadora1.num1=a;
        calculadora1.num2=b;
        calculadora1.suma();
        System.out.println("El resultado de la suma es: "+calculadora1.result);
        System.out.println("Presione cualquier tecla para continuar...");
        new java.util.Scanner(System.in).nextLine();
                break;
                
            case 2:
        System.out.println("Ingrese el número 1\t");
        a=ingreso.nextFloat();
        System.out.println("Ingrese el número 2\t");
        b=ingreso.nextFloat();
        
        calculadora1.num1=a;
        calculadora1.num2=b;
        calculadora1.resta();
        System.out.println("El resultado de la resta es: "+calculadora1.result);
        System.out.println("Presione cualquier tecla para continuar...");
        new java.util.Scanner(System.in).nextLine();        
        break;
                
            case 3:
        System.out.println("Ingrese el número 1\t");
        a=ingreso.nextFloat();
        System.out.println("Ingrese el número 2\t");
        b=ingreso.nextFloat();
        
        calculadora1.num1=a;
        calculadora1.num2=b;
        calculadora1.multi();
        System.out.println("El resultado de la multoplicacion es: "+calculadora1.result);
        System.out.println("Presione cualquier tecla para continuar...");
        new java.util.Scanner(System.in).nextLine();                
                break;
                
            case 4:
        System.out.println("Ingrese el número 1\t");
        a=ingreso.nextFloat();
        System.out.println("Ingrese el número 2\t");
        b=ingreso.nextFloat();
        
        calculadora1.num1=a;
        calculadora1.num2=b;
        calculadora1.divi();
        System.out.println("El resultado de la division es: "+calculadora1.result);      
        System.out.println("Presione cualquier tecla para continuar...");
        new java.util.Scanner(System.in).nextLine();
        break;
                
            case 5:
        System.out.println("Ingrese el número\t");
        a=ingreso.nextFloat();    
        
        calculadora1.num1=a;
        calculadora1.cos(calculadora1.num1);
        System.out.println("El resultado de coseno es: "+calculadora1.result);        
        System.out.println("Presione cualquier tecla para continuar...");
        new java.util.Scanner(System.in).nextLine();
        break;
                
            case 6:
        System.out.println("Ingrese el número\t");
        a=ingreso.nextFloat();    
        
        calculadora1.num1=a;
        calculadora1.sen(calculadora1.num1);
        System.out.println("El resultado del seno es: "+calculadora1.result);    
        System.out.println("Presione cualquier tecla para continuar...");
        new java.util.Scanner(System.in).nextLine();
        break;
                
            case 7:
        System.out.println("Ingrese el número\t");
        a=ingreso.nextFloat();    
        
        calculadora1.num1=a;
        calculadora1.tan(calculadora1.num1);
        System.out.println("El resultado de la tangente es: "+calculadora1.result);    
        System.out.println("Presione cualquier tecla para continuar...");
        new java.util.Scanner(System.in).nextLine();        
        break;
                
            case 8:
        System.out.println("Ingrese el numero radical\t");
        a=ingreso.nextFloat();
        System.out.println("Ingrese el numero indice\t");
        b=ingreso.nextFloat();
        
        calculadora1.num1=a;
        calculadora1.num2=b;
        calculadora1.raizn();
        System.out.println("El resultado de la raiz es: "+calculadora1.result);  
        System.out.println("Presione cualquier tecla para continuar...");
        new java.util.Scanner(System.in).nextLine();
        break;
                
            case 9:
        System.out.println("Ingrese la base\t");
        a=ingreso.nextFloat();
        System.out.println("Ingrese el exponente \t");
        b=ingreso.nextFloat();
        
        calculadora1.num1=a;
        calculadora1.num2=b;
        calculadora1.pown();
        System.out.println("El resultado de la potencia es: "+calculadora1.result); 
        System.out.println("Presione cualquier tecla para continuar...");
        new java.util.Scanner(System.in).nextLine();
        break;
               
            case 10:
        System.out.println("Ingrese el numero\t");
        a=ingreso.nextFloat();
        System.out.println("Ingrese el porcentaje \t");
        b=ingreso.nextFloat();
        
        calculadora1.num1=a;
        calculadora1.num2=b;
        calculadora1.iva();
        System.out.println("El resultado de la potencia es: "+calculadora1.result);        
        System.out.println("Presione cualquier tecla para continuar...");
        new java.util.Scanner(System.in).nextLine();        
        break;
                
            case 11:
        System.out.println("Adios");
                break;
            default:
        System.out.println("Seleccione una opción valida");
                break;                
        } 
       }
        while(opc!=11);
    }
}