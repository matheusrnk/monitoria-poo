/** Escreva um programa em Java, que leia o nome e a idade de 5 pessoas e
exiba-os em ordem decrescente no console. É obrigatório o uso de array */

import java.util.Scanner;

public class exec2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in); /** Criação leitor do teclado */
        String nomes [] = new String [5]; /** Declaração da String "nomes" */
        int idades [] = new int [5]; /** Declaração da cadeia de inteiros "idades" */

        for(int i=0; i<5; i++){
            nomes[i] = leitor.nextLine(); /** Estrutura de repetição "for" para ler as strings do teclado */
            idades[i] = Integer.valueOf(leitor.nextLine());
        }
        
        for(int i=0; i<5; i++){                /** Duplo laço "for" para comparação de valores dentro da cadeia de inteiros "idades" */
            for(int j=0; j<5; j++){
                if( idades[i] >= idades[j] ){
                    int aux = idades[i];
                    idades[i] = idades[j];      /** Atribuição aos valores da cadeia de inteiros "idades" pela comparação "if" */
                    idades[j] = aux;

                    String auxc = nomes[i];
                    nomes[i] = nomes[j];       /** Atribuição às Strings "nomes" pela comparação "if" */
                    nomes[j] = auxc;
                }
            }
        }
        for(int i=0; i<5; i++){
            System.out.println("Nome: " + nomes[i]); /** Criação do escritor para a String "nomes" no console */
            System.out.println("Idade: " + idades[i] + "\n"); /** Criação do escritor para a cadeia de inteiros "idades" no console */
        }
    }
}
