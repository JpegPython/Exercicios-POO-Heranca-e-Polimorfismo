package Exercicio2;

import java.util.ArrayList;

public class Agenda {
    ArrayList<Pessoa> agenda=new ArrayList<Pessoa>();


    public void listarPessoa(Pessoa p){
        for(int i=0;i<agenda.size();i++){
            if(p.getClass()==Fisica.class){
                System.out.println(((Fisica) p).getCpf());
            }
            else{
                System.out.println(((Juridica) p).getCnpj());
            }
        }
    }
}
