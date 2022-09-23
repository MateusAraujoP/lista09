/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.lista09;

import java.util.Scanner;

/**
 *
 * @author Mateus Araujo de Paula
 */
public class Lista09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Exercicio 1:\n");
        int[][] matriz1 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Entre com o valor da linha " + (i + 1) + " coluna " + (j + 1) + ":");
                matriz1[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nSoma dos elementos da diagonal principal:\n" + (matriz1[0][0] + matriz1[1][1] + matriz1[2][2]));

        System.out.println("\n Exercicio 2:\n");
        int[][] matriz2 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Entre com o valor da linha " + (i + 1) + " coluna " + (j + 1) + ":");
                matriz2[i][j] = sc.nextInt();
            }
        }
        int somaAbaixoD = 0;
        for (int i = 1; i < matriz2.length; i++) {
            for (int j = 0; j < i; j++) {
                somaAbaixoD = somaAbaixoD + matriz2[i][j];
            }
        }
        System.out.println("\nSoma dos elementos abaixo da diagonal principal:\n" + somaAbaixoD);

        System.out.println("\n Exercicio 3:");
        int[][] matrizCartela = new int[5][5];
        double doubleNumAleatorio;
        int intNumAleatorio;
        boolean repetido = false;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                do {
                    doubleNumAleatorio = Math.random() * 100;
                    intNumAleatorio = (int) doubleNumAleatorio;
                    for (int k = i; k >= 0; k--) {
                        for (int l = j - 1; l >= 0; l--) {
                            if (matrizCartela[i][j] == matrizCartela[k][l]) {
                                repetido = true;
                                break;
                            }
                        }
                    }
                } while (repetido == true);
                matrizCartela[i][j] = intNumAleatorio;
            }
        }
        System.out.println("\nCartela:");
        System.out.println(".----.----.----.----.----.");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                if (matrizCartela[i][j] < 10) {
                    System.out.print("| 0" + matrizCartela[i][j] + " ");
                } else {
                    System.out.print("| " + matrizCartela[i][j] + " ");
                }
            }
            System.out.println("|\n|----+----+----+----+----|");
        }
        for (int i = 0; i < 5; i++) {
            if (matrizCartela[4][i] < 10) {
                System.out.print("| 0" + matrizCartela[4][i] + " ");
            } else {
                System.out.print("| " + matrizCartela[4][i] + " ");
            }
        }
        System.out.println("|\n'----'----'----'----'----'");

        System.out.println("\n Exercicio 4:");
        int[][] matriz4 = new int[5][4];
        int maiorNota = 0;
        int alunoMaiorN = 0;
        int mediaAriNF = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("\n" + (i + 1) + "º Aluno:");
            System.out.println("Numero de matricula:");
            matriz4[i][0] = sc.nextInt();
            System.out.println("Media das provas:");
            matriz4[i][1] = sc.nextInt();
            System.out.println("Media dos trabalhos:");
            matriz4[i][2] = sc.nextInt();
            matriz4[i][3] = matriz4[i][1] + matriz4[i][2];
            mediaAriNF = mediaAriNF + matriz4[i][3];
            if (matriz4[i][3] > maiorNota) {
                maiorNota = matriz4[i][3];
                alunoMaiorN = i;
            }
        }
        System.out.println("\nMatricula do aluno com a maior nota:\n" + matriz4[alunoMaiorN][0]);
        System.out.println("\nMedia Aritmetica das notas finais:\n" + (mediaAriNF / 5));
    }
}
