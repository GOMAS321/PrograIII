package consola;

import java.text.DecimalFormat;

public class Ordena {
    double[] arreglo = new double[100];
    double[] arreglo2 = new double[500];
    double[] arreglo3 = new double[1000];
    double[] arreglo4 = new double[5000];
    double[] arreglo5 = new double[10000];
    
     DecimalFormat df = new DecimalFormat("#.0000");

    
    public Ordena()
    {
        for(int i=0;i<(arreglo.length);i++)
        {
            arreglo[i]=(double)(Math.random() * 100 - 0 + 1);
        }
        
        for(int i=0;i<(arreglo2.length);i++)
        {
            arreglo2[i]=(double)(Math.random() * 100 - 0 + 1);
        }
        
        for(int i=0;i<(arreglo3.length);i++)
        {
            arreglo3[i]=(double)(Math.random() * 100 - 0 + 1);
        }
        
        for(int i=0;i<(arreglo4.length);i++)
        {
            arreglo4[i]=(double)(Math.random() * 100 - 0 + 1);
        }
        
        for(int i=0;i<(arreglo5.length);i++)
        {
            arreglo5[i]=(double)(Math.random() * 100 - 0 + 1);
        }
    }
    
    public void burbuja(double []a)
    {
        double temp;   
        for(int j=0;j<(a.length)-1;j++)
        {
            for(int i=0;i<(a.length)-j-1;i++)
            {
                if(a[i]>a[i+1])
                {
                    temp=a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                }
            }
        }
        
        System.out.println("");
    }
    
    public void insercion(double []a)
    {
     
      for(int x=0;x<(a.length);x++)
        {
            System.out.print(df.format(a[x]));
            System.out.print(" ");
        }
      
      for(int j=1;j<(a.length);j++)
      {
          double temp=a[j];
          for(int i= j-1;i >=0 && a[i]>temp;i--)
          {
              a[i+1]=a[i];
              a[i]=temp;
          }
      }
                System.out.println("");
      
      for(int x=0;x<(a.length);x++)
        {
            System.out.print(df.format(a[x]));
            System.out.print(" ");
        }
      
                System.out.println("");      
    }
    
    public void seleccion(double []a)
    {
        
      for(int x=0;x<(a.length);x++)
        {
            System.out.print(df.format(a[x]));
            System.out.print(" ");
        }
        
        for(int i=0;i<(a.length)-1;i++)
        {
            int min=i;
            for(int j=i+1;j<(a.length);j++)
            {
                if(a[j]<a[min])
                {
                    min=j;
                }
            }
            double temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
        
        System.out.println("");
        
      for(int x=0;x<(a.length);x++)
        {
            System.out.print(df.format(a[x]));
            System.out.print(" ");
        }
      
                System.out.println("");       
    }

      public void mergeSort(double []vectorEntrante) {
    int longitudVector = vectorEntrante.length;
    
    if (longitudVector < 2) {
      return;
    }
    
    int mitadVector = longitudVector / 2;
    double [] mitadIzquiera = new double[mitadVector];
    double[] mitadDerecha = new double[longitudVector - mitadVector];
    
    for (int i = 0; i < mitadVector; i++) {
      mitadIzquiera[i] = vectorEntrante[i];
    }
    for (int i = mitadVector; i < longitudVector; i++) {
      mitadDerecha[i - mitadVector] = vectorEntrante[i];
    }
    
    mergeSort(mitadIzquiera);
    mergeSort(mitadDerecha);
    
    merge(vectorEntrante, mitadIzquiera, mitadDerecha);
    
  }

  public void merge (double[] vectorEntrante, double[] mitadIzquierda, double[] mitadDerecha) {
    int tamIzquierda = mitadIzquierda.length;
    int tamDerecha = mitadDerecha.length;
    
    int i = 0, j = 0, k = 0;
    
    while (i < tamIzquierda && j < tamDerecha) {
      if (mitadIzquierda[i] <= mitadDerecha[j]) {
        vectorEntrante[k] = mitadIzquierda[i];
        i++;
      }
      else {
        vectorEntrante[k] = mitadDerecha[j];
        j++;
      }
      k++;
    }
    
    while (i < tamIzquierda) {
      vectorEntrante[k] = mitadIzquierda[i];
      i++;
      k++;
    }
    
    while (j < tamDerecha) {
      vectorEntrante[k] = mitadDerecha[j];
      j++;
      k++;
    }
  }
  
      public void imprimir(double []vectorEntrante)
    {
              for(int i=0;i<(vectorEntrante.length);i++)
        {
            System.out.print(df.format(vectorEntrante[i]));
            System.out.print(" ");
        }  
            System.out.println("");
    }

}
