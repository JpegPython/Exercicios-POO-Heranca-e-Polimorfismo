package Exercicio1;

public class Circulo extends Figura{
    protected double raio;
    protected double comp;


    @Override
    public void CalculoArea(){
        this.area = Math.PI *(raio*raio);

    }
    public void CalculoComprimento() {
        this.comp = 2 * (Math.PI) * raio;
    }
}
