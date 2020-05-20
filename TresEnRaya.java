package com.company;

import java.util.Scanner;

public class TresEnRaya {
    Scanner scanner = new Scanner(System.in);
    String[] maquina = {"0","1","2","3","4","5","6","7","8"};
    String usuario;
    String usuario2;
    int opcionj1;
    int opcionj2;
    int RondaActual = 0;
    void jugar(){
        System.out.println("Nombre del usuario");
        usuario = scanner.nextLine();
        System.out.println("Nombre del usuario2");
        usuario2 = scanner.nextLine();
        boolean juego= true;
        boolean juego2=  true;
        while (juego){
            System.out.println("|0|1|2|");
            System.out.println("|3|4|5|");
            System.out.println("|6|7|8|");
            while (juego2) {
                System.out.println(usuario + " Es tu turno");
                opcionj1 = scanner. nextInt();
                if (opcionj1 < 9){
                    maquina[opcionj1] ="X";
                    System.out.println("|" + maquina[0] + "|" + maquina[1] + "|" + maquina[2] );
                    System.out.println("|" + maquina[3] + "|" + maquina[4] + "|" + maquina[5] );
                    System.out.println("|" + maquina[6] + "|" + maquina[7] + "|" + maquina[8] );
                }
                else {
                    System.out.println("Esa casilla no existe");
                }
                System.out.println(usuario2 + " Es tu turno");
                opcionj2 = scanner. nextInt();
                if (opcionj2 < 9){
                    maquina[opcionj2] ="O";
                    System.out.println("|" + maquina[0] + "|" + maquina[1] + "|" + maquina[2] );
                    System.out.println("|" + maquina[3] + "|" + maquina[4] + "|" + maquina[5] );
                    System.out.println("|" + maquina[6] + "|" + maquina[7] + "|" + maquina[8] );
                    RondaActual++;
                }
                else {
                    System.out.println("Esa casilla no existe");
                }

                if (maquina[0] == maquina[1] && maquina[1] == maquina[2]){
                    System.out.println("Jugador 1 gana");
                    System.out.println("¿Quieres jugar mas?");
                    System.out.println("1 - SI");
                    System.out.println("2 - NO , SALIR");
                    int gameover = scanner.nextInt();
                    if (gameover == 2){
                        System.out.println("saliendo");
                        juego = false;
                        juego2 = false;
                    }
                }
                else if (maquina[3] == maquina[4] && maquina[4] == maquina[5]){
                    System.out.println("Jugador 1 gana");
                    System.out.println("¿Quieres jugar mas?");
                    System.out.println("1 - SI");
                    System.out.println("2 - NO , SALIR");
                    int gameover = scanner.nextInt();
                    if (gameover == 2){
                        juego = false;
                        juego2 = false;
                    }
                }
                else if (maquina[6] == maquina[7] && maquina[7] == maquina[8]){
                    System.out.println("Jugador 1 gana");
                    System.out.println("¿Quieres jugar mas?");
                    System.out.println("1 - SI");
                    System.out.println("2 - NO , SALIR");
                    int gameover = scanner.nextInt();
                    if (gameover == 2){
                        juego = false;
                        juego2 = false;
                    }
                }
                else if (maquina[0] == maquina[3] && maquina[3] == maquina[6]){
                    System.out.println("Jugador 1 gana");
                    System.out.println("¿Quieres jugar mas?");
                    System.out.println("1 - SI");
                    System.out.println("2 - NO , SALIR");
                    int gameover = scanner.nextInt();
                    if (gameover == 2){
                        juego = false;
                        juego2 = false;
                    }
                }
                else if (maquina[1] == maquina[4] && maquina[4] == maquina[7]){
                    System.out.println("Jugador 1 gana");
                    System.out.println("¿Quieres jugar mas?");
                    System.out.println("1 - SI");
                    System.out.println("2 - NO , SALIR");
                    int gameover = scanner.nextInt();
                    if (gameover == 2){
                        juego = false;
                        juego2 = false;
                    }
                }
                else if (maquina[2] == maquina[5] && maquina[5] == maquina[8]){
                    System.out.println("Jugador 1 gana");
                    System.out.println("¿Quieres jugar mas?");
                    System.out.println("1 - SI");
                    System.out.println("2 - NO , SALIR");
                    int gameover = scanner.nextInt();
                    if (gameover == 2){
                        juego = false;
                        juego2 = false;
                    }
                }
                else if (maquina[0] == maquina[4] && maquina[4] == maquina[8]){
                    System.out.println("Jugador 1 gana");
                    System.out.println("¿Quieres jugar mas?");
                    System.out.println("1 - SI");
                    System.out.println("2 - NO , SALIR");
                    int gameover = scanner.nextInt();
                    if (gameover == 2){
                        juego = false;
                        juego2 = false;
                    }
                }
                else if (maquina[6] == maquina[4] && maquina[4] == maquina[2]){
                    System.out.println("Jugador 1 gana");
                    System.out.println("¿Quieres jugar mas?");
                    System.out.println("1 - SI");
                    System.out.println("2 - NO , SALIR");
                    int gameover = scanner.nextInt();
                    if (gameover == 2){
                        juego = false;
                        juego2 = false;
                    }
                }

                if (maquina[0] == maquina[1] && maquina[1] == maquina[2]){
                    System.out.println("Jugador 2 gana");
                    System.out.println("¿Quieres jugar mas?");
                    System.out.println("1 - SI");
                    System.out.println("2 - NO , SALIR");
                    int gameover = scanner.nextInt();
                    if (gameover == 2){
                        juego = false;
                        juego2 = false;
                    }
                }
                 else if (maquina[3] == maquina[4] && maquina[4] == maquina[5]){
                    System.out.println("Jugador 2 gana");
                    System.out.println("¿Quieres jugar mas?");
                    System.out.println("1 - SI");
                    System.out.println("2 - NO , SALIR");
                    int gameover = scanner.nextInt();
                    if (gameover == 2){
                        juego = false;
                        juego2 = false;
                    }
                }
                else if (maquina[6] == maquina[7] && maquina[7] == maquina[8]){
                    System.out.println("Jugador 2 gana");
                    System.out.println("¿Quieres jugar mas?");
                    System.out.println("1 - SI");
                    System.out.println("2 - NO , SALIR");
                    int gameover = scanner.nextInt();
                    if (gameover == 2){
                         juego = false;
                         juego2 = false;
                    }
                }
                else if (maquina[0] == maquina[3] && maquina[3] == maquina[6]){
                    System.out.println("Jugador 2 gana");
                    System.out.println("¿Quieres jugar mas?");
                    System.out.println("1 - SI");
                    System.out.println("2 - NO , SALIR");
                    int gameover = scanner.nextInt();
                    if (gameover == 2){
                        juego = false;
                        juego2 = false;
                    }
                }
                    else if (maquina[1] == maquina[4] && maquina[4] == maquina[7]){
                    System.out.println("Jugador 2 gana");
                    System.out.println("¿Quieres jugar mas?");
                    System.out.println("1 - SI");
                    System.out.println("2 - NO , SALIR");
                    int gameover = scanner.nextInt();
                    if (gameover == 2){
                        juego = false;
                        juego2 = false;
                    }
                }else if (maquina[2] == maquina[5] && maquina[5] == maquina[8]){
                    System.out.println("Jugador 2 gana");
                    System.out.println("¿Quieres jugar mas?");
                    System.out.println("1 - SI");
                    System.out.println("2 - NO , SALIR");
                    int gameover = scanner.nextInt();
                    if (gameover == 2){
                        juego = false;
                        juego2 = false;
                    }
                }
                    else if (maquina[0] == maquina[4] && maquina[4] == maquina[8]){
                    System.out.println("Jugador 2 gana");
                    System.out.println("¿Quieres jugar mas?");
                    System.out.println("1 - SI");
                    System.out.println("2 - NO , SALIR");
                    int gameover = scanner.nextInt();
                    if (gameover == 2){
                        juego = false;
                        juego2 = false;
                    }
                }
                    else if (maquina[6] == maquina[4] && maquina[4] == maquina[2]){
                    System.out.println("Jugador 2 gana");
                    System.out.println("¿Quieres jugar mas?");
                    System.out.println("1 - SI");
                    System.out.println("2 - NO , SALIR");
                    int gameover = scanner.nextInt();
                    if (gameover == 2){
                        juego = false;
                        juego2 = false;
                    }
                    }
            }
        }
    }
}