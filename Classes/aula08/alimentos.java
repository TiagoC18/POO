package aula08;

public class alimentos {
    double proteinas;
    double calorias;
    double peso;

    public enum tipoCarne{vaca,porco,peru,frango,outra}
    
    public alimentos(double proteinas, double calorias, double peso){
        this.proteinas=proteinas; this.calorias=calorias; this.peso= peso;
    }
    public double getProteinas() {
        return proteinas;
    }
    public double getCalorias() {
        return calorias;
    }
    public double getPeso() {
        return peso;
    }
}
