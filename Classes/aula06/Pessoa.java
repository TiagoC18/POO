package aula06;

import aula05.Date;
import aula07.DateYMD;

public class Pessoa {
    private String nome;
    private int cc;
    private DateYMD dataNasc;
    public Pessoa(String nome, int cc, DateYMD dateYMD){
        this.nome=nome; this.cc=cc;this.dataNasc=dateYMD;
    }

    public Pessoa(String nome2, int cc2, Data data) {
        this.nome=nome2; this.cc=cc2;this.dataNasc=data;
    }

    public String getNome() {
        return nome;
    }

    public int getCC(){
        return cc;
    }

    public Date getDataNAsc(){
        return dataNasc;
    }

    @Override
	public String toString() {
		return nome + ", CC: " + cc + ", Data de Nascimento: " + dataNasc;
	}
}
