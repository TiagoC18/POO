package POO_TP7_108615;

public class tickets {
    String Nome, Local;
	Double dataInicio, dataFim, nBilhetes;
	double score;
	
	public void Tickets(String Nome, String Local, Double dataInicio, Double dataFim, Double nBilhetes) {
        this.Nome = Nome;
        this.Local = Local;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.nBilhetes = nBilhetes; 	
	}

	public String getNome() {
		return Nome;
	}

	public String getLocal() {
		return Local;
	}

	public double getdataInicio() {
        return dataInicio;
    }

    public double getdataFim() {
        return dataFim;
    }

    public  double getnBilhetes() {
        return nBilhetes;
    }

	@Override
	public String toString() {
		return "Tickets [Nome=" + Nome + ", Local=" + Local + ", dataInicio=" + dataInicio + ", dataFim=" + dataFim + ", nBilhetes="
				+ nBilhetes + "]";
	}

    public static void add(tickets tickets) {
    }

   
}
