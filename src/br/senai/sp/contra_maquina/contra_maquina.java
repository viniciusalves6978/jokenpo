package br.senai.sp.contra_maquina;

import java.util.Random;
import java.util.Scanner;

public class contra_maquina {

    public static void main(String[] args) {

        String nome;
        int number;
        int random;

        Scanner teclado = new Scanner(System.in);

        Random aleatorio = new Random();

        System.out.println("#################################");
        System.out.println("====== Bem vindo ao jogo ======");
        System.out.println("Digite seu nick: ");
        nome = teclado.nextLine();

        random = aleatorio.nextInt(3) + 1;

        System.out.println("Digite um número de 1 a 3: (1-pedra, 2- papel, 3-tesoura) ");
        number = teclado.nextInt();

        if (random == number) {
            System.out.println("Empate");

        } else if (number == 1 && random == 2 || number == 2 && random == 3 || number == 3 && random == 1) {
            System.out.println("Pc ganhou");

        } else {
            System.out.println("Você ganhou, parabéns!");

        }
        switch(random){

            case 1:
                System.out.println("pc usou pedra");
                break;

            case 2:
                System.out.println("pc usou papel");
                break;

            case 3:
                System.out.println("pc usou tesoura");
                break;
        }
    }
}
