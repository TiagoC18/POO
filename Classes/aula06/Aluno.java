package aula06;

import aula05.Date;

public class Aluno extends Pessoa {
    private Date dataInsc;
    private final int NMec;
    private static int contador=100;

    public Aluno(String nome, int cc, Data dataNasc, Date dataInsc) {
		super(nome, cc, dataNasc);
		this.dataInsc = dataInsc;
		this.NMec= contador++;
    }

    public Aluno(String nome, int cc, Data dataNasc) {
		super(nome, cc, dataNasc);
		this.NMec= contador++;
		this.dataInsc = Date.today();
    }

    public Date getDataInsc(){
        return dataInsc;
    }

    public int getNMec(){
        return NMec;
    }
    @Override
	public String toString() {
		return this.getNome() + ", NMec: " + this.getNMec() + ", Data de Inscrição: " + dataInsc;
	}
}

