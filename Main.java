package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        boolean jugar = true;
        while(jugar){
            System.out.println("  __^__          A QUE QUIERES JUGAR?        __^__");
            System.out.println(" ( ___ )------------------------------------( ___ )");
            System.out.println("  | / |        1 - 3 en Raya                 | / |");
            System.out.println("  | / |        2 - Oca                       | / |");
            System.out.println("  | / |        3 - Piedra Papel,Tijera       | / |");
            System.out.println("  |___|        4 - Salir                     |___|");
            System.out.println(" (_____)------------------------------------(_____) ");

            opcion = scanner.nextInt();

            if (opcion == 1){
                System.out.println("Has elegido 3 en Raya");
                TresEnRaya tresEnRaya = new TresEnRaya();
                tresEnRaya.jugar();
            }
            else if (opcion == 2){
                System.out.println("Has elegido la oca");
                oca oca = new oca();
                oca.jugar();
            }
            else if (opcion == 3){
                System.out.println("Has elegido Piedra Papel,Tijera");
                PiedraPapelTijera ppt = new PiedraPapelTijera();
                ppt.jugar();
            }
            else {
                System.out.println("Hasta pronto");
                jugar = false;
            }

        }
    }
}
