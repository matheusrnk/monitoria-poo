/** Escreva um programa em Java, que leia o nome e a idade de 3 pessoas e exiba-os no
console. É obrigatório o uso de array. */

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in); /** Criação leitor do teclado */
        String [] nomes = new String [3]; /** Declaração da String "nomes" */
        int [] idades = new int [3]; /** Declaração da cadeia de inteiros "idades" */

        for(int i=0; i<3; i++){
            nomes[i] = leitor.nextLine(); /** Estrutura de repetição "for" para ler as strings do teclado */
        }
        for(int i=0; i<3; i++){
            idades[i] = Integer.parseInt(leitor.nextLine()); /** Estrutura de repetição "for" para ler os inteiros do teclado */
        }

        for(int i=0; i<3; i++){
            System.out.println("Nome: " + nomes[i]); /** Criação do escritor da string "nomes" dentro de um laço "for" */
            System.out.println("Idade: " + idades[i]); /** Criação do escritor do inteiro "idades" dentro de um laço "for" */
        }
    }
}
