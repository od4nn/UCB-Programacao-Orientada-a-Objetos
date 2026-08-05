import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    // TIPO DE DADO + IDENTIFICAÇÃO + VALOR ATRIBUIDO
        String jogo_nome;
        int horas;
        String genero;

        /*System.out.println("\nO jogo pesquisado é " + nome + " e ele leva" +
                " em media 40 horas para ser terminado, seu genero é " + genero);*/
        Scanner entrada_usuario = new Scanner(System.in);

        System.out.println("Qual seu jogo preferido?");

        jogo_nome = entrada_usuario.nextLine();
        System.out.println(jogo_nome + " é um jogo muito bom! Você tem" +
                " bom gosto para jogos.");

        System.out.println("Qual o genero dele?");
        genero = entrada_usuario.nextLine();

        System.out.println("Quanto tempo você levou para terminar "+ jogo_nome + "?");
        horas = entrada_usuario.nextInt();

        System.out.println("Então você gosta de jogos "+ genero + ", e levou " + horas + " horas para terminar "
                + jogo_nome + ". Aposto que se divertiu muito!");

        int n1 = 10, n2 = 20;

        System.out.println(n1 + n2);

    }
}