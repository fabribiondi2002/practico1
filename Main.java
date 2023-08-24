import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        Recursividad recu = new Recursividad();
        ArrayList<Integer> a = new ArrayList<Integer>();
        int opcion=0;
        int n,aux;
        String cadena;
        do{
            menu();
            opcion=Integer.parseInt(consola.nextLine());
            switch(opcion){
                
                case 0:
                    System.out.println("Adios.");
                break;
                case 1:
                    System.out.println("Ingrese el numero que le desea calcular el factorial.");
                    n=Integer.parseInt(consola.nextLine());
                    System.out.println(recu.factorial(n));
                break;
                case 2:
                    System.out.println("Ingrese el numero que le desea calcular la sumatoria.");
                    n=Integer.parseInt(consola.nextLine());
                    System.out.println(recu.sumatoria(n));
                break;
                case 3:
                    System.out.println("Ingrese la base y su potencia.");
                    System.out.println("Base:");
                    n=Integer.parseInt(consola.nextLine());
                    System.out.println("Potencia:");
                    aux=Integer.parseInt(consola.nextLine());
                    System.out.println(recu.potencia(aux, n));
                break;
                case 4:
                    System.out.println("Ingrese el numero hasta el cual desea contar.");
                    n=Integer.parseInt(consola.nextLine());
                    recu.conteo(n);
                break;
                case 5:
                    System.out.println("Ingrese los numero que desea multiplicar.");
                    n=Integer.parseInt(consola.nextLine());
                    aux=Integer.parseInt(consola.nextLine());
                    System.out.println(recu.producto(n,aux));
                break;
                case 6:
                    System.out.println("A continuacion ingrese los numeros del arreglo, para terminar el arreglo ingrese alguna letra");
                    while(true){
                        cadena=consola.nextLine();
                        try {
                            a.add(Integer.parseInt(cadena));
                        } catch (Exception e) {
                            break;
                        }
                    }
                    recu.imprimirArray(a.size(), a);
                break;
                case 7:
                    System.out.println("Ingrese el numero decimal que desea convertir a binario.");
                    n=Integer.parseInt(consola.nextLine());
                    System.out.println(recu.binario(n,"")); 
                break;
                default:
                    System.out.println("Opcion no valida.");;
                break;
                

            }
        }while(opcion!=0);
        consola.close();
    }
    public static void menu(){
        System.out.println("Ingrese una opcion.");
        System.out.println("1.Calcular factorial.");
        System.out.println("2.Calcular sumatoria.");
        System.out.println("3.Calcular potencia");
        System.out.println("4.Calcular conteo.");
        System.out.println("5.Calcular producto.");
        System.out.println("6.Imprimir array al inverso.");
        System.out.println("7.Convertir a binario.");
        System.out.println("0.Salir.");
    }

}
