package aula08;

public class Carne extends alimentos {
    private tipoCarne variedade;

    public Carne(double proteinas, double calorias, double peso, tipoCarne variedade){
        super(proteinas, calorias, peso);
        this.variedade=variedade;
    }
    public tipoCarne getVariedade() {
        return variedade;
    }
}
