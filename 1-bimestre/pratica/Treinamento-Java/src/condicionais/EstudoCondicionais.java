package condicionais;

import java.util.Scanner;

public class EstudoCondicionais {
    public static void main(String[] args) {
        Scanner entrada_usuario = new Scanner(System.in);
        int indice = 0;
        String[] feira = {"Banana", "Manga", "Abobora"};
        int[] valor = {10, 15, 8};

        System.out.println("O preço da " + feira[0] + " é R$" + valor[0]);

        while (indice < feira.length){
            System.out.println("Isso vai se repetir ate " + (indice + 1) + " ser igual a 3");
            indice++;
        }
    }
}
