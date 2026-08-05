package condicionais;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    // TIPO DE DADO + IDENTIFICAÇÃO + VALOR ATRIBUIDO
        String jogo_nome;
        int horas;
        String genero;

        /*System.out.println("\nO jogo pesquisado é " + nome + " e ele leva" +
                " em media 40 horas para ser terminado, seu genero é " + genero);*/
        /*Scanner entrada_usuario = new Scanner(System.in);

        System.out.println("Qual seu jogo preferido?");

        jogo_nome = entrada_usuario.nextLine();
        System.out.println(jogo_nome + " é um jogo muito bom! Você tem" +
                " bom gosto para jogos.");

        System.out.println("Qual o genero dele?");
        genero = entrada_usuario.nextLine();

        System.out.println("Quanto tempo você levou para terminar "+ jogo_nome + "?");
        horas = entrada_usuario.nextInt();

        System.out.println("Então você gosta de jogos "+ genero + ", e levou " + horas + " horas para terminar "
                + jogo_nome + ". Aposto que se divertiu muito!"); */

        int n1, n2;

        //System.out.println(n1 + n2);
        Scanner entrada_user = new Scanner(System.in);

        System.out.print("Informe o primeiro numero: ");
        n1 = entrada_user.nextInt();

        System.out.print("Informe o segundo numero: ");
        n2 = entrada_user.nextInt();

        if(n1 > n2){
            System.out.println("De fato " + n1 + " é maior que " + n2);
        }
        else if(n2 > n1) {
            System.out.println("De fato " + n2 + " é maior que " + n1);
        }
        else{
            System.out.println("Empate!");
        }

    }
}