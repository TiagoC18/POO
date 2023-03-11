package teste2021;

import java.util.Collection;

public class Atividade implements PontosdeInteresse{
    private int identificador;
    private String nome;
   
    public Atividade(int identificador, String nome){
        this.identificador = identificador;
        this.nome = nome;
    }

    public int getIdentificador(){
        return identificador;
    }

    public void setIdentificador(int identificador){
        this.identificador = identificador;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Collection<String> locais(){
        return locais(); // completar
    }

}
