package teste2021;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class AgenciaTuristica {
    private String nome;
    private String endereco;
    public Set<Atividade> atividades = new HashSet<Atividade>();

    public AgenciaTuristica(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.atividades= new HashSet<Atividade>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void add(Atividade atividades){
        this.atividades.add(atividades);
    }

    public void setAtividades(Set<Atividade> atividades) {
        this.atividades = atividades;
    }

    public Set<Atividade> atividades(){
        return atividades;
    }

    public List<String> getAllItems(){
        List<String> ativ = new ArrayList<String>();
        for(Atividade atividade : atividades){
            for(String local : atividade.locais()){
                ativ.add(local);
            }
        }
        return ativ;
    }

    public int totalItems(){
        int total = 0;
        for(Atividade atividade : atividades){
            total += atividade.locais().size();
        }
        return total;
    }
    
    @Override
    public String toString() {
        return "AgenciaTuristica{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", atividades=" + atividades +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AgenciaTuristica that = (AgenciaTuristica) o;
        return Objects.equals(nome, that.nome) &&
                Objects.equals(endereco, that.endereco) &&
                Objects.equals(atividades, that.atividades);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, endereco, atividades);
    }

    


}
