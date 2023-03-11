package aula08;

public class Peixe extends alimentos {
    private String tipo;

    public Peixe(double proteinas, double calorias, double peso, String tipo){
        super(proteinas, calorias, peso);
        this.tipo=tipo;
    }
    
    public String getTipo() {
        return tipo;
    }
}
