package ucb.aula2.visao;
import java.util.Scanner;
import ucb.aula2.controle.Calculos;

 /*public class MinhaCalculadora extends JFrame {

    private JTextField txtValor1;
    private JTextField txtValor2;
    private JLabel lblResultado;
    private Calculos calculos;

    public MinhaCalculadora() {
        setTitle("Minha Calculadora");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        calculos = new Calculos();

        txtValor1 = new JTextField(10);
        txtValor2 = new JTextField(10);

        JLabel lblValor1 = new JLabel("Valor 1:");
        JLabel lblValor2 = new JLabel("Valor 2:");
        lblResultado = new JLabel("Resultado: ");

        JButton btnSomar = new JButton("+");
        JButton btnSubtrair = new JButton("-");
        JButton btnMultiplicar = new JButton("*");
        JButton btnDividir = new JButton("/");

        JPanel painel = new JPanel();

        painel.add(lblValor1);
        painel.add(txtValor1);

        painel.add(lblValor2);
        painel.add(txtValor2);

        painel.add(btnSomar);
        painel.add(btnSubtrair);
        painel.add(btnMultiplicar);
        painel.add(btnDividir);

        painel.add(lblResultado);

        btnSomar.addActionListener(e -> {
            calcularSoma(1);
        });

        btnSubtrair.addActionListener(e -> {
            calcularSoma(2);
        });

        btnMultiplicar.addActionListener(e -> {
            calcularSoma(3);
        });

        btnDividir.addActionListener(e -> {
            calcularSoma(4);
        });

        add(painel);
    }

    private void calcularSoma(int operacao) {

        double valor1 = Double.parseDouble(txtValor1.getText());
        double valor2 = Double.parseDouble(txtValor2.getText());

        calculos.setValor1(valor1);
        calculos.setValor2(valor2);
        calculos.setOp(operacao);

        double resultado = calculos.calcularSoma();

        lblResultado.setText("Resultado: " + resultado);
    }

    public static void main(String[] args) {
        MinhaCalculadora tela = new MinhaCalculadora();
        tela.setVisible(true);
    }
} */

public class MinhaCalculadora {

    public static void main(String[] args) {
        Scanner entrada_user = new Scanner(System.in);

        Calculos calculo = new Calculos();
        int escolha = 1;

        do{
            System.out.print("\n\n\nInforme o primeiro numero: ");
            double n1 = entrada_user.nextDouble();

            System.out.print("Informe o segundo numero: ");
            double n2 = entrada_user.nextDouble();

            calculo.setValor1(n1);
            calculo.setValor2(n2);

            System.out.print("\nDigite 1 para +\nDigite " +
                    "2 para -\nDigite 3 para *\n" +
                    "Digite 4 para /\nInforme a operação: ");
            int resp = entrada_user.nextInt();

            if (n2 == 0 && resp == 4){
                System.out.println("ERRO: Não é possivel dividir por 0.");
                entrada_user.close();
                continue;
            }

            calculo.setOp(resp);

            try {
                double resultado = calculo.calcularSoma();
                System.out.println("\nResultado: " + resultado);
            } catch (IllegalArgumentException e) {
                // e.getMessage() recupera o texto: "Opcao invalida selecionada."
                System.out.println("ERRO: " + e.getMessage());
                escolha = 0;
                entrada_user.close();
            }

            System.out.print("\n10Digite 1 para usar novamente\nDigite 0 para sair");
            escolha =  entrada_user.nextInt();

        }while(escolha != 0);

    }
}

