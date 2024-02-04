
package calculadoras;

public class Calculadora {
    
    public float num1, num2, result;
    public Boolean bandera=true;
    
    public void suma(){
        result=num1+num2;
    }
    public void resta(){
        result=num1-num2;
    }
    public void multi(){
        result=num1*num2;
    }
    public void divi(){
        if(num2==0){
        bandera=false;  
        }else{
        result=num1/num2;
        }
    }
    public void sen(double a){
    result=(float)(Math.sin(a));
    }
    public void cos(double a){
        result=(float)(Math.cos(a));
    }
    public void tan(double a){
        result=(float)(Math.tan(a));
    }
    public void raizn(){
        if(num2%2==1){
        result=(float)Math.pow(num1, 1/num2);     
        }
        else if(num1<0){
        bandera=false;
        }else{
          result=(float)Math.pow(num1, 1/num2);   
        }
    }
    public void pown(){
        result=(float)Math.pow(num1, num2);
    }
    public void iva(){
        result=num1*(num2/100);
    }
}
