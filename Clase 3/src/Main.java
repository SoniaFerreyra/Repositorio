import java.util.*;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        System.out.println("Arrays, Strings");

        Contador('a', "Hola como va, hoy es un dia soleado");
        Vector(21, 4, 53, true);
        Suma(21);
        cofid("hola a todos");
    }

    public static void Contador(char letra, String frase) {

        //String nuestroPrimerString;
        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) {
                contador++;
            }
        }


        System.out.println("Se encontraron " + contador + " letras " + letra + " en: " + frase);
    }

    public static void Vector(int n1, int n2, int n3, boolean ascendente) {
        int[] Nvector = new int[3];
        Nvector[0] = n1;
        Nvector[1] = n2;
        Nvector[2] = n3;

        if (ascendente) {
            Arrays.sort(Nvector);
        } else {
            Arrays.sort(Nvector);

            for (int i = 0; i < Nvector.length / 2; i++) {
                int desc = Nvector[i];
                Nvector[i] = Nvector[Nvector.length - 1 - i];
                Nvector[Nvector.length - 1 - i] = desc;
            }
        }
        for (int i = 0; i < Nvector.length; i++) {
            System.out.println(Nvector[i]);
        }
    }

    public static void Suma(int x) {
        int[] Lista = new int[5];
        Lista[0] = 14;
        Lista[1] = 55;
        Lista[2] = 23;
        Lista[3] = 34;
        Lista[4] = 45;

        int resultado = 0;
        for (int i = 0; i < Lista.length; i++) {
            if (Lista[i] > x) {
                resultado += Lista[i];
            }
        }
        System.out.println("La suma de todos los números mayores a x (" + x + ") da como resultado " + resultado);
    }

    public static void cofid(String palabras) {
        //int [] lista;

        char[] lista = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int i;
        //for (i = 0; i < lista.length; i++) {
           // System.out.println(lista[i]);
       // }
       char cadena[] = palabras.toCharArray();
        for (i = 0; i < cadena.length; i++) {
            System.out.println(cadena[i]);
            if (cadena[i] == lista[i]){
            cadena[0] = lista[i+8];
            System.out.println(cadena[i]++);}





        }
    }
}

           //ArrayList [] lista = {"a;b;c;d;e;f;g;h;i;j;k;l;m;n;o;p;q;r;s;t;u;v;w;x;y;z"};
           //String palabras = "";
           // Transforma el string en array
           //String [] lista1 = lista.split(;);
        //Convertir el texto en un array, esto le da indices a las letras
            //char [] texto = palabras.toCharArray();
        //int i = texto;
        //for (int  i <= lista.length )
        //{
              //  if (texto[i] = lista[i]) {
               //     System.out.println(texto[1]++i);
              //  }
           // }

        //int cantidad = palabras.length;







