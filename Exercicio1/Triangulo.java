package Exercicio1;

public class Triangulo extends Figura{
    protected double base;
    protected double altura;


    @Override
    public void CalculoArea(){
        this.area=(this.base*this.altura)/2;
    }

}
