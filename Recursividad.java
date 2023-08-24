import java.util.ArrayList;

public class Recursividad{
    
    
    

    public int factorial(int n){
        if(n<=0){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }
    public int sumatoria(int n){
        if(n<=0){
            return 0;
        }else{
            return n+sumatoria(n-1);
        }
    }
    public int potencia(int n, int numero){
        if(n<=0){
            return 1;
        }else{
            return potencia(n-1,numero)*numero;
        }
    }
    public int conteo(int n){
        System.out.println(n); 
        if(n<=1){
            return 1;
        }else{ 
            return conteo(n-1);
        }
    }
    public int producto(int n, int prod){
        if(n<=0){
            return 0;
        }else{
            return prod + producto(n-1, prod);
        }
    }
    public int imprimirArray(int n, ArrayList <Integer> a ){
        System.out.println(a.get(n-1)); 
        if(n<=1){
            return 1;
        }else{ 
            return imprimirArray(n-1, a);
        }
    }
    public String binario(int n, String cadena){
        if(n<=0){
            return cadena;
        }else{
            if(n%2==0){
                return binario(n/2, 0+cadena);
            }else{
                return binario((n-1)/2,1+ cadena);
            }
        }
    }

}