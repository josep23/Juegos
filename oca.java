package com.company;

import java.util.Scanner;

public class oca {
    Scanner scanner = new Scanner(System.in);
    int[] dado = {1,2,3,4,5,6};
    int contador = 0;
    int contador2 = 0;
    int maquina;
    int ronda = 0;
    int resultadoDado = 0;


    void jugar(){
        boolean juego = true;
        boolean juego2 = true;
        System.out.println("Cuantos jugadores sois ?");
        int  players = scanner.nextInt();
        String[] jugadores = new String[players];
        int[] casilla = new int[players];
        scanner.nextLine();
        while (contador2 < players) {
            System.out.println ("Dime nombres del jugador" + " " + contador2);
            jugadores[contador2] = scanner.nextLine();
            contador2++;
        }


        while (juego){
                    casilla[contador] = dado[maquina];
                    while (juego2){
                        System.out.println(jugadores[contador] + " es tu turno:");
                        maquina = (int) (Math.random()*6);
                        System.out.println("El dado ha salido : " + dado[maquina]);
                        casilla[contador] = casilla[contador] + dado[maquina];
                        if (casilla[contador] == 5){
                            casilla[contador]=casilla[contador]+4;
                            maquina = (int) (Math.random()*6);
                            System.out.println("El dado ha salido : " + dado[maquina]);
                            casilla[contador] = casilla[contador] + dado[maquina];
                        }
                        else if (casilla[contador] == 9){
                            casilla[contador]=casilla[contador]+5;
                            maquina = (int) (Math.random()*6);
                            System.out.println("El dado ha salido : " + dado[maquina]);
                            casilla[contador] = casilla[contador] + dado[maquina];
                        }
                        else if (casilla[contador] == 14){
                            casilla[contador]=casilla[contador]+4;
                            maquina = (int) (Math.random()*6);
                            System.out.println("El dado ha salido : " + dado[maquina]);
                            casilla[contador] = casilla[contador] + dado[maquina];
                        }
                        else if (casilla[contador] == 18){
                            casilla[contador]=casilla[contador]+5;
                            maquina = (int) (Math.random()*6);
                            System.out.println("El dado ha salido : " + dado[maquina]);
                            casilla[contador] = casilla[contador] + dado[maquina];
                        }
                        else if (casilla[contador] == 23){
                            casilla[contador]=casilla[contador]+4;
                            maquina = (int) (Math.random()*6);
                            System.out.println("El dado ha salido : " + dado[maquina]);
                            casilla[contador] = casilla[contador] + dado[maquina];
                        }
                        else if (casilla[contador] == 27){
                            casilla[contador]=casilla[contador]+5;
                            maquina = (int) (Math.random()*6);
                            System.out.println("El dado ha salido : " + dado[maquina]);
                            casilla[contador] = casilla[contador] + dado[maquina];
                        }
                        else if (casilla[contador] == 32){
                            casilla[contador]=casilla[contador]+4;
                            maquina = (int) (Math.random()*6);
                            System.out.println("El dado ha salido : " + dado[maquina]);
                            casilla[contador] = casilla[contador] + dado[maquina];
                        }
                        else if (casilla[contador] == 36){
                            casilla[contador]=casilla[contador]+5;
                            maquina = (int) (Math.random()*6);
                            System.out.println("El dado ha salido : " + dado[maquina]);
                            casilla[contador] = casilla[contador] + dado[maquina];
                        }
                        else if (casilla[contador] == 41){
                            casilla[contador]=casilla[contador]+4;
                            maquina = (int) (Math.random()*6);
                            System.out.println("El dado ha salido : " + dado[maquina]);
                            casilla[contador] = casilla[contador] + dado[maquina];
                        }
                        else if (casilla[contador] == 45){
                            casilla[contador]=casilla[contador]+5;
                            maquina = (int) (Math.random()*6);
                            System.out.println("El dado ha salido : " + dado[maquina]);
                            casilla[contador] = casilla[contador] + dado[maquina];
                        }
                        else if (casilla[contador] == 50){
                            casilla[contador]=casilla[contador]+4;
                            maquina = (int) (Math.random()*6);
                            System.out.println("El dado ha salido : " + dado[maquina]);
                            casilla[contador] = casilla[contador] + dado[maquina];
                        }
                        else if (casilla[contador] == 54){
                            casilla[contador]=casilla[contador]+5;
                            maquina = (int) (Math.random()*6);
                            System.out.println("El dado ha salido : " + dado[maquina]);
                            casilla[contador] = casilla[contador] + dado[maquina];
                        }
                        else if (casilla[contador] == 59){
                            System.out.println( jugadores[contador] + "HAS GANADO");
                            System.out.println("¿Quieres jugar mas?");
                            System.out.println("1 - SI");
                            System.out.println("2 - NO , SALIR");
                            int gameover = scanner.nextInt();
                            if (gameover == 2){
                                juego = false;
                                break;
                            }
                        }
                        if (casilla[contador] >= 63){
                            System.out.println( jugadores[contador] + "HAS GANADO");
                            System.out.println("¿Quieres jugar mas?");
                            System.out.println("1 - SI");
                            System.out.println("2 - NO , SALIR");
                            int gameover = scanner.nextInt();
                            if (gameover == 2){
                                juego = false;
                                break;
                            }
                        }

                        if (casilla[contador] == 6){
                            casilla[contador]=casilla[contador]+6;
                            maquina = (int) (Math.random()*6);
                            System.out.println("El dado ha salido : " + dado[maquina]);
                            casilla[contador] = casilla[contador] + dado[maquina];

                        }
                        else if (casilla[contador] == 12){
                            casilla[contador]=casilla[contador]-6;
                            maquina = (int) (Math.random()*6);
                            System.out.println("El dado ha salido : " + dado[maquina]);
                            casilla[contador] = casilla[contador] + dado[maquina];
                        }

                        if (casilla[contador] == 58){
                            casilla[contador]=casilla[contador]-57;
                            maquina = (int) (Math.random()*6);
                            System.out.println("El dado ha salido : " + dado[maquina]);
                            casilla[contador] = casilla[contador] + dado[maquina];
                            System.out.println("Has caido en la calavera GG");
                        }

                        contador++;
                        if (contador == players){
                            contador=0;
                        }
                    }
        }
    }
}
