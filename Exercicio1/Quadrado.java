package Exercicio1;

public class Quadrado extends Retangulo{
    protected double diagonal;

    public void CalculaDiag(){
        this.diagonal=Math.sqrt(2)*this.altura;
    }

}
