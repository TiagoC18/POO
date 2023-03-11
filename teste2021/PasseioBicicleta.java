package teste2021;

import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class PasseioBicicleta extends Atividade {
    public Set<String> locais = new HashSet<String>();

    public PasseioBicicleta(int numero, String nome) {
        super(numero, nome);
    }

    public PasseioBicicleta(int numero, String nome, String[] locais) {
        super(numero, nome);
        for(String local : locais) {
            this.locais.add(local);
        }
    }

    public Set<String> getLocais() {
        return locais;
    }

    public void addLocal(String local) {
        this.locais.add(local);
    }

    public int totalLocais() {
        return locais.size();
    }

    @Override
    public Collection<String> locais() {
        return locais;
    }

    @Override
    public String toString() {
        return "PasseioBicicleta{" +
                "locais=" + locais +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PasseioBicicleta that = (PasseioBicicleta) o;
        return locais.equals(that.locais);
    }

    @Override
    public int hashCode() {
        return Objects.hash(locais);
    }

    
}
