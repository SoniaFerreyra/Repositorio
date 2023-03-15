import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Clase 4: Funciones");
        //Variables definidas
        //int x = 2 ;
        //int i = 4;

        //Variables ingresadas por consola
        Scanner input = new
        Scanner(System.in);
        System.out.println("Por favor escriba un valor de x");
        //int valor = 0;
        Integer data = input.nextInt();

        System.out.println("Lo que escrbiste fue: "+ data);
        int x = data;

        Scanner input2 = new
                Scanner(System.in);
        System.out.println("Por favor escriba un valor de i");
        //int valor2 ;
        Integer data2 = input2.nextInt();
        System.out.println("Lo que escrbiste fue: "+ input2);
        int i = data2;

        Sumar(x,i);


    }
    public static int Sumar(int x, int i){

        int resultado = x + i;
        System.out.println(resultado);
        return resultado;
    }
}