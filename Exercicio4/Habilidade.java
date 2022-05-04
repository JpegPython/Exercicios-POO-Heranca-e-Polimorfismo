package Exercicio4;

public class Habilidade extends Ataque{
    protected String condicao;


    public Boolean bloqueio(int n){
        return n!=0;
    };

    public void mudarStats(){};


    public String setHabilidade(){
        return this.condicao;
    }
}
