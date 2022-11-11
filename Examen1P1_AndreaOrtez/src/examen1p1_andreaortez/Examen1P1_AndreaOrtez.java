
package examen1p1_andreaortez;

import java.security.SecureRandom;
import java.util.Scanner;

public class Examen1P1_AndreaOrtez {

    static Scanner leer = new Scanner (System.in);
    static SecureRandom random = new SecureRandom ();
    
    public static void main(String[] args) {
        
        int opcion;
        do{
            System.out.println("-- MENU --");
            System.out.println("1-> Divisores Primos");
            System.out.println("2-> Contorno de Pirámide");
            System.out.println("3-> Vecinos");
            System.out.println("4-> Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = leer.nextInt();
            
            switch (opcion){
                case 1:{
                    System.out.println();
                    System.out.println("-- DIVISORES PRIMOS EN PROCESO --");
                    System.out.print("Inserte un numero: ");
                    int N = leer.nextInt();
                    
                    while (N<1){
                        System.out.print("Ingrese un numero mayor que 1: ");
                        N = leer.nextInt();
                    }
                    System.out.println("Los numeros primos que dividen el numero " + N + " son: " + Primos(N));
                    System.out.println();
                }break;
                case 2:{
                    System.out.println();
                    System.out.println("-- CONTORNO DE PIRAMIDE EN PROCESO --");
                    System.out.print("Ingrese un tamaño: ");
                    int N = leer.nextInt();
                    System.out.println();
                    
                    while (N%2==0){
                        System.out.print("Ingrese limite IMPAR: ");
                        N = leer.nextInt();
                        System.out.println();
                    }
                    Contorno(N);
                    System.out.println();
                }break;
                case 3:{
                    System.out.println();
                    System.out.println("-- VECINOS EN PROCESO --");
                    System.out.print("Ingrese una cadena: ");
                    leer.nextLine();
                    String cad = leer.nextLine();
                    System.out.println("");
                    
                    System.out.println("Cadena resultante: " + Vecinos (cad));
                    System.out.println();
                }
                    break;
            }
    }while (opcion!=4);
    }//Fin main
    
    public static String Primos(int N){
        String resp="";
        int cont=0;
        
        for (int i=1;i<N;i++){
            if (N%i==0){
                for (int j=0;j<=i;j++){
                if (j%i==0){
                    cont++;
                }
            }
            if (cont<=2){
                resp+=i+" ";
                cont=0;
            } 
            }
            
        }
        return resp;
    }//Fin metodo 1
    
    public static int Contorno (int N){
        
        int med = (N+1)/2;
        
        for (int i=0;i<med;i++){
            for (int j=0;j<N;j++){
                if (j==0 || j==N-1 || i==med-1 || j>med-1+i || j<med-1-i){
                    System.out.print("*");
                }else if ((i==med-2 && j>1 && j<N-1) || j==med-1+i || j==med-1-i){
                    System.out.print("+");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
            }
    return N;
    }//Fin metodo 2
    
    public static String Vecinos (String cad){
        String respf="";
        int num=random.nextInt(2)+0;
        System.out.println("Numero aleatorio: "+ num);
        
        switch (num){
            case 0: 
                for (int i=0;i<cad.length();i++){
                    char a = cad.charAt(i);
                    
                    int valor = (int) a;
                    valor--;
                    String resp=Character.toString(valor);
                    respf+=resp;
                }
                break;
            case 1:
                for (int i=0;i<cad.length();i++){
                    char a = cad.charAt(i);
                    
                    int valor = (int) a;
                    valor++;
                    String resp=Character.toString(valor);
                    respf+=resp;
                }
                break;
                
        }
        return respf;
    }
}//Fin clase
