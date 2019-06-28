package parcial_1;

import java.util.Scanner;

public class Promedio {
    public static  void main (String [] args){
        System.out.print("Introdusca el nombre del estudiante: ");
        Scanner teclado = new Scanner(System.in);
        String nom = teclado.next();

        System.out.print("Introdusca la calificaccion 1: ");
        Scanner teclado1 = new Scanner(System.in);
        int cal1 = teclado1.nextInt();

        System.out.print("Introdusca la calificaccion 2: ");
        Scanner teclado2 = new Scanner(System.in);
        int cal2 = teclado2.nextInt();

        System.out.print("Introdusca la calificaccion 3: ");
        Scanner teclado3 = new Scanner(System.in);
        int cal3 = teclado3.nextInt();

        System.out.print("Introdusca la calificaccion 4: ");
        Scanner teclado4 = new Scanner(System.in);
        int cal4 = teclado4.nextInt();

        int tot = cal1 + cal2 +cal3 + cal4;
        int prom = tot /4;
        System.out.println("EL estudiante "+nom);
        System.out.println("Obtuvo un promedio de " +prom);
        if (prom>=71){
            System.out.println("Esta aprobado");
        }else{
            System.out.println("Esta reprobado");
        }







    }

}
