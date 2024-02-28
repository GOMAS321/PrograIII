package consola;

import java.util.Scanner;

public class CalculadoraMatrices {
    public void Suma(int[][] A, int[][] B, int [][] C){
        Scanner ingreso= new Scanner(System.in);
        System.out.println("matriz A:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print("Elemento[" + i + "][" + j + "] = ");                                            
                A[i][j] = ingreso.nextInt();
            }
        }

        System.out.println("matriz B:");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                System.out.print("Elemento[" + i + "][" + j + "] = ");
                B[i][j] = ingreso.nextInt();
            }
        }
         for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
         System.out.println("matriz A:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.printf("%3d", A[i][j]);
            }
            System.out.println();
        }
        System.out.println("\nmatriz B:");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                System.out.printf("%3d", B[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nmatriz Suma:");
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                System.out.printf("%3d", C[i][j]);
            }
            System.out.println();
        }
    }

    public void Producto(int[][] A, int[][] B, int[][] C, int co, int fi1) {
        Scanner ingreso= new Scanner(System.in);
        System.out.println("matriz A:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print("Elemento[" + i + "][" + j + "] = ");                                            
                A[i][j] = ingreso.nextInt();
            }
        }

        System.out.println("matriz B:");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                System.out.print("Elemento[" + i + "][" + j + "] = ");
                B[i][j] = ingreso.nextInt();
            }
        }
        
        System.out.println("matriz A:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.printf("%3d", A[i][j]);
            }
            System.out.println();
        }
        
         System.out.println("\nmatriz B:");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                System.out.printf("%3d", B[i][j]);
            }
            System.out.println();
        }
        
         if (fi1==co){
     for (int i=0; i<C.length;i++){
        for (int j=0; j<C[0].length;j++){
             for (int k=0; k<B.length; k++){
         C[i][j] =  C[i][j]+ A[i][k] * B[k][j];}
        }
        }
    }else { 
    System.out.println("No se puede sacar el producto de matrices si la fila de la primera es diferente a la columna de la segunda");}
     System.out.println("\nmatriz Producto:");
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                System.out.printf("%3d", C[i][j]);
            }
            System.out.println();
       }
    }
    public void ProductoE(int A[][],int C[][], int es){
        Scanner ingreso= new Scanner(System.in);
        System.out.println("matriz A:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print("Elemento[" + i +"][" + j + "] = ");                                            
                A[i][j] = ingreso.nextInt();
            }
        }
        
        System.out.println("Introduce un escalar:");
        es = ingreso.nextInt();
        
        System.out.println("matriz A:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.printf("%3d", A[i][j]);
            }
            System.out.println();
        }
        
       for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                C[i][j] = A[i][j] * es ;
            }
        }
         System.out.println("\nmatriz Producto:");
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                System.out.printf("%3d", C[i][j]);
            }
            System.out.println();
       }
    }
    public void Traspuesta(int A[][],int C[][]){
        Scanner ingreso= new Scanner(System.in);
        System.out.println("matriz A:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print("Elemento[" + i + "][" + j + "] = ");                                            
                A[i][j] = ingreso.nextInt();
            }
        }
          System.out.println("matriz A:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.printf("%3d", A[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                C[j][i] = A[i][j] ;
            }
        }
             System.out.println("\nmatriz Traspuesta:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                System.out.printf("%3d", C[i][j]);
            }
             System.out.println();
            }
    }
}
