package condicionais;

import java.util.Scanner;

public class EstudoCondicionais {
    public static void main(String[] args) {
        Scanner entrada_usuario = new Scanner(System.in);
        //k
        String[] feira = {"Banana", "Manga", "Abobora"};
        int[] valor = {10, 15, 8};

        System.out.println("O preço da " + feira[0] + " é R$" + valor[0]);
    }
}
