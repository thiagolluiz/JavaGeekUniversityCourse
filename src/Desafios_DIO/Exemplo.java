package Desafios_DIO;

import java.util.Random;
import java.util.Scanner;
public class Exemplo {
    public static void main (String[]args){
    Scanner leitor = new Scanner (System.in);
    int escolha;
    String letra = null;
    int op = 0;
    
        
     System.out.println ("Ol�, Bem vindo ao Jogo do Bingo!");
     System.out.println();
     System.out.println ("Escolha '1' para SIM & '$' para sair: ");
     escolha = leitor.nextInt();
     
     if (escolha == 1){
     //inst�ncia um objeto da classe Random usando o construtor b�sico
     Random gerador = new Random();
     for (int i = 1; i < 90; i++){
     System.out.print ("Deseja gerar um n�mero?");
     if (op == 1){
        //imprime sequ�ncia de 10 n�meros inteiros aleat�rios entre 0 e 90
        for (int j = 1; j < 90; j++){
        System.out.println(gerador.nextInt());
     }
     }
     }
     if (letra.equalsIgnoreCase("$")){
         System.exit(0);     
     }
    
    leitor.close();
    }
     
  }
}