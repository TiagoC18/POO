package aula08;

public class Cereal extends alimentos {
    private String nome;

    public Cereal(double proteinas, double calorias, double peso, String nome){
        super(proteinas, calorias, peso);
        this.nome=nome;
    }

    public String getNome() {
        return nome;
    }
}
