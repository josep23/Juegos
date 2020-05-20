package com.company;

import java.util.Scanner;

public class PiedraPapelTijera {
    Scanner scanner = new Scanner(System.in);
    String usuario;
    int opcionmaquina;
    String opcionusuario;
    String[] maquina = {"Piedra","Papel","Tijera"};
    int puntosusuario = 0;
    int puntosmaquina = 0;

    void jugar(){
        System.out.println("Nombre del usuario");
        usuario = scanner.nextLine();
        boolean juego= true;


        while (juego){
        System.out.println("¿Piedra , Papel o Tijera ?");
        opcionusuario = scanner.nextLine().toLowerCase();
        opcionmaquina = (int) (Math.random()*3);

        System.out.println("maquina:"+ maquina[opcionmaquina]);
        System.out.println(usuario + ":" + opcionusuario);


            if (opcionusuario.equals("piedra") && maquina[opcionmaquina].equals("tijera")){
                System.out.println("Ha ganado " + usuario);
                puntosusuario++;
            } else if (opcionusuario.equals("papel") && maquina[opcionmaquina].equals("piedra")){
                System.out.println("Ha ganado " + usuario);
                puntosusuario++;
            } else if (opcionusuario.equals("tijera") && maquina[opcionmaquina].equals("papel")){
                System.out.println("Ha ganado " + usuario);
                puntosusuario++;
            }else if (opcionusuario.equals(maquina[opcionmaquina])){
                System.out.println("Empate");
            }else{
                System.out.println("Ha ganado la maquina");
                puntosmaquina++;
            }
            System.out.println("PUANTACION" + " " +  usuario + ":" + puntosusuario + " " + "maquina :" + puntosmaquina);
            System.out.println("¿Quieres jugar mas?");
            System.out.println("1 - SI");
            System.out.println("2 - NO , SALIR");
            int gameover = scanner.nextInt();
            if (gameover == 2){
                juego = false;
            }
            scanner. nextLine();
        }
    }
}
