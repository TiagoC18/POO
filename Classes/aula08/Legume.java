package aula08;

public class Legume extends alimentos{
    private String nome;

    public Legume(double proteinas, double calorias, double peso, String nome){
        super(proteinas, calorias, peso);
        this.nome=nome;
    }
    
    public String getNome() {
        return nome;
    }
}
