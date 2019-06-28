package parcial_1;

import java.util.Scanner;

public class terreno {

        public static void main(String[] args) {
            System.out.println("introduce el ancho del terreno");
            Scanner teclado = new Scanner(System.in);
            int a = teclado.nextInt();
            System.out.println("Introduce la longitud del terrono");
            Scanner teclado1 = new Scanner(System.in);
            int l = teclado1.nextInt();
            int m2 = a * l;
            int total = m2 * 10;
            System.out.println("El precio a pagar por el terreno es: " +total);


        }


    }

