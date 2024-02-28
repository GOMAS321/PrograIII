package consola;
import java.util.Scanner;
public class Consola {

    public static void main(String[] args) {
        int opc;
        do{
            
            Scanner ingreso= new Scanner(System.in);
            System.out.println("n1 Calculadora de matrices");
            System.out.println("n2 Ordenar arreglos");
            System.out.println("n3 Interfaz persona");     
            System.out.println("n4 Salir");
            System.out.println("Seleccione la opcion");
            opc=ingreso.nextInt();
            
            switch (opc)
            {
                case 1:
                    int opc2, fi = 0, co = 0,fi1 = 0, co1 = 0, es=0;
                    CalculadoraMatrices CalculadoraM = new CalculadoraMatrices();
                do {
            System.out.println("Matriz A");
            System.out.print("Número de filas: ");
            fi = ingreso.nextInt();
        } while (fi<1);
        do {
            System.out.println("Matriz A");
            System.out.print("Número de columnas: ");
            co = ingreso.nextInt();
        } while (co<1);
        do {
            System.out.println("Matriz B");
            System.out.print("Número de filas: ");
            fi1 = ingreso.nextInt();
        } while (fi1<1);
        do {
            System.out.println("Matriz B");
            System.out.print("Número de columnas: ");
            co1 = ingreso.nextInt();
        } while (co1<1);
        int[][] A = new int[fi][co];
        int[][] B = new int[fi1][co1];
        int[][] C = new int[fi][co1];
                do{
                System.out.println("1 Suma de matrices");
                System.out.println("2 Producto de matrices");
                System.out.println("3 Producto de un escalar con una matriz.");
                System.out.println("4 Traspuesta de una matriz");
                System.out.println("5 Salir");
                System.out.println("Ingrese la opcion\n");
                opc2=ingreso.nextInt();   
                switch(opc2)
                {
                        case 1:
                        CalculadoraM.Suma( A, B, C);
                        break;
                        case 2:
                        CalculadoraM.Producto( A, B, C, co, fi1);   
                        break;
                        case 3:
                        CalculadoraM.ProductoE( A, C, es);
                        break;
                        case 4:
                        CalculadoraM.Traspuesta(A,C); 
                        break;
                        case 5:
                        System.out.println("Saliendo xd...");
                        break;
                        default:
                        System.out.println("Seleccione una opcion valida.");
                        break;
                }
                }while(opc2!=5);
                    break;
                case 2:
                    Ordena ordenar = new Ordena();
                    int opc3;
                    do{
                    System.out.println("n1 Ordenar por Burbuja");
                    System.out.println("n2 Ordenar por Insercion");
                    System.out.println("n3 Ordenar por Seleccion");
                    System.out.println("n4 Ordenar por MergeSort");
                    System.out.println("n5 Salir a menu principal");
                    opc3=ingreso.nextInt();
                    switch(opc3)
                    {
                        case 1 -> {
                            System.out.println("100 numeros!");
                            ordenar.imprimir(ordenar.arreglo);
                            ordenar.burbuja(ordenar.arreglo);
                            ordenar.imprimir(ordenar.arreglo);
                            System.out.println("500 numeros!");
                            ordenar.imprimir(ordenar.arreglo2);
                            ordenar.burbuja(ordenar.arreglo2);
                            ordenar.imprimir(ordenar.arreglo2);
                            System.out.println("1000 numeros!");
                            ordenar.imprimir(ordenar.arreglo3);
                            ordenar.burbuja(ordenar.arreglo3);
                            ordenar.imprimir(ordenar.arreglo3);
                            System.out.println("5000 numeros!");
                            ordenar.imprimir(ordenar.arreglo4);
                            ordenar.burbuja(ordenar.arreglo4);
                            ordenar.imprimir(ordenar.arreglo4);
                            System.out.println("10000 numeros!");
                            ordenar.imprimir(ordenar.arreglo5);
                            ordenar.burbuja(ordenar.arreglo5);
                            ordenar.imprimir(ordenar.arreglo5);
                    }
                        case 2 -> {
                            System.out.println("100 numeros!");
                            ordenar.insercion(ordenar.arreglo);
                            System.out.println("500 numeros!");
                            ordenar.insercion(ordenar.arreglo2);
                            System.out.println("1000 numeros!");
                            ordenar.insercion(ordenar.arreglo3);
                            System.out.println("5000 numeros!");
                            ordenar.insercion(ordenar.arreglo4);
                            System.out.println("10000 numeros!");
                            ordenar.insercion(ordenar.arreglo5);
                    }
                        case 3 -> {
                            System.out.println("100 numeros!");
                            ordenar.seleccion(ordenar.arreglo);
                            System.out.println("500 numeros!");
                            ordenar.seleccion(ordenar.arreglo2);
                            System.out.println("1000 numeros!");
                            ordenar.seleccion(ordenar.arreglo3);
                            System.out.println("5000 numeros!");
                            ordenar.seleccion(ordenar.arreglo4);
                            System.out.println("10000 numeros!");
                            ordenar.seleccion(ordenar.arreglo5);
                    }
                        case 4 -> {
                            System.out.println("100 numeros !");
                            ordenar.imprimir(ordenar.arreglo);
                            ordenar.mergeSort(ordenar.arreglo);
                            ordenar.imprimir(ordenar.arreglo);
                            System.out.println("500 numeros !");
                            ordenar.imprimir(ordenar.arreglo2);
                            ordenar.mergeSort(ordenar.arreglo2);
                            ordenar.imprimir(ordenar.arreglo2);
                            System.out.println("1000 numeros !");
                            ordenar.imprimir(ordenar.arreglo3);
                            ordenar.mergeSort(ordenar.arreglo3);
                            ordenar.imprimir(ordenar.arreglo3);
                            System.out.println("5000 numeros !");
                            ordenar.imprimir(ordenar.arreglo4);
                            ordenar.mergeSort(ordenar.arreglo4);
                            ordenar.imprimir(ordenar.arreglo4);
                            System.out.println("10000 numeros !");
                            ordenar.imprimir(ordenar.arreglo5);
                            ordenar.mergeSort(ordenar.arreglo5);
                            ordenar.imprimir(ordenar.arreglo5);
                    }
                        case 5 -> System.out.println("Volviendo a menu principal");
                        default -> System.out.println("Seleccione una opcion valida");
                    }
                    }
                    while(opc3!=5);
                    break;
                case 3:
                    Usuario persona = new Usuario();
                    persona.setVisible(true);
                    break;
                case 4:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Seleccione un opcion valida");
                    break;
                    
            }
        }
        while(opc!=4);
    }
    
}
