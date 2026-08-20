package ucb.aula2.controle;

public class Calculos {
    private double valor1;
    private double valor2;
    private int op;
    private double resposta;

    public double getValor1(){
        return valor1;
    }

    public void setValor1 (double valor1){
        this.valor1 = valor1;
    }

    public double getValor2(){
        return valor2;
    }

    public void setValor2 (double valor2){
        this.valor2 = valor2;
    }

    public void setOp (int op){
        this.op = op;
    }

    public double calcularSoma(){
        switch (op){
            case 1:{
                this.resposta = this.valor1 + this.valor2;
                break;
            }
            case 2:{
                this.resposta = this.valor1 - this.valor2;
                break;
            }
            case 3:{
                this.resposta = this.valor1 * this.valor2;
                break;
            }
            case 4:{
                this.resposta = this.valor1 / this.valor2;
                break;
            }
            default:{
                throw new IllegalArgumentException("Opcao invalida selecionada.");
            }
        }
        return resposta;
    }


}
